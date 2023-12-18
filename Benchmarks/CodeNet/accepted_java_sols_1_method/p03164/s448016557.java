import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n + 1][100001]; int sum = 0; Arrays.fill(dp[0], 1000000000);

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()); sum += v;
            Arrays.fill(dp[i], 1000000000); dp[i][v] = weight;

            for (int j = 1; j <= sum; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);

                if (j >= v)
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - v] + weight);
            }
        }

        int ind = sum;

        while (ind > 0 && (dp[n][ind] > w || dp[n][ind] == 0))
            ind--;

        System.out.println(ind);
    }
}
