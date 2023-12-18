import java.util.Scanner;

// DP 動的計画法
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(scanner.next());
        }

        scanner.nextLine();

        int[] dp = new int[N];

        // 最小化問題なのでMaxValueで初期化
        for (int i = 0; i < N; ++i) dp[i] = Integer.MAX_VALUE;

        // 足場0 のコストは0
        dp[0] = 0;

        for (int i = 1; i < N; ++i) {
            for (int j = 1; j <= K; j++) {
                if (i - j >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
                }
            }
        }

        System.out.println(dp[N - 1]);
    }
}
