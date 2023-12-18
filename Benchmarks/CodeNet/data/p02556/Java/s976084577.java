import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.SplittableRandom;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn Agrawal (coderbond007)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EDistMax solver = new EDistMax();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDistMax {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            in.nextIntArrays(x, y);
            int[] vals = new int[n];
            for (int i = 0; i < n; ++i) {
                vals[i] = x[i] + y[i];
            }
            ArrayUtils.sort(vals);
            out.println(vals[n - 1] - vals[0]);
        }

    }

    static class FastScanner {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastScanner(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream), 32768);
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

        public void nextIntArrays(int[]... arrays) {
            for (int i = 0; i < arrays[0].length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = nextInt();
                }
            }
        }

    }

    static class ArrayUtils {
        public static int[] sort(int[] a) {
            a = shuffle(a, new SplittableRandom());
            Arrays.sort(a);
            return a;
        }

        public static int[] shuffle(int[] a, SplittableRandom gen) {
            for (int i = 0, n = a.length; i < n; i++) {
                int ind = gen.nextInt(n - i) + i;
                int d = a[i];
                a[i] = a[ind];
                a[ind] = d;
            }
            return a;
        }

    }
}

