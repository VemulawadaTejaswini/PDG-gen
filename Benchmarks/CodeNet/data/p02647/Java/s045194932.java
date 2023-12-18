import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Random;
import java.io.InputStreamReader;
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
        CLamps solver = new CLamps();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLamps {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            int[] a = in.readIntArray(n);

            for (int i = 0; i < k; i++) {
                update(a);
                if (Util.min(a) == n) {
                    break;
                }
            }

            out.println(Util.join(a));
        }

        private void update(int[] a) {
            final int n = a.length;
            int[] starts = new int[n];
            int[] ends = new int[n];
            for (int i = 0; i < n; i++) {
                starts[i] = Math.max(0, i - a[i]);
                ends[i] = Math.min(a.length - 1, i + a[i]) + 1;
            }
            Util.safeSort(starts);
            Util.safeSort(ends);

            int[] b = new int[a.length];
            int count = 0;
            for (int i = 0, s = 0, e = 0; i < a.length; i++) {
                while (s < n && starts[s] <= i) {
                    count++;
                    s++;
                }
                while (e < n && ends[e] <= i) {
                    count--;
                    e++;
                }

                b[i] = count;
            }
            System.arraycopy(b, 0, a, 0, a.length);
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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class Util {
        public static String join(int... i) {
            StringBuilder sb = new StringBuilder();
            for (int o : i) {
                sb.append(o);
                sb.append(" ");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        }

        public static int min(int... x) {
            int min = Integer.MAX_VALUE;
            for (int i : x) {
                min = Math.min(i, min);
            }
            return min;
        }

        public static void safeSort(int[] x) {
            shuffle(x);
            Arrays.sort(x);
        }

        public static void shuffle(int[] x) {
            Random r = new Random();

            for (int i = 0; i <= x.length - 2; i++) {
                int j = i + r.nextInt(x.length - i);
                swap(x, i, j);
            }
        }

        public static void swap(int[] x, int i, int j) {
            int t = x[i];
            x[i] = x[j];
            x[j] = t;
        }

        private Util() {
        }

    }
}

