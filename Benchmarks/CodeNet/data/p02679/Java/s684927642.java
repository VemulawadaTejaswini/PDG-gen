import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EBullet solver = new EBullet();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBullet {
        long gcd(long a, long b) {
            if (b == 0)
                return a;
            return (gcd(b, a % b));
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            HashMap<Long, HashMap<Long, Integer>>[] hm = new HashMap[2];
            for (int i = 0; i < 2; i++)
                hm[i] = new HashMap<>();
            int z = 0, za = 0, zb = 0;
            //+= z
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                long a = s.nextLong(), b = s.nextLong();
                if (a == 0 && b == 0) {
                    z++;
                    continue;
                }
                if (a == 0) {
                    za++;
                    continue;
                }
                if (b == 0) {
                    zb++;
                    continue;
                }
                int sign = 0;
                if (a < 0)
                    sign ^= 1;
                if (b < 0)
                    sign ^= 1;
                a = Math.abs(a);
                b = Math.abs(b);
                long gcd = gcd(a, b);
                a /= gcd;
                b /= gcd;
                if (!hm[sign].containsKey(a))
                    hm[sign].put(a, new HashMap<>());
                if (!hm[sign].get(a).containsKey(b))
                    hm[sign].get(a).put(b, 0);
                hm[sign].get(a).put(b, hm[sign].get(a).get(b) + 1);
            }
            HashMap<Long, HashSet<Long>> used = new HashMap<>();
            long res = 1;
            long mod = (long) 1e9 + 7;
            long[] pow2 = new long[n + 1];
            pow2[0] = 1;
            for (int i = 1; i <= n; i++)
                pow2[i] = pow2[i - 1] * 2 % mod;
            for (Map.Entry<Long, HashMap<Long, Integer>> map : hm[0].entrySet()) {
                for (Map.Entry<Long, Integer> e : map.getValue().entrySet()) {
                    long a = map.getKey();
                    long b = e.getKey();
                    long add = 0;
                    add = (add + pow2[e.getValue()]) % mod;
                    if (hm[1].containsKey(b) && hm[1].get(b).containsKey(a)) {
                        int val = hm[1].get(b).get(a);
                        add = (add + pow2[val]) % mod;
                        add = (add + mod - 1) % mod;
                        if (!used.containsKey(b))
                            used.put(b, new HashSet<>());
                        used.get(b).add(a);
                    }
                    res = res * add % mod;
                }
            }
            for (Map.Entry<Long, HashMap<Long, Integer>> map : hm[1].entrySet()) {
                for (Map.Entry<Long, Integer> e : map.getValue().entrySet()) {
                    long a = map.getKey();
                    long b = e.getKey();
                    if (used.containsKey(a) && used.get(a).contains(b))
                        continue;
                    long add = 0;
                    add = (add + pow2[e.getValue()]) % mod;
                    res = res * add % mod;
                }
            }
            long add = 0;
            add = (add + pow2[za]) % mod;
            add = (add + pow2[zb]) % mod;
            add = (add + mod - 1) % mod;
            res = res * add % mod;
            res = (res + z) % mod;
            res = (res + mod - 1) % mod;
            w.println(res);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

