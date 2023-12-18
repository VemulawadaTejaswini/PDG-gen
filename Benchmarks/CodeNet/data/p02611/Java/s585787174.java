import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            FTwoSnuke solver = new FTwoSnuke();
            int testCount = Integer.parseInt(in.next());
            for (int i = 1; i <= testCount; i++)
                solver.solve(i, in, out);
            out.close();
        }
    }

    static class FTwoSnuke {
        Modular mod = new Modular(1e9 + 7);
        Power power = new Power(mod);
        IntRecursiveCombination comb = new IntRecursiveCombination(power);
        Lucas lucas = new Lucas(comb, mod);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int k = 11;
            int m = 5;
            int T = in.readInt() - 5;
            if (T < 0) {
                out.println(0);
                return;
            }
            int ans = 0;
            int lastA = -1;
            int lastB = -1;
            for (int i = 0; i <= k && T - i >= 0; i++) {
                if (lastA == -1) {
                    lastA = 1;
                } else {
                    lastA = mod.mul(lastA, mod.mul(k - i + 1, power.inverse(i)));
                }

                int ai = lastA;
//
//            if(ai != lucas.combination(k, i)){
//                throw new RuntimeException();
//            }
                int j = T - i;
                if (j % 2 == 1) {
                    continue;
                }

                int top = m + k - 1 + j / 2;
                int bot = j / 2;
                if (lastB == -1) {
                    lastB = lucas.combination(top, bot);
                } else {
                    lastB = mod.mul(lastB, mod.plus(bot, 1));
                    lastB = mod.mul(lastB, power.inverse(mod.plus(top, 1)));
                }


                int bi = lastB;
//            if(bi != lucas.combination(top, bot)){
//                throw new RuntimeException();
//            }
                int contrib = mod.mul(ai, bi);
                ans = mod.plus(ans, contrib);
            }
            out.println(ans);
        }

    }

    static interface InverseNumber {
    }

    static class IntRecursiveCombination implements IntCombination {
        private Modular mod;
        private Power pow;

        public IntRecursiveCombination(Power pow) {
            this.pow = pow;
            this.mod = pow.getModular();
        }

        public int combination(int m, int n) {
            if (m < n || n < 0) {
                return 0;
            }
            if (m - n < n) {
                n = m - n;
            }
            return comb(m, n);
        }

        private int comb(int m, int n) {
            if (n == 0) {
                return mod.valueOf(1);
            }
            int ans = comb(m - 1, n - 1);
            ans = mod.mul(ans, m);
            ans = mod.mul(ans, pow.inverse(n));
            return ans;
        }

    }

    static class FastInput {
        private final InputStream is;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public String next() {
            return readString();
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
                next = read();
            }

            return builder.toString();
        }

        public String readString() {
            defaultStringBuf.setLength(0);
            return readString(defaultStringBuf);
        }

    }

    static class SequenceUtils {
        public static void swap(int[] data, int i, int j) {
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

    }

    static class Power implements InverseNumber {
        static IntExtGCDObject extGCD = new IntExtGCDObject();
        final Modular modular;

        public Modular getModular() {
            return modular;
        }

        public Power(Modular modular) {
            this.modular = modular;
        }

        public int inverse(int x) {
            int ans = inverseExtGCD(x);
//        if(modular.mul(ans, x) != 1){
//            throw new IllegalStateException();
//        }
            return ans;
        }

        public int inverseExtGCD(int x) {
            if (extGCD.extgcd(x, modular.getMod()) != 1) {
                throw new IllegalArgumentException();
            }
            return modular.valueOf(extGCD.getX());
        }

    }

    static class IntExtGCDObject {
        private int[] xy = new int[2];

        public int extgcd(int a, int b) {
            return ExtGCD.extGCD(a, b, xy);
        }

        public int getX() {
            return xy[0];
        }

    }

    static class Modular {
        int m;

        public int getMod() {
            return m;
        }

        public Modular(int m) {
            this.m = m;
        }

        public Modular(long m) {
            this.m = (int) m;
            if (this.m != m) {
                throw new IllegalArgumentException();
            }
        }

        public Modular(double m) {
            this.m = (int) m;
            if (this.m != m) {
                throw new IllegalArgumentException();
            }
        }

        public int valueOf(int x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return x;
        }

        public int valueOf(long x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return (int) x;
        }

        public int mul(int x, int y) {
            return valueOf((long) x * y);
        }

        public int plus(int x, int y) {
            return valueOf(x + y);
        }

        public String toString() {
            return "mod " + m;
        }

    }

    static class ExtGCD {
        public static int extGCD(int a, int b, int[] xy) {
            if (a >= b) {
                return extGCD0(a, b, xy);
            }
            int ans = extGCD0(b, a, xy);
            SequenceUtils.swap(xy, 0, 1);
            return ans;
        }

        private static int extGCD0(int a, int b, int[] xy) {
            if (b == 0) {
                xy[0] = 1;
                xy[1] = 0;
                return a;
            }
            int ans = extGCD0(b, a % b, xy);
            int x = xy[0];
            int y = xy[1];
            xy[0] = y;
            xy[1] = x - a / b * y;
            return ans;
        }

    }

    static interface IntCombination {
        int combination(int m, int n);

    }

    static interface LongCombination {
    }

    static class Lucas implements IntCombination, LongCombination {
        private final IntCombination primeCombination;
        private int mod;

        public Lucas(IntCombination primeCombination, int mod) {
            this.primeCombination = primeCombination;
            this.mod = mod;
        }

        public Lucas(IntCombination primeCombination, Modular mod) {
            this(primeCombination, mod.getMod());
        }

        public int combination(int m, int n) {
            return combination((long) m, (long) n);
        }

        public int combination(long m, long n) {
            if (n == 0) {
                return 1 % mod;
            }
            return (int) ((long) primeCombination.combination((int) (m % mod), (int) (n % mod)) *
                    combination(m / mod, n / mod) % mod);
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }
}

