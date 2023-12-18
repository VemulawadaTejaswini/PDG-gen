
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(scan.next());
            if (n == 0) {
                break;
            }

            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = Integer.parseInt(scan.next());
            }

            int dp[][] = new int[n + 1][n + 1];
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j + i <= n; j++) {
                    for (int k = j; k <= j + i; k++) {
                        dp[j][j + i] = Math.max(dp[j][j + i], dp[j][k] + dp[k][j + i]);
                    }

                    if (dp[j + 1][j + i - 1] == i - 2 && Math.abs(w[j] - w[j + i - 1]) <= 1) {
                        dp[j][j + i] = i;
                    }
                }
            }

            System.out.println(dp[0][n]);
        }
        scan.close();
    }

}

