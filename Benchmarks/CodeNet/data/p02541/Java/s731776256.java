import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
            BSumIsMultiple solver = new BSumIsMultiple();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class BSumIsMultiple {
        long ans = 0;
        long[] powFactors;
        LongExtGCDObject extgcd = new LongExtGCDObject();

        public void solve(int testNumber, FastInput in, FastOutput out) {
            long n = in.readLong();
            LongArrayList primeFactors = Factorization.factorizeNumberPrime(n);
            LongArrayList powFactors = new LongArrayList();
            for (long x : primeFactors.toArray()) {
                long pow = 1;
                while (n / pow % x == 0) {
                    pow *= x;
                }
                powFactors.add(pow);
            }
            this.powFactors = powFactors.toArray();

            ans = (long) 1e18;
            dfs(0, 1, 1);
            out.println(ans);
        }

        public void test(long a, long b) {
            if (a % 2 == 0 && b % 2 == 0) {
                return;
            }
            if (a == 1) {
                ans = Math.min(ans, b);
                return;
            }
            if (b == 1) {
                ans = Math.min(ans, a - 1);
                return;
            }
            extgcd.extgcd(a, b);
            long x = extgcd.getX();
            x = DigitUtils.mod(x, b);
            ans = Math.min(ans, DigitUtils.mul(x, a, (long) 1e18) - 1);
        }

        public void dfs(int i, long a, long b) {
            if (i == powFactors.length) {
                test(a * 2, b);
                test(a, b * 2);
                return;
            }
            dfs(i + 1, a * powFactors[i], b);
            dfs(i + 1, a, b * powFactors[i]);
        }

    }

    static class FastInput {
        private final InputStream is;
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

        public long readLong() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            long val = 0;
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

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(long c) {
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

    static class Factorization {
        public static LongArrayList factorizeNumberPrime(long x) {
            LongArrayList ans = new LongArrayList();
            factorizeNumberPrime(x, ans);
            return ans;
        }

        public static LongArrayList factorizeNumberPrime(long x, LongArrayList ans) {
            for (long i = 2; i * i <= x; i++) {
                if (x % i != 0) {
                    continue;
                }
                ans.add(i);
                while (x % i == 0) {
                    x /= i;
                }
            }
            if (x > 1) {
                ans.add(x);
            }
            return ans;
        }

    }

    static class ExtGCD {
        public static long extGCD(long a, long b, long[] xy) {
            if (a >= b) {
                return extGCD0(a, b, xy);
            }
            long ans = extGCD0(b, a, xy);
            SequenceUtils.swap(xy, 0, 1);
            return ans;
        }

        private static long extGCD0(long a, long b, long[] xy) {
            if (b == 0) {
                xy[0] = 1;
                xy[1] = 0;
                return a;
            }
            long ans = extGCD0(b, a % b, xy);
            long x = xy[0];
            long y = xy[1];
            xy[0] = y;
            xy[1] = x - a / b * y;
            return ans;
        }

    }

    static class SequenceUtils {
        public static void swap(long[] data, int i, int j) {
            long tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

        public static boolean equal(long[] a, int al, int ar, long[] b, int bl, int br) {
            if ((ar - al) != (br - bl)) {
                return false;
            }
            for (int i = al, j = bl; i <= ar; i++, j++) {
                if (a[i] != b[j]) {
                    return false;
                }
            }
            return true;
        }

    }

    static class LongExtGCDObject {
        private long[] xy = new long[2];

        public long extgcd(long a, long b) {
            return ExtGCD.extGCD(a, b, xy);
        }

        public long getX() {
            return xy[0];
        }

    }

    static class LongArrayList implements Cloneable {
        private int size;
        private int cap;
        private long[] data;
        private static final long[] EMPTY = new long[0];

        public LongArrayList(int cap) {
            this.cap = cap;
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new long[cap];
            }
        }

        public LongArrayList(LongArrayList list) {
            this.size = list.size;
            this.cap = list.cap;
            this.data = Arrays.copyOf(list.data, size);
        }

        public LongArrayList() {
            this(0);
        }

        public void ensureSpace(int req) {
            if (req > cap) {
                while (cap < req) {
                    cap = Math.max(cap + 10, 2 * cap);
                }
                data = Arrays.copyOf(data, cap);
            }
        }

        public void add(long x) {
            ensureSpace(size + 1);
            data[size++] = x;
        }

        public void addAll(long[] x, int offset, int len) {
            ensureSpace(size + len);
            System.arraycopy(x, offset, data, size, len);
            size += len;
        }

        public void addAll(LongArrayList list) {
            addAll(list.data, 0, list.size);
        }

        public long[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public String toString() {
            return Arrays.toString(toArray());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LongArrayList)) {
                return false;
            }
            LongArrayList other = (LongArrayList) obj;
            return SequenceUtils.equal(data, 0, size - 1, other.data, 0, other.size - 1);
        }

        public int hashCode() {
            int h = 1;
            for (int i = 0; i < size; i++) {
                h = h * 31 + Long.hashCode(data[i]);
            }
            return h;
        }

        public LongArrayList clone() {
            LongArrayList ans = new LongArrayList();
            ans.addAll(this);
            return ans;
        }

    }

    static class DigitUtils {
        private DigitUtils() {
        }

        public static boolean isMultiplicationOverflow(long a, long b, long limit) {
            if (limit < 0) {
                limit = -limit;
            }
            if (a < 0) {
                a = -a;
            }
            if (b < 0) {
                b = -b;
            }
            if (a == 0 || b == 0) {
                return false;
            }
            //a * b > limit => a > limit / b
            return a > limit / b;
        }

        public static long mul(long a, long b, long limit, long overflowVal) {
            return isMultiplicationOverflow(a, b, limit) ? overflowVal : a * b;
        }

        public static long mul(long a, long b, long overflowVal) {
            return mul(a, b, overflowVal, overflowVal);
        }

        public static long mod(long x, long mod) {
            x %= mod;
            if (x < 0) {
                x += mod;
            }
            return x;
        }

    }
}

