import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            int N = in.nextInt();
            long[] A = new long[N];
            for (int n = 0; n < N; n++)
                A[n] = in.nextLong();
            String S = in.next();
            char[] cs = S.toCharArray();
            boolean flag = true;
            for (int n = N - 1; n >= 0; n--) {
                if (A[n] == 0) continue;
                if (cs[n] == '1') {
                    flag = false;
                    break;
                }
                long msb = 0x1000000000000000L;
                while ((A[n] & msb) == 0) msb /= 2;
                for (int m = 0; m < n; m++) if ((A[m] & msb) != 0) {
                    A[m] ^= A[n];
                }
            }
            if (flag)
                out.println(0);
            else
                out.println(1);
        }

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

