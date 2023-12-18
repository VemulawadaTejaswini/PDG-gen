import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    int n, m;
    double[][] gl;
    double[][] dp;
    boolean init() {
        n = sc.nextInt();
        m = sc.nextInt();
        if (n == 0 && m == 0) return false;
        gl = new double[n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++)
                gl[i][j] = sc.nextDouble();
        dp = new double[n][m+1];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        return true;
    }
    double solve(double g, int prev, int rem) {
//        System.out.printf("%d %d: %f\n", prev, rem, g);
        if (rem == 0) return g;
        if (dp[prev][rem] != -1) return g * dp[prev][rem];
        double max = 0.0;
        for (int i = 0; i < n; i++) 
            max = Math.max(max, solve(gl[prev][i], i, rem-1));
        dp[prev][rem] = max;
        return g * max;
    }
    void run() {
        while (init()) {
            double max = 0;
            for (int i = 0; i < n; i++) 
                max = Math.max(max, solve(1.0, i, m-1));
            System.out.printf("%.2f\n", Math.round(max*100)/100.0);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}