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
        CTakahashisInformation solver = new CTakahashisInformation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTakahashisInformation {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = 3;
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = in.nextInt();
                }
            }

            int[] a = {c[0][0],
                       c[1][0],
                       c[2][0]};
            int[] b = {0,
                       c[0][1] - c[0][0],
                       c[0][2] - c[0][0]};

            boolean answer = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    answer &= c[i][j] == a[i] + b[j];
                }
            }

            out.println(answer ? "Yes" : "No");
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

