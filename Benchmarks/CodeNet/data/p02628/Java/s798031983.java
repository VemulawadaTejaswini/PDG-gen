/*
package com.company.practice;
*/

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

import static java.lang.Character.isUpperCase;

public class Main {
    public static Scanner key = new Scanner(System.in);
    public static void solveJuice()
    {
        int n = key.nextInt();
        int k = key.nextInt();
        int[] f = new int[n];
        for(int i = 0;i <= n-1;i++)
            f[i] = key.nextInt();
        Arrays.sort(f,0,n);
        int sum = 0;
        for(int j =0;j <= k-1;j++)
        {
            sum += f[j];
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        solveJuice();
    }
}
