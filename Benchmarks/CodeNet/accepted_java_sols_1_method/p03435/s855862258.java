//package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][]arr = new int[3][3];
        for(int i = 0; i<3; i++)for(int j = 0; j<3; j++)arr[i][j] = in.nextInt();
        for(int i = 0; i<=100; i++){
            int[]a = new int[3];
            int[]b = new int[3];
            boolean ok = true;
            for(int j = 0; j<3; j++) a[j] = arr[j][0] - i;
            for(int j = 0; j<3; j++) b[j] = arr[0][j] - a[0];
            for(int k = 0; k<3; k++){
                for(int j = 0; j<3; j++){
                    if(arr[k][j] != a[k] + b[j])ok = false;
                }
            }
            if(ok){
                System.out.println("Yes");return;
            }
            a = null;
            b = null;
        }
        System.out.println("No");
    }
}
