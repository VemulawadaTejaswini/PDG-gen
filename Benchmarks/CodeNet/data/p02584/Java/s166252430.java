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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CWalkingTakahashi solver = new CWalkingTakahashi();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWalkingTakahashi {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long x = in.nextLong();
            long k = in.nextLong();
            long d = in.nextLong();

            out.println(f(Math.abs(x), k, d));
        }

        private long f(long x, long k, long d) {
            long p = x / d; // moves while remaining non-negative

            if (p >= k) {
                return x - k * d;
            }

            x -= p * d;
            k -= p;

            if (k % 2 == 0)
                return x;
            return Math.abs(x - d);
        }

    }

    static class InputReader {
        public final BufferedReader reader;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

