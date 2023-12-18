import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.IntPredicate;
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
        CTsundoku solver = new CTsundoku();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTsundoku {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            long k = in.nextLong();
            long[] a = in.readLongArray(n);
            long[] b = in.readLongArray(m);

            long[] A = Util.prefixSum(a);
            long[] B = Util.prefixSum(b);

            int answer = 0;
            for (int i = 0; i < A.length; i++) {
                long minutes = k - A[i];
                if (minutes < 0)
                    continue;
                int j = BinarySearch.binarySearch(index -> {
                    if (index >= B.length)
                        return true;
                    if (index < 0)
                        return false;
                    return B[index] > minutes;
                });
                j--;
                answer = Math.max(answer, i + j);
            }

            out.println(answer);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] readLongArray(int n) {
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextLong();
            }
            return x;
        }

    }

    static class Util {
        private Util() {
        }

        public static long[] prefixSum(long[] x) {
            long[] s = new long[x.length + 1];
            for (int i = 0; i < x.length; i++) {
                s[i + 1] = s[i] + x[i];
            }
            return s;
        }

    }

    static class BinarySearch {
        public static int binarySearch(IntPredicate bigEnough) {
            int tooSmall = 0, tooBig;
            if (bigEnough.test(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.test(tooBig); tooBig *= 2)
                ;

            if (!bigEnough.test(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = tooSmall + (tooBig - tooSmall) / 2;
                if (!bigEnough.test(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

