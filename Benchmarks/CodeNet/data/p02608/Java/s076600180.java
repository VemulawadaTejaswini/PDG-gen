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
        CXYZTriplets solver = new CXYZTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class CXYZTriplets {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            IntCounter count = new IntCounter(n + 1);

            for (int x = 1; x <= 100; x++) {
                for (int y = 1; y <= 100; y++) {
                    for (int z = 1; z <= 100; z++) {
                        int val = x * x + y * y + z * z + x * y + y * z + z * x;
                        if (val <= n)
                            count.incr(val);
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                out.println(count.get(i));
            }
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

    static class IntCounter {
        final int[] freq;
        int distinct = 0;

        public IntCounter(int n) {
            freq = new int[n];
        }

        public IntCounter(int[] array) {
            int n = Util.max(array) + 1;
            freq = new int[n];
            for (int x : array) {
                incr(x);
            }
        }

        public void incr(int key) {
            if (freq[key] == 0)
                distinct++;
            freq[key]++;
        }

        public int get(int key) {
            return freq[key];
        }

    }

    static class Util {
        public static int max(int... x) {
            int max = Integer.MIN_VALUE;
            for (int i : x) {
                max = Math.max(i, max);
            }
            return max;
        }

        private Util() {
        }

    }
}

