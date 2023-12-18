
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int[] dp = new int[n + 1];

        dp[1] = 1;
        for (int i = 1; i < n; i++) {
            int min = dp[i] + 1;
            for (int j = 0; j < m; j++) {
                if (i + 1 - c[j] >= 0 && min > dp[i + 1 - c[j]] + 1) {
                    min = dp[i + 1 - c[j]] + 1;
                }
            }
            dp[i + 1] = min;
        }

        System.out.println(dp[n]);
    }

}

