//package Atcoder_dp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = scanner.nextInt();
        }
        if(n==0){
            System.out.println(0);
            return;
        }
        int pp = 0;
        int p = Math.abs(h[0]-h[1]);
        for(int i = 2; i < n; i++){
            int aux = Math.min(pp+Math.abs(h[i]-h[i-2]), p+Math.abs(h[i]-h[i-1]));
            pp = p;
            p = aux;
        }
        System.out.println(p);
    }
}
