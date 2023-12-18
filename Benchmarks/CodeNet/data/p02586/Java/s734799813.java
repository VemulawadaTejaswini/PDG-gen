import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int R = in.nextInt();
        int C = in.nextInt();
        int[][] V = new int[R][C];
        for (int K = in.nextInt(); K > 0; K--)
            V[in.nextInt() - 1][in.nextInt() - 1] = in.nextInt();
        long[][] max = new long[R][C];
        // r = 0
        long sum = 0;
        int[] top = new int[3];
        for (int c = 0; c < C; c++) {
            if (top[0] < V[0][c]) {
                sum -= top[0];
                top[0] = V[0][c];
                sum += top[0];
                Arrays.sort(top);
            }
            max[0][c] = sum;
        }
        for (int r = 1; r < R; r++) {
            for (int s = 0; s < C; s++) {
                sum = max[r - 1][s];
                top = new int[3];
                for (int c = s; c < C; c++) {
                    if (top[0] < V[r][c]) {
                        sum -= top[0];
                        top[0] = V[r][c];
                        sum += top[0];
                        Arrays.sort(top);
                    }
                    max[r][c] = Math.max(max[r][c], sum);
                }
            }
        }
        out.println(max[R-1][C-1]);

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
