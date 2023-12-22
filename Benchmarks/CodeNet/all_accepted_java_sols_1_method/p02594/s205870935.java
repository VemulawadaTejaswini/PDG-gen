//package com.company;

//import javafx.scene.chart.BarChart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//
        int n=Integer.parseInt(read.readLine());
        if(n>=30)
            System.out.println(("Yes"));
        else
            System.out.println("No");

    }

}

