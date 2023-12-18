import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int[] x = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
            }

            long[][][] dp = new long[N + 1][51][2501];
            dp[0][0][0]++;
            for (int i = 0; i < N; i++) {
                for (int n = 0; n < 51; n++) {
                    for (int sum = 0; sum < 2501; sum++) {
                        if (dp[i][n][sum] <= 0) {
                            continue;
                        }
                        dp[i + 1][n + 0][sum + 0] += dp[i][n][sum];
                        dp[i + 1][n + 1][sum + x[i]] += dp[i][n][sum];
                    }
                }
            }

            long count = 0;
            for (int n = 0; n < 51; n++) {
                for (int sum = 0; sum < 2501; sum++) {
                    if (dp[N][n][sum] > 0 && sum > 0 && sum == A * n) {
                        count += dp[N][n][sum];
                    }
                }
            }

            System.out.println(count);
        }
    }
}
