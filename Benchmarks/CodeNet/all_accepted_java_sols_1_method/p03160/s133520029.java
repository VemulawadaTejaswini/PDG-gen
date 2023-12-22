import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());

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
            // 一つ前から飛んだ場合
            int diff = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
            int diff2 = Integer.MAX_VALUE;
            if (i > 1) {
                // 二つ前から飛んだ場合
                diff2 = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
            }
            dp[i] = Math.min(diff, diff2);
        }

        System.out.println(dp[N - 1]);
    }
}
