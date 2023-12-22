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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BResale solver = new BResale();
        solver.solve(1, in, out);
        out.close();
    }

    static class BResale {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int v[] = new int[n];
            int c[] = new int[n];
            long ans = 0;
            for (int i = 0; i < n; i++) v[i] = in.nextInt();
            for (int i = 0; i < n; i++) c[i] = in.nextInt();
            for (int i = 0; i < n; i++) {
                if (v[i] > c[i]) ans += v[i] - c[i];
            }
            out.println(ans);

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

