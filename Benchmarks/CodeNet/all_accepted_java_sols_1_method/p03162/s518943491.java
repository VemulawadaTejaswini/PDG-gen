import java.util.Scanner;

// DP 動的計画法
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());

        int[][] abc = new int[N][3];
        for (int i = 0; i < N; i++) {
            abc[i][0] = Integer.parseInt(scanner.next());
            abc[i][1] = Integer.parseInt(scanner.next());
            abc[i][2] = Integer.parseInt(scanner.next());
        }

        scanner.nextLine();

        // dp[i]: i日噛んで得られる幸福度の最大
        long[][] dp = new long[N + 1][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == k) continue;
                    dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + abc[i][k]);
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = Math.max(ans, dp[N][i]);
        }

        System.out.println(ans);
    }
}