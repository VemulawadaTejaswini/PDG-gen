import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FKnapsackForAllSubsets solver = new FKnapsackForAllSubsets();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSubsets {
        private static final long MOD = 998244353;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int s = in.nextInt();
            int[] a = in.nextArrInt(n);
            long res = solveMe(n, s, a);
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private long solveMe(int n, int s, int[] a) {
            long[] dp = new long[s + 1];
            long[] newDp = new long[s + 1];
            long[] res = new long[s + 1];
            dp[0] = 1;
            for (int i = 0; i < n; i++) {
                newDp = arraysCopyOfShallow(dp);
                for (int j = 0; j <= s; j++) {
                    newDp[j] += dp[j];
                    newDp[j] %= MOD;
                }
                for (int j = a[i]; j <= s; j++) {
                    newDp[j] += dp[j - a[i]];
                    newDp[j] %= MOD;
                }

                dp = newDp;
                //d(s("i", i, "a[i]", a[i], "dp", stringMeDeb(toArray(dp))));
            }
            return newDp[s];
        }

        public static long[] arraysCopyOfShallow(long[] a) {
            return Arrays.copyOf(a, a.length);
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextArrInt(int n) {
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++)
                a[i] = nextInt();
            return a;
        }

    }
}

