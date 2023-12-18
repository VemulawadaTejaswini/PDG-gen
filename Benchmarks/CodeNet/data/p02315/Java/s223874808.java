import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int[] v = new int[N];
        int[] w = new int[N];

        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        // dp[i+1][j]: インデックスiまでの品物から, 重さ制限jで選んだ時の, 価値の和の最大値
        int[][] dp = new int[N+1][W+1];

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= W; j++) {
                if (w[i] > j) {
                    dp[i+1][j] = dp[i][j];
                } else {
                    dp[i+1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
                }
            }
        }

        System.out.println(dp[N][W]);
    }
}
