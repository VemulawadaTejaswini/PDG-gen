import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.function.IntUnaryOperator;
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
        DAlterAltar solver = new DAlterAltar();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAlterAltar {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] c = in.next().toCharArray();

            int[] w = new int[n + 1];
            for (int i = 0; i < n; i++) {
                w[i + 1] = w[i] + (c[i] == 'W' ? 1 : 0);
            }

            IntUnaryOperator moves = left -> {

                int wrongLeft = w[left];
                int wrongRight = (n - left) - (w[n] - w[left]);

                return wrongLeft + wrongRight - Math.min(wrongLeft, wrongRight);
            };

            int answer = BinarySearch.ternarySearch(moves, 0, n);
            out.println(moves.applyAsInt(answer));
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

    static class BinarySearch {
        public static int ternarySearch(IntUnaryOperator f, int left, int right) {
            while (true) {
                int t = (right - left) / 3;
                if (t == 0) {
                    int answer = left;
                    int opt = f.applyAsInt(left);
                    for (int x = left + 1; x <= right; x++) {
                        int candidate = f.applyAsInt(x);
                        if (candidate < opt) {
                            answer = x;
                            opt = candidate;
                        }
                    }
                    return answer;
                }
                int a = left + t;
                int b = right - t;
                if (f.applyAsInt(a) > f.applyAsInt(b)) {
                    left = a;
                } else {
                    right = b;
                }
            }
        }

    }
}

