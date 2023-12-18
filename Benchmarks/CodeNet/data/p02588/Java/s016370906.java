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
        AIntegerProduct solver = new AIntegerProduct();
        solver.solve(1, in, out);
        out.close();
    }

    static class AIntegerProduct {
        private static final int K = 9;
        private long[] tens;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            tens = new long[K + 1];
            tens[0] = 1;
            for (int i = 1; i <= K; i++) {
                tens[i] = tens[i - 1] * 10;
            }

            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = read(in);
            }

            long[][] count = new long[2 * K + 1][2 * K + 1]; // [#twos][#fives]
            for (long x : a) {
                int t = 0;
                while (x % 2 == 0) {
                    t++;
                    x /= 2;
                }
                int f = 0;
                while (x % 5 == 0) {
                    f++;
                    x /= 5;
                }
                t = Math.min(t, 2 * K);
                f = Math.min(f, 2 * K);
                count[t][f]++;
            }

            long answer = 0;
            for (int i = 0; i < count.length; i++) {
                for (int j = 0; j < count.length; j++) {
                    for (int x = 0; x < count.length; x++) {
                        for (int y = 0; y < count.length; y++) {
                            if (i + j < 2 * K || x + y < 2 * K)
                                continue;
                            answer += count[i][x] * count[j][y];
                            if (i == j && x == y)
                                answer -= count[i][x];
                        }
                    }
                }
            }
            answer /= 2;

            out.println(answer);
        }

        private long read(InputReader in) {
            String s = in.next();
            int i = s.indexOf('.');
            if (i == -1)
                return Long.parseLong(s) * tens[K];
            long whole = Long.parseLong(s.substring(0, i)) * tens[K];
            long rest = Long.parseLong(s.substring(i + 1)) * tens[K - (s.length() - (i + 1))];
            return whole + rest;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

