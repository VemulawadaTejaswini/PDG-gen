import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            x[i] = sc.nextInt();
        }

        long[][][] dp = new long[N + 1][N + 1][N * A + 1];
        for (int i = 0; i < N; ++i) {
            dp[i][0][0] = 1;
        }

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= i; ++j) {
                for (int k = 1; k <= N * A; ++k) {
                    if (k < x[i]) {
                        dp[i][j][k] = dp[i - 1][j][k];
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i]];
                    }
                }
            }
        }

        long ans = 0;
        for (int j = 1; j <= N; ++j) {
            ans += dp[N][j][j * A];
        }

        System.out.println(ans);
    }
}
