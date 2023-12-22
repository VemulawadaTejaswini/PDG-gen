import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] weights = new int[n];
        int[] value = new int[n];
        for (int i=0; i<n; i++) {
            weights[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        long[][] dp = new long[n+1][w+1];
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (weights[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], value[i-1] + dp[i-1][j-weights[i-1]]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}