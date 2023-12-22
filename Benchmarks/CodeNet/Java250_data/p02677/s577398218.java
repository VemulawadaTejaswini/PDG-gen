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
        CColon solver = new CColon();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColon {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            double a = in.nextInt(), b = in.nextInt();
            double h = in.nextInt(), m = in.nextInt();

            double x1 = a * Math.cos((h + m / 60) / 12 * 2 * Math.PI);
            double y1 = a * Math.sin((h + m / 60) / 12 * 2 * Math.PI);
            double x2 = b * Math.cos(m / 60 * 2 * Math.PI);
            double y2 = b * Math.sin(m / 60 * 2 * Math.PI);

            out.println(Util.formatDouble(Math.hypot(x1 - x2, y1 - y2)));
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

    static class Util {
        public static String formatDouble(double x) {
            return String.format("%.15f", x);
        }

        private Util() {
        }

    }
}

