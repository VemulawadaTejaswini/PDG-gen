
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adly
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int w = in.nextInt();
        int[][] a = new int[t][2];
        for (int i = 0; i < t; i++) {
            a[i][0] = in.nextInt();
            a[i][1] = in.nextInt();
        }
        long[] dp = new long[w + 1];
        for (int i = 0; i < t; i++) {
            for (int cap = w; cap >= a[i][0]; cap--) {
                dp[cap] = Math.max(dp[cap], dp[cap - a[i][0]] + a[i][1]);
            }
        }
        System.out.println(dp[w]);
    }
}
