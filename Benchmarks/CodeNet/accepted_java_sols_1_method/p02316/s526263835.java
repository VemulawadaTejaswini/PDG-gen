
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static int[][] dp;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] v = new int[n];
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        dp = new int[n+1][W+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < W+1; j++) {
                int u = dp[i][j];
                if((j > w[i] && dp[i+1][j - w[i]] != 0) || j - w[i] == 0) {
                    dp[i+1][j] = Math.max(u, dp[i+1][j-w[i]] + v[i]);
                }
                else {
                    dp[i+1][j] = dp[i][j];
                }
            }
        }
        System.out.println(IntStream.of(dp[n]).max().getAsInt());
    }
}

