import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int K = in.nextInt();
        String S = in.next();

        long[] fact = new long[2000001];
        long[] factInv = new long[2000001];
        long[] pow25 = new long[2000001];
        long[] pow26 = new long[2000001];
        fact[0] = factInv[0] = pow25[0] = pow26[0] = 1;
        for (int i = 1; i < 2000001; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            factInv[i] = mInv(fact[i]);
            pow25[i] = (pow25[i - 1] * 25) % MOD;
            pow26[i] = (pow26[i - 1] * 26) % MOD;
        }

        int length = S.length();
        long ans = 0;
        for (int k = 0; k <= K; k++) {
            long c = fact[length + k - 1];
            c *= factInv[k];
            c %= MOD;
            c *= factInv[length - 1];
            c %= MOD;
            c *= pow25[k];
            c %= MOD;
            c *= pow26[K - k];
            c %= MOD;
            ans += c;
            ans %= MOD;
        }
        out.println(ans);

        out.flush();
    }

    static final int MOD = 1_000_000_007;
    static long mPow(long a, long b) {
        long ret = 1;
        while (b > 0) {
            if (b % 2 == 1)
                ret = (ret * a) % MOD;
            a = (a * a) % MOD;
            b /= 2;
        }
        return ret;
    }
    static long mInv(long a) {
        return mPow(a, MOD - 2);
    }
    static long mFact(long a) {
        long ret = 1;
        for (long i = 2; i <= a; i++)
            ret = (ret * i) % MOD;
        return ret;
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

