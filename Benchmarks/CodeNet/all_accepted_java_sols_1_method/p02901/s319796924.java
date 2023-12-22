
import java.util.Scanner;

public class Main {

    static int inf = 1000000000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int[] a = new int[m];
        int[][] c = new int[m][];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            c[i] = new int[b];
            for (int j = 0; j < b; j++) {
                c[i][j] = Integer.parseInt(scan.next());
            }
        }
        scan.close();

        int[][] dp = new int[m + 1][1 << n];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j < (1 << n); j++) {
                dp[i][j] = inf;
            }
        }
        dp[0][0] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < (1 << n); j++) {
                if (dp[i][j] == inf) {
                    continue;
                }

                // 選ばない
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);

                // 選ぶ
                int after = j;
                for (int k : c[i]) {
                    after |= (1 << (k - 1));
                }
                dp[i + 1][after] = Math.min(dp[i + 1][after], dp[i][j] + a[i]);
            }
        }

        if (dp[m][(1 << n) - 1] != inf) {
            System.out.println(dp[m][(1 << n) - 1]);
        } else {
            System.out.println(-1);
        }
    }

}
