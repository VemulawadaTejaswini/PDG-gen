import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[][] dp = new double[n + 1][n + 2];

        for (int i = 1; i <= n; i++) {
            double p = Double.parseDouble(st.nextToken());

            if (i == 1) {
                dp[1][0] = 1 - p;
                dp[1][1] = p;
            }
            else {
                dp[i][0] = dp[i - 1][0] * (1 - p);

                for (int j = 1; j < i; j++) {
                    dp[i][j] = dp[i - 1][j] * (1 - p) + dp[i - 1][j - 1] * p;
                    dp[i][j + 1] = dp[i - 1][j] * p + dp[i - 1][j + 1] * (1 - p);
                }
            }
        }

        double sum = 0;

        for (int i = n / 2 + 1; i <= n; i++)
            sum += dp[n][i];

        System.out.println(sum);
    }
}
