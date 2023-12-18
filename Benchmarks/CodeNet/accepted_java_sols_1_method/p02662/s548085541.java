import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MOD = 998244353;
        final var sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int S = Integer.parseInt(sc.next());
        final int[] A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        final int[] dp = new int[S + 1];
        dp[0] = 1;
        for (int i = 1; i<= N; i++) {
            for (int k = S; k >= 0; k--) {
                dp[k] += dp[k];
                if (dp[k] >= MOD) dp[k] -= MOD;
                if (k - A[i] >= 0) {
                    dp[k] += dp[k - A[i]];
                    if (dp[k] >= MOD) dp[k] -= MOD;
                }
            }
        }
        System.out.println(dp[S]);
    }
}
