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
        CHAndV solver = new CHAndV();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHAndV {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt(), k = in.nextInt();

            int[][] grid = new int[h][w];
            for (int i = 0; i < h; i++) {
                char[] row = in.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    grid[i][j] = row[j] == '#' ? 1 : 0;
                }
            }

            long answer = 0;

            for (int row = 0; row < (1 << h); row++) {
                for (int col = 0; col < (1 << w); col++) {
                    int count = 0;
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < w; j++) {
                            if (((row >> i) & 1) == 0)
                                continue;
                            if (((col >> j) & 1) == 0)
                                continue;
                            count += grid[i][j];
                        }
                    }

                    if (count == k)
                        answer++;
                }
            }

            out.println(answer);
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

