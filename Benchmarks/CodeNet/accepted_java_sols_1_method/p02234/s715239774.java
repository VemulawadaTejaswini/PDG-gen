
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long[] r = new long[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            r[i] = Long.parseLong(scan.next());
            c[i] = Long.parseLong(scan.next());
        }
        scan.close();

        long[][] dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j) {
                    dp[i][j] = Long.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            dp[i][i + 1] = r[i] * c[i] * c[i + 1];
        }

        for (int i = 2; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                for (int k = j; k < j + i; k++) {
                    dp[j][j + i] = Math.min(dp[j][j + i], dp[j][k] + dp[k + 1][j + i] + r[j] * c[k] * c[j + i]);
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }

}
