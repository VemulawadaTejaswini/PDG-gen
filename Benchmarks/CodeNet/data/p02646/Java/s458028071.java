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
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BTag solver = new BTag();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTag {
        private static final String NO = "NO";
        private static final String YES = "YES";

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a = in.nextInt(), fast = in.nextInt();
            long b = in.nextInt(), slow = in.nextInt();
            long t = in.nextInt();

            if (fast <= slow) {
                out.println(NO);
                return;
            }

            if ((fast - slow) * t >= Math.abs(a - b)) {
                out.println(YES);
                return;
            }

            out.println(NO);
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

