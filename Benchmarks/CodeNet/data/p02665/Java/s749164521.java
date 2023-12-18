import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] A = new int[N + 1];
        for (int i = 0; i <= N ; i++)
            A[i] = in.nextInt();

        out.println(nodes(N, A));
        out.flush();
    }

    private static long nodes(int N, int[] A) {
        if (A.length <= N)
            throw new IllegalArgumentException();
        long nextNodes = 1;
        long ans = 1;
        long maxNodes = 0;
        for (int i : A)
            maxNodes += i;
        for (int i = 0; i <= N; i++) {
            nextNodes -= A[i];
            if (nextNodes < 0)
                return -1;
            maxNodes -= A[i];
            nextNodes = Math.min(maxNodes, nextNodes * 2);
            ans += nextNodes;
        }
        return ans;
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

