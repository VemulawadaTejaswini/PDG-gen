import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        long[] dp = new long[W + 1]; // default 0ed out

        long[][] items = new long[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            items[i][0] = Long.parseLong(st.nextToken());
            items[i][1] = Long.parseLong(st.nextToken());
        }

        // key idea: instead of having to refer to the previous row, simply overwrite the current
        // row but starting from the right (because we need to look backwards)
        for (int i = 1; i < N + 1; i++) {
            for (int j = W; j >= 0; j--) {
                if (j < items[i - 1][0]) {

                } else {
                    dp[j] = Math.max(dp[j], dp[(int) (j - items[i - 1][0])] + items[i - 1][1]);
                }
            }
        }



        System.out.println(dp[W]);
    }
}