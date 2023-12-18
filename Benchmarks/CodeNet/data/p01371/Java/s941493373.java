import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0) break;

            int[][] t = new int[n][n + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + 1; j++) {
                    t[i][j] = scan.nextInt();
                }
            }

            int[] dp = new int[1 << n];
            for (int i = 0; i < (1 << n); i++) {
                dp[i] = 100000000;
            }
            dp[0] = 0;

            for (int i = 0; i < (1 << n); i++) {
                for (int j = 0; j < n; j++) {
                    if ((i >> j) % 2 == 1) continue;
                    int minT = t[j][0];
                    for (int k = 0; k < n; k++) {
                        if (((i >> k) % 2 == 1) && (minT > t[j][k + 1])) {
                            minT = t[j][k + 1];
                        }
                    }
                    if (dp[i | (1 << j)] > dp[i] + minT) {
                        dp[i | (1 << j)] = dp[i] + minT;
                    }
                }
            }

            System.out.println(dp[(1 << n) - 1]);
        }
    }
}