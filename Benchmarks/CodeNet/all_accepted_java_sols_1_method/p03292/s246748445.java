// package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        // int A1 = sc.nextInt();
        Arrays.sort(arr);

        System.out.println(Math.abs(arr[1] - arr[0]) + Math.abs(arr[2] - arr[1]));
    }
}