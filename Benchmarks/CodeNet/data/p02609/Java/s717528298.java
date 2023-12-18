import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        boolean[] x = new boolean[n];
        char[] ch = in.next().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            x[i] = ch[i] == '1';
        }

        int popCount = popCount(x);

        BigInteger bi = toBigInteger(x);
        int popCountMinus1 = Math.max(1, popCount - 1);
        int mod0 = bi.mod(BigInteger.valueOf(popCountMinus1)).intValue();
        int mod1 = bi.mod(BigInteger.valueOf(popCount + 1)).intValue();

        int[][] modulus = new int[2][n];
        modulus[0][n - 1] = 1 % (popCountMinus1);
        modulus[1][n - 1] = 1 % (popCount + 1);
        for (int i = n - 1; i >= 1; i--) {
            modulus[0][i - 1] = (modulus[0][i] * 2) % (popCountMinus1);
        }
        for (int i = n - 1; i >= 1; i--) {
            modulus[1][i - 1] = (modulus[1][i] * 2) % (popCount + 1);
        }

        for (int i = 0; i < n; i++) {
            if (x[i]) {
                out.println(f((mod0 - modulus[0][i] + popCountMinus1) % (popCountMinus1)) + 1);
            } else {
                out.println(f((mod1 + modulus[1][i]) % (popCount + 1)) + 1);
            }
        }
    }

    private static int f(int b) {
        int ret = 0;
        while (b != 0) {
            b = b % (Integer.bitCount(b));
            ret++;
        }
        return ret;
    }

    private static BigInteger toBigInteger(boolean[] x) {
        BigInteger bi = BigInteger.ZERO;
        BigInteger two = BigInteger.valueOf(2);
        for (int i = 0; i < x.length; i++) {
            if (!x[i]) continue;
            bi = bi.add(two.pow(x.length - i - 1));
        }
        return bi;
    }

    private static int popCount(boolean[] x) {
        int ret = 0;
        for (boolean ib : x) {
            if (ib) ret++;
        }
        return ret;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
