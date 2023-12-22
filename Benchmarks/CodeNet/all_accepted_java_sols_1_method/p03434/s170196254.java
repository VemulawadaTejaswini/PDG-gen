//package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int a = 0,b = 0;
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        if(n%2==0) {
            for (int i = 1; i < n; i += 2) {
                a += arr[i];
            }
            for (int i = 0; i < n - 1; i += 2)
                b += arr[i];
            System.out.println(a-b);
        }
        else{
            for (int i = 0; i < n; i += 2) {
                a += arr[i];
            }
            for (int i = 1; i < n - 1; i += 2)
                b += arr[i];
            System.out.println(a-b);
        }
    }
}
