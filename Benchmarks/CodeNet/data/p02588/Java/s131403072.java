import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class A {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int[][] A = new int[40][40]; // 20 is 0
        for (int n = 0; n < N; n++) {
            BigDecimal bd = in.nextBigDecimal();
            bd = bd.multiply(BigDecimal.valueOf(1000000000));
            long l = bd.longValue();
            int t = 20;
            int f = 20;
            for (long x = l * 15625 / 2; x % 1000000000 == 0; x /= 2)
                t++;
            for (long x = l * 15625; x % 1000000000 != 0; x *= 2)
                t--;
            for (long x = l * 16384 / 5; x % 1000000000 == 0; x /= 5)
                f++;
            for (long x = l * 16384; x % 1000000000 != 0; x *= 5)
                f--;
            if (t >= 0 && f >= 0)
                A[t][f]++;
        }
        int[][] B = new int[40][40];
        for (int i = 0; i < 40; i++) for (int j = 0; j < 40; j++)
            B[i][j] = A[i][j];
        for (int i = 0; i < 40; i++) for (int j = 39; j > 0; j--)
            B[i][j - 1] += B[i][j];
        for (int i = 0; i < 40; i++) for (int j = 39; j > 0; j--)
            B[j - 1][i] += B[j][i];

        long ans = 0;
        for (int i = 1; i < 40; i++) for (int j = 1; j < 40; j++) {
            if (i >= 20 && j >= 20)
                ans += A[i][j] * (B[40 - i][40 - j] - 1);
            else
                ans += A[i][j] * B[40 - i][40 - j];
        }
        out.println(ans / 2);

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

