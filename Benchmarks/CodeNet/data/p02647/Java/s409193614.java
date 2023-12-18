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
        Lamps solver = new Lamps();
        solver.solve(1, in, out);
        out.close();
    }

    static class Lamps {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < K; i++) {
                int[] next = new int[N];
                for (int j = 0; j < N; j++) {
                    next[Math.max(0, j - arr[j])]++;
                    if (j + arr[j] + 1 < N) {
                        next[j + arr[j] + 1]--;
                    }
                }
                int min = next[0];
                for (int a = 1; a < N; a++) {
                    next[a] += next[a - 1];
                    min = Math.min(next[a], min);
                }
                arr = next.clone();
                if (min == N) {
                    break;
                }
            }
            for (int i = 0; i < N; i++) {
                out.println(arr[i]);
            }
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
}

