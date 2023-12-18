import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.SplittableRandom;
import java.math.BigInteger;
import java.io.BufferedReader;
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
        B_FirstSecond solver = new B_FirstSecond();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_FirstSecond {
        SplittableRandom random = new SplittableRandom(0);
        long MOD;
        long X;
        final int N = (int) (1e6 + 100);
        long[] pow;

        {
            MOD = (long) 1e9 + random.nextInt((int) 1e8);
            while (!BigInteger.valueOf(MOD).isProbablePrime(100)) {
                ++MOD;
            }
            X = 1 + random.nextInt((int) (MOD - 1));

            pow = new long[N + 1];
            pow[0] = 1;
            for (int i = 1; i < pow.length; i++) {
                pow[i] = X * pow[i - 1] % MOD;
            }
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[][] s = new char[n][];
            StringHasher[] h = new StringHasher[n];
            Set<Long> fullStrings = new HashSet<>();
            for (int i = 0; i < n; i++) {
                s[i] = in.next().toCharArray();
                h[i] = new StringHasher(s[i]);
                long fh = h[i].get(0, s[i].length - 1);
                if (fullStrings.contains(fh)) {
                    throw new AssertionError();
                }
                fullStrings.add(fh);
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                boolean[] got = new boolean[26];
                for (int j = 0; j < s[i].length; j++) {
                    got[s[i][j] - 'a'] = true;
                    for (int c = 0; c < 26; c++) {
                        if (!got[c]) {
                            continue;
                        }
                        long suff = h[i].get(j + 1, s[i].length - 1);
                        int suffLen = s[i].length - j - 1;
                        long full = ((c + 'a') * pow[suffLen] + suff) % MOD;
                        if (fullStrings.contains(full)) {
                            ++ans;
                        }
                    }
                }
            }

            out.println(ans - n);
        }

        class StringHasher {
            long[] h;

            StringHasher(char[] s) {
                int n = s.length;
                h = new long[n + 1];
                for (int i = 0; i < n; i++) {
                    h[i + 1] = (X * h[i] + s[i]) % MOD;
                }
            }

            long get(int l, int r) {
                long res = (h[r + 1] - pow[r - l + 1] * h[l]) % MOD;
                if (res < 0) {
                    res += MOD;
                }
                return res;
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

    }
}

