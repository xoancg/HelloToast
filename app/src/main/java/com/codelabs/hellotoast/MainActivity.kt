package com.codelabs.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mCount : Int = 0
    private lateinit var mShowCount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mShowCount = findViewById(R.id.tvShowCount)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show()

    }

    fun countUp(view: View) {
        ++mCount
        mShowCount.setText(mCount.toString())
    }
}