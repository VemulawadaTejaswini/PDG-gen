import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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

        public static long longest(int n, int k, int[] a) {
            long[] dp = new long[n];
            long[] max_length = new long[10000000];
            for (int i = 0; i < n; i++) {
                int cur = a[i];
                int lower = Math.max(0, cur - k);
                int upper = Math.min(Integer.MAX_VALUE, cur + k);
                for (int j = lower; j < upper + 1; j++) {
                    dp[i] = Math.max(dp[i], max_length[j] + 1);
                }
                max_length[cur] = Math.max(dp[i], max_length[cur]);
            }
            long ans = 0;
            for (long i : dp) ans = Math.max(i, ans);
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

