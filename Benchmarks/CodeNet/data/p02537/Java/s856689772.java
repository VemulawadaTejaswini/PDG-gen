import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFlatSubsequence solver = new DFlatSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFlatSubsequence {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            out.println(longest(n, k, a));

        }

        public static int longest(int n, int k, int[] a) {
            int[] dp = new int[n];
            Arrays.fill(dp, 0);
            int[] max_length = new int[300006];
            Arrays.fill(max_length, 0);
            for (int i = 0; i < n; i++) {
                int cur = a[i];
                int lower = Math.max(0, cur - k);
                int upper = Math.min(300000, cur + k);
                for (int j = lower; j < upper + 1; j++) {
                    dp[i] = Math.max(dp[i], max_length[j] + 1);
                }
                max_length[cur] = Math.max(dp[i], max_length[cur]);
            }
            int ans = 0;
            for (int i : dp) ans = Math.max(i, ans);
            return ans;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

