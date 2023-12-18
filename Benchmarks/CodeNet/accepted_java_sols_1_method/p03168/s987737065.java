import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(f.readLine());

        double[] p = new double[N];
        for (int i = 0; i < N; i++) {
            p[i] = Double.parseDouble(st.nextToken());
        }
        // note that the probabilities of tails are 1 - p[i]


        double[][] dp = new double[N+1][N+1];

        dp[0][0] = 1;
        for (int _i = 1; _i < N+1; _i++) {
            int i = _i - 1;
            // populate the entire first row
            dp[0][_i] = dp[0][_i-1] * (1 - p[i]);
        }

        // last item in the 1st row is 0 Heads in N Rounds

        for (int _i = 1; _i < N+1; _i++) {
            // int i = _i - 1;

            for (int _j = 1; _j < N+1; _j++) {
                int j = _j - 1;
                dp[_i][_j] = dp[_i-1][_j-1] * p[j] + dp[_i][_j-1] * (1 - p[j]);
            }
        }

        // sum up all with more than N/2 heads
        double res = 0;
        for (int i = N/2 + 1; i < N + 1; i++) {
            res += dp[i][N]; // the last column
        }

        /*for (double[] i : dp) {
            for (double j : i) {
                System.out.print(String.valueOf(j) + " ");
            }
            System.out.println();
        } */

        System.out.println(res);


    }
}