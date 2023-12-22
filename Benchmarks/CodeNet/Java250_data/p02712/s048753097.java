import java.io.*;
import java.sql.PreparedStatement;
import java.util.*;

public class Main {
    private static class Task {
        public void solve(InputReader in, PrintWriter out) {
            long n = in.nextInt();
            long a = n        * (n + 1)           / 2;
            long b = (n / 3)  * (n - n % 3  + 3)  / 2;
            long c = (n / 5)  * (n - n % 5  + 5)  / 2;
            long d = (n / 15) * (n - n % 15 + 15) / 2;
            out.println(a - b - c + d);
        }
    }

    private static class InputReader {
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str;
            try {
                str = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new File("in.txt").exists() ? new FileInputStream("in.txt") : System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
}
