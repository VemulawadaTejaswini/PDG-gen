package DP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int a[] = new int[N];
        if (N==0) {
            System.out.println(X);
            return;
        }
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < N - 1&&N>0; i++) {
            if (Math.abs(a[i + 1] - a[i]) > 0) {
                for (int j = a[i] + 1; j < a[i + 1]; j++) {
                    b.add(j);
                }
            }

        }
        b.add(X);
        Collections.sort(b);
        int j=0;
        for (int i=0;i<=b.size();i++){
            if (b.contains(X)){
              j=i;
                System.out.println(b.get(j+1));
                break;
            }
        }
    }
}
