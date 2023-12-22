

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // https://atcoder.jp/contests/abc134/tasks/abc134_c
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
//        int t = in.nextInt();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int[] right = new int[n];
            int[] left = new int[n];
            right[n-1] = 0;
            left[0] = 0;
            for (int i = n-2; i >= 0; i--) {
                right[i] = Math.max(arr[i+1], right[i+1]);
            }
            for (int i = 1; i < n; i++) {
                left[i] = Math.max(arr[i-1], left[i-1]);
            }
            for (int i = 0; i < n; i++) {
                out.println(Math.max(right[i], left[i]));
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public String nextLine() throws IOException {
            return reader.readLine().trim();
        }
    }
}
