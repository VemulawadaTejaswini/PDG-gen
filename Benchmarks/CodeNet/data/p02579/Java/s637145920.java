import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {

        private final int[][] DIRS = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int R = in.nextInt(), C = in.nextInt();
            int startX = in.nextInt() - 1, startY = in.nextInt() - 1;
            int endX = in.nextInt() - 1, endY = in.nextInt() - 1;

            int[][] matrix = new int[R][C];
            for (int i = 0; i < R; i++) {
                String s = in.next();
                for (int j = 0; j < s.length(); j++) {
                    matrix[i][j] = s.charAt(j) == '.' ? 0 : 1;
                }
            }

            long[][] dp = new long[R][C];
            for (long[] row : dp) {
                Arrays.fill(row, -1);
            }

            long res = minMoves(matrix, startX, startY, endX, endY, dp);
            out.println(res == Long.MAX_VALUE ? -1 : res);
        }

        public long minMoves(int[][] matrix, int i, int j, int targetX, int targetY, long[][] dp) {
            if (i == targetX && j == targetY)
                return 0;

            if (dp[i][j] != -1) return dp[i][j];

            matrix[i][j] = 1; // Marked

            long res = Long.MAX_VALUE;
            for (int[] dir : DIRS) {
                int x = i + dir[0], y = j + dir[1];
                if (isValid(matrix, x, y) && matrix[x][y] == 0)
                    res = Math.min(res, minMoves(matrix, x, y, targetX, targetY, dp));
            }

            for (int x = i - 2; x <= i + 2; x++) {
                for (int y = j - 2; y <= j + 2; y++) {
                    if (isValid(matrix, x, y) && matrix[x][y] == 0) {
                        long curr = minMoves(matrix, x, y, targetX, targetY, dp);
                        if (curr != Long.MAX_VALUE) curr++;
                        res = Math.min(res, curr);
                    }
                }
            }

            matrix[i][j] = 0;  // Un-marked
            dp[i][j] = res;
            return res;
        }

        public boolean isValid(int[][] matrix, int i, int j) {
            return i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length;
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

