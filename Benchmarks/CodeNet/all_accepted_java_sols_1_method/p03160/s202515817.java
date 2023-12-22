import java.util.Scanner;

/**
 * Frog 1
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] H = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                H[i] = sc.nextInt();
            }

            long[] dp = new long[N + 1];

            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i - 1] + Math.abs(H[i] - H[i - 1]);
                if (i >= 3) {
                    dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(H[i] - H[i - 2]));
                }
            }

            System.out.println(dp[N]);
        }
    }

}
