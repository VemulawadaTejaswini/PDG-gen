import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BExtension solver = new BExtension();
        solver.solve(1, in, out);
        out.close();
    }

    static class BExtension {
        NumberTheory.Mod998 mod = new NumberTheory.Mod998();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();

            long[][] dp = new long[c + 1][d + 1];
            dp[a][b] = 1;
            for (int i = a + 1; i <= c; i++) {
                dp[i][b] = mod.mult(dp[i - 1][b], b);
            }
            for (int j = b + 1; j <= d; j++) {
                dp[a][j] = mod.mult(dp[a][j - 1], a);
            }

            for (int i = a + 1; i <= c; i++) {
                for (int j = b + 1; j <= d; j++) {
                    dp[i][j] = mod.add(mod.mult(dp[i][j - 1], i), mod.mult(dp[i - 1][j], j), mod.mult(dp[i - 1][j - 1], i - 1, j - 1, mod.negative(1)));
                }
            }

            out.println(dp[c][d]);
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

    static class NumberTheory {
        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<Long> factorial = new ArrayList<>();
            ArrayList<Long> invFactorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
                invFactorial.add(1L);
            }

            public long add(long... x) {
                long r = 0;
                for (long i : x)
                    r = add(r, i);
                return r;
            }

            public long add(long a, long b) {
                long v = a + b;
                return v < modulus() ? v : v - modulus();
            }

            public long mult(long... x) {
                long r = 1;
                for (long i : x)
                    r = mult(r, i);
                return r;
            }

            public long mult(long a, long b) {
                return (a * b) % modulus();
            }

            public long negative(long x) {
                return x == 0 ? 0 : modulus() - x;
            }

        }

        public static class Mod998 extends NumberTheory.Modulus<NumberTheory.Mod998> {
            public long modulus() {
                return 998_244_353L;
            }

        }

    }
}

