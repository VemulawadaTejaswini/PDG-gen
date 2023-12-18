import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            final int N = s.nextInt();
            final int[] dp = new int[N + 1];
            Arrays.fill(dp, N);
            dp[0] = 0;
            for (int i = 0; i < N; i++) {
                if (dp[i] == N) continue;
                for (int j = 9; i + j <= N; j *= 9) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
                for (int j = 6; i + j <= N; j *= 6) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
            }
            for (int i = Math.min(N, 6); i > 0; i--) {
                dp[N] = Math.min(dp[N - i] + i, dp[N]);
            }
            System.out.println(dp[N]);
        }
    }
}
