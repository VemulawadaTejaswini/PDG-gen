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
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CToInfinity solver = new CToInfinity();
        solver.solve(1, in, out);
        out.close();
    }

    static class CToInfinity {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String input = in.next();
            long k = in.nextLong();

            int n = input.length();
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = input.charAt(i) - '0';
            }

            for (int i = 0; i < k; i++) {
                if (s[i] > 1) {
                    out.println(s[i]);
                    return;
                }
            }

            out.println(1);
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

    }
}

