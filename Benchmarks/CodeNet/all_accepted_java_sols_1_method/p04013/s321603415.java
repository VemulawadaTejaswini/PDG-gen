import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        long[][][] dp = new long[n + 1][n + 1][2501];
        dp[0][0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= 2500; k++) {
                    if (j > 0 && (k - ary[i - 1]) >= 0) {
                        dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - ary[i - 1]];
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k];
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += dp[n][i][i * a];
        }
        System.out.println(ans);
    }
}