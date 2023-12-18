import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();
        int[] A = new int[N];
        for (int n = 0; n < N; n++)
            A[n] = in.nextInt();
        int[] B = new int[M];
        for (int m = 0; m < M; m++)
            B[m] = in.nextInt();
        int a = 0;
        int b = 0;
        int ans = 0;
        while (a < N || b < M) {
            int ma = 1000000001;
            if (a < N)
                ma = A[a];
            int mb = 1000000001;
            if (b < M)
                mb = B[b];
            if (ma <= mb) {
                K -= ma;
                if (K < 0)
                    break;
                a++;
            } else {
                K -= mb;
                if (K < 0)
                    break;
                b++;
            }
            ans++;
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

