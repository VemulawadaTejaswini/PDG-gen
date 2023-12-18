import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] P = new int[N * N];
        for (int i = 0; i < N * N; i++)
            P[i] = in.nextInt() - 1;
        int[][] matrix = new int[N][N];
        boolean[][] bbb = new boolean[N][N];
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++)
            matrix[i][j] = Math.min(Math.min(i, j), Math.min(N - 1 - i, N - 1 - j));
        int ans = 0;
        for (int p : P) {
            int i = p / N;
            int j = p % N;
            ans += matrix[i][j];
            bbb[i][j] = true;
            Deque<Integer> ii = new ArrayDeque<>();
            Deque<Integer> jj = new ArrayDeque<>();
            ii.add(i);
            jj.add(j);
            while (!ii.isEmpty()) {
                i = ii.remove();
                j = jj.remove();
                if (i - 1 >= 0 && matrix[i][j] + (bbb[i][j] ? 0 : 1) < matrix[i - 1][j]) {
                    matrix[i - 1][j] = matrix[i][j] + (bbb[i][j] ? 0 : 1);
                    ii.add(i - 1);
                    jj.add(j);
                }
                if (i + 1 < N && matrix[i][j] + (bbb[i][j] ? 0 : 1) < matrix[i + 1][j]) {
                    matrix[i + 1][j] = matrix[i][j] + (bbb[i][j] ? 0 : 1);
                    ii.add(i + 1);
                    jj.add(j);
                }
                if (j - 1 >= 0 && matrix[i][j] + (bbb[i][j] ? 0 : 1) < matrix[i][j - 1]) {
                    matrix[i][j - 1] = matrix[i][j] + (bbb[i][j] ? 0 : 1);
                    ii.add(i);
                    jj.add(j - 1);
                }
                if (j + 1 < N && matrix[i][j] + (bbb[i][j] ? 0 : 1) < matrix[i][j + 1]) {
                    matrix[i][j + 1] = matrix[i][j] + (bbb[i][j] ? 0 : 1);
                    ii.add(i);
                    jj.add(j + 1);
                }
            }
        }
        out.println(ans);
        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

