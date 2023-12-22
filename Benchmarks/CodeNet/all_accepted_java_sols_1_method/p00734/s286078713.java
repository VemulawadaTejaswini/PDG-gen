
// package com.company;

import java.util.*;
import java.io.*;

public class Main {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        String ans = "";
        int n = input.nextInt();
        int m = input.nextInt();
        while (n > 0 || m > 0) {

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n ; i ++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < m ; i ++) {
                arr2[i] = input.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int sum1 = 0;
            for (int i= 0; i < n; i ++) {
                sum1 += arr1[i];
            }
            int sum2 = 0;
            for (int i= 0; i < m; i ++) {
                sum2 += arr2[i];
            }

            int dis = sum1 - sum2;

            if (Math.abs(dis) % 2 == 1) {
                ans += "-1\n";
            } else  {
                dis = dis / 2;
               
                boolean check = false;
                for (int i =0 ; i < n; i ++) {
                    for (int j = 0; j < m; j++) {
                        
                        if (arr1[i] - arr2[j] == dis) {
                            ans += arr1[i] + " " + arr2[j] + "\n";
                            check = true;
                            break;
                        }
                    }
                    if (check) break;
                }
                if (!check) ans += "-1\n";
            }
            n = input.nextInt();
            m = input.nextInt();
        }
        
        System.out.println(ans.trim());
    }
}
