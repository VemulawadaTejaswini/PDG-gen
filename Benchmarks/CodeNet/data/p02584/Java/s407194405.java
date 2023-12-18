import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        BigInteger X = in.nextBigInteger();
        BigInteger K = in.nextBigInteger();
        BigInteger D = in.nextBigInteger();

        X = X.abs();
        if (K.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.ONE) >= 0) {
            X = X.subtract(D);
        }
        K = K.divide(BigInteger.valueOf(2));
        D = D.multiply(BigInteger.valueOf(2));
        if (X.compareTo(K.multiply(D)) >= 0) {
            out.println(X.subtract(K.multiply(D)));
        } else {
            BigInteger P = X.remainder(D);
            BigInteger M = P.subtract(D).abs();
            if (P.compareTo(M) <= 0) {
                out.println(P);
            } else {
                out.println(M);
            }
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
