import javafx.util.Pair;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        Map<Pair<Long, Long>, Long> map0 = new HashMap<>();
        Map<Pair<Long, Long>, Long> map1 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long A = in.nextLong();
            long B = in.nextLong();
            if (A < 0) {
                A = -A;
                B = -B;
            }
            long gcd = gcd(A, Math.abs(B));
            if (B > 0) {
                Pair<Long, Long> pair = new Pair<>(A / gcd, B / gcd);
                map0.put(pair, map0.computeIfAbsent(pair, k -> 0L) + 1);
            } else {
                Pair<Long, Long> pair = new Pair<>(- B / gcd , A / gcd);
                map1.put(pair, map1.getOrDefault(pair, 0L) + 1);
            }
        }
        Set<Pair<Long, Long>> keys = new HashSet<>();
        keys.addAll(map0.keySet());
        keys.addAll(map1.keySet());
        long ans = 1;
        for (Pair<Long, Long> pair : keys) {
            long l = -1;
            l += mPow(2, map0.getOrDefault(pair, 0L));
            l += mPow(2, map1.getOrDefault(pair, 0L));
            ans *= l;
            ans %= MOD;
        }
        out.println(ans - 1);

        out.flush();
    }

    static long gcd(long p, long q) {
        if (p < q) {
            long tmp = p;
            p = q;
            q = tmp;
        }
        while(q != 0) {
            long tmp = p % q;
            p = q;
            q = tmp;
        }
        return p;
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

