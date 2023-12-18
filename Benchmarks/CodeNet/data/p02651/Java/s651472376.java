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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A_XorBattle solver = new A_XorBattle();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_XorBattle {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int numTests = in.nextInt();
            for (int test = 0; test < numTests; test++) {
                int n = in.nextInt();
                long[] a = new long[n + 1];
                for (int i = 0; i < n; i++) {
                    a[i] = in.nextLong();
                }
                char[] s = in.next().toCharArray();
                s = Arrays.copyOf(s, n + 1);
                s[n] = '0';
                boolean all = true;
                for (int bit = 0; bit < 64; bit++) {
                    boolean[][] canWinWith = new boolean[2][n + 1];
                    canWinWith[0][n] = true;
                    for (int i = n - 1; i >= 0; i--) {
                        for (int cur = 0; cur < 2; cur++) {
                            for (int use = 0; use < 2; use++) {
                                int nxt = cur;
                                if (use == 1) {
                                    nxt = (int) (cur ^ ((a[i] >> bit) & 1));
                                }
                                if (s[i] == s[i + 1]) {
                                    canWinWith[cur][i] |= canWinWith[nxt][i + 1];
                                } else {
                                    canWinWith[cur][i] |= !canWinWith[nxt][i + 1];
                                }
                            }
                        }
                    }
                    boolean canZ = canWinWith[0][0] == (s[0] == '0');
                    all = all && canZ;
                }
                out.println(all ? 0 : 1);
            }
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

