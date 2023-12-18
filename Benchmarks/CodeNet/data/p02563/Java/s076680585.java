import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = sc.longs(n);
        long[] b = sc.longs(m);
        long[] c = NTT.NTT_998244353.convolution(a, b);
        out.writeln(LongArrays.join(c, " "));
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntLongPair {
    public int fst;
    public long snd;
    public IntLongPair(final int fst, final long snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntLongPair)) return false;
        final IntLongPair p = (IntLongPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for long arrays.
 * 2. methods that receives arrays and return some results (except for long arrays).
 */
final class LongArrays {
    private LongArrays(){}
    public static void swap(final long[] a, final int u, final int v) {
        final long tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final long[] a, int begin, int end) {
        while (end - begin > 1) swap(a, begin++, --end);
    }
    public static void reverse(final long[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final long[] a) {Arrays.sort(a); reverse(a);}
    public static long fold(final long[] a, final LongBinaryOperator op) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsLong(ret, a[i]);
        return ret;
    }
    public static long sum(final long[] a) {return fold(a, Long::sum);}
    public static long max(final long[] a) {return fold(a, Long::max);}
    public static long min(final long[] a) {return fold(a, Long::min);}
    public static IntLongPair maxWithIndex(final long[] a) {
        long max = max(a); return new IntLongPair(find(a, max), max);
    }
    public static IntLongPair minWithIndex(final long[] a) {
        long min = min(a); return new IntLongPair(find(a, min), min);
    }
    public static int find(final long[] a, final long v) {
        for (int i = 0; i < a.length; i++) if (a[i] == v) return i;
        return -1;
    }
    public static void map(final long[] a, final LongUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsLong(a[i]));}
    public static int filter(final long[] src, final long[] dst, final LongPredicate p) {
        int idx = 0;
        for (final long e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final long[] dst, final int beginIndex, final int endIndex, final LongPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final long dst[], final int endIndex, final LongPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final long[] a, final LongBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsLong(a[i - 1], a[i]);
    }
    public static void accumulate(final long[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(long[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
    }
    public static int lowerBound(long[] sorted, long key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] < key) l = m;
            else r = m;
        }
        return r;
    }
    public static int upperBound(long[] sorted, long key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] <= key) l = m;
            else r = m;
        }
        return r;
    }
    public static int countRange(long[] sorted, long fromKey, long toKey) {
        return lowerBound(sorted, toKey) - lowerBound(sorted, fromKey);
    }
    public static int compare(final long[] a, final long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final long[] a, final long[] b) {return compare(a, b) == 0;}
    public static String join(final long[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final long[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}


class Garner {
    public static long garner(long[] xs, long[] mods) {
        int n = xs.length;
        long[] cnst = new long[n];
        long[] coef = new long[n];
        Arrays.fill(coef, 1);
        for (int i = 0; i < n - 1; i++) {
            long m1 = mods[i];
            long v = (xs[i] - cnst[i] + m1) % m1;
            v = (v * ModArithmetic.inv(coef[i], m1)) % m1;
            for (int j = i + 1; j < n; j++) {
                long m2 = mods[j];
                cnst[j] = (cnst[j] + coef[j] * v) % m2;
                coef[j] = (coef[j] * m1) % m2;
            }
        }
        return cnst[n - 1];
    }
}

enum NTTmods {
    MOD_924844033 (924844033,  5),
    MOD_998244353 (998244353,  3),
    MOD_1012924417(1012924417, 5),
    MOD_167772161 (167772161,  3),
    MOD_469762049 (469762049,  3),
    MOD_1224736769(1224736769, 3);
    private final long MOD, PRIMITIVE_ROOT;
    private NTTmods(long mod, long primitiveRoot) {
        this.MOD = mod; this.PRIMITIVE_ROOT = primitiveRoot;
    }
    public long getMod() {return MOD;}
    public long getPrimitiveRoot() {return PRIMITIVE_ROOT;}
}

class NTT {
    public final long MOD;
    private final ModArithmetic MA;
    private final long PRIMITIVE_ROOT;

    private NTT(NTTmods mods) {
        this.MOD = mods.getMod();
        this.MA = new ModArithmetic(MOD);
        this.PRIMITIVE_ROOT = mods.getPrimitiveRoot();
    }

    private void ntt(long[] a, int sign) {
        int n = a.length;
        long h = MA.power(PRIMITIVE_ROOT, MA.mul((MOD - 1), MA.inv(n))); // ^n√g
        if (sign == -1) h = MA.inv(h);
        int i = 0;
        for (int j = 1; j < n - 1; j++) {
            for (int k = n >> 1; k > (i ^= k); k >>= 1);
            if (j < i) {
                long tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        for (int m = 1; m < n; m <<= 1) {
            int m2 = m << 1;
            long base = MA.power(h, n / m2);
            long w = 1;
            for (int x = 0; x < m; x++) {
                for (int s = x; s < n; s += m2) {
                    long u = a[s];
                    long d = MA.mul(a[s + m], w);
                    a[s] = MA.add(u, d);
                    a[s + m] = MA.sub(u, d);
                }
                w = MA.mul(w, base);
            }
        }
    }

    private void ntt(long[] input) {
        ntt(input, 1);
    }

    private void intt(long[] input) {
        ntt(input, -1);
        int l = input.length;
        long inv = MA.inv(l);
        for (int i = 0; i < l; i++) input[i] = MA.mul(input[i], inv);
    }

    public long[] convolution(long[] a, long[] b) {
        int retSize = a.length + b.length - 1;
        int n = 1;
        while (n < retSize) n <<= 1;
        long[] aa = new long[n];
        long[] bb = new long[n];
        System.arraycopy(a, 0, aa, 0, a.length);
        System.arraycopy(b, 0, bb, 0, b.length);
        ntt(aa);
        ntt(bb);
        for (int i = 0; i < n; ++i) aa[i] = (aa[i] * bb[i]) % MOD;
        intt(aa);
        long[] ret = new long[retSize];
        System.arraycopy(aa, 0, ret, 0, retSize);
        return ret;
    }

    public static final NTT NTT_167772161 = new NTT(NTTmods.MOD_167772161);
    public static final NTT NTT_469762049 = new NTT(NTTmods.MOD_469762049);
    public static final NTT NTT_1224736769 = new NTT(NTTmods.MOD_1224736769);
    public static final NTT NTT_998244353 = new NTT(NTTmods.MOD_998244353);
    public static final NTT NTT_924844033 = new NTT(NTTmods.MOD_924844033);
    public static final NTT NTT_1012924417 = new NTT(NTTmods.MOD_1012924417);

    public static long[] convolution(long[] a, long[] b, long mod) {
        int al = a.length, bl = b.length;
        long amax = -mod, bmax = -mod;
        for (int i = 0; i < al; i++) {
            a[i] %= mod;
            amax = Math.max(amax, a[i]);
        }
        for (int i = 0; i < bl; i++) {
            b[i] %= mod;
            bmax = Math.max(bmax, b[i]);
        }

        long abmax = amax * bmax;
        if (abmax < NTT_1224736769.MOD && Math.max(al, bl) * abmax < NTT_1224736769.MOD) {
            return NTT_1224736769.convolution(a, b);
        }

        long[] x1 = NTT_167772161.convolution(a, b);
        long[] x2 = NTT_469762049.convolution(a, b);
        long[] x3 = NTT_1224736769.convolution(a, b);

        int retSize = x1.length;
        long[] ret = new long[retSize];
        long[] mods = { NTT_167772161.MOD, NTT_469762049.MOD, NTT_1224736769.MOD, mod };
        for (int i = 0; i < retSize; ++i) {
            ret[i] = Garner.garner(new long[] { x1[i], x2[i], x3[i], 0 }, mods);
        }
        return ret;
    }
}

/**
 * Minimum modulo operations.
 * 
 * @author https://atcoder.jp/users/suisen
 */
class ModArithmetic {
    public final long MOD;

    /**
     * support modulo p arithmetic
     * 
     * @param p p s.t. p is a prime number.
     */
    public ModArithmetic(final long p) {
        this.MOD = p;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public static long mod(long a, final long MOD) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public static long add(final long a, final long b, final long MOD) {
        final long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public static long sub(final long a, final long b, final long MOD) {
        final long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public static long mul(final long a, final long b, final long MOD) {
        final long ret = (a * b) % MOD;
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public static long div(final long a, final long b, final long MOD) {
        return mul(a, inv(b, MOD), MOD);
    }

    /**
     * Calculate the value b s.t. a * b mod p = 1.
     */
    public static long inv(long a, final long MOD) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        u %= MOD;
        return u < 0 ? u + MOD : u;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public long mod(long a) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public long add(final long a, final long b) {
        final long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public long sub(final long a, final long b) {
        final long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public long mul(final long a, final long b) {
        final long s = (a * b) % MOD;
        return s < 0 ? s + MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public long div(final long a, final long b) {
        return mul(a, inv(b));
    }

    /**
     * Calculate the value b s.t. a*b mod MOD = 1.
     */
    public long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        return mod(u);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 + 1_2 + ... + a_k mod p.
     */
    public long sum(final long... a) {
        long ret = 0;
        for (final long c : a) ret += c;
        return mod(ret);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     */
    public long prod(final long... a) {
        long ret = 1;
        for (final long c : a) ret = (ret * c) % MOD;
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * calculate the inverse of [1,n] mod MOD in O(n).
     * 
     * @param n
     * @param MOD
     * @return the array that contains the inverse of [1,n]. (array[0] = 0)
     */
    public static long[] invMemo(int n, long MOD) {
        final long[] memo = new long[n + 1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = memo[(int) (MOD % i)];
            memo[i] = (q * r) % MOD;
        }
        return memo;
    }

    /**
     * calculate the inverse of a[0], ..., a[n - 1] mod MOD in O(n).
     * 
     * @param a
     * @param MOD
     * @return the array that contains the inverse of a[0], ..., a[n - 1].
     */
    public static long[] invAll(long[] a, long MOD) {
        int n = a.length;
        final long[] dp = new long[n + 1];
        final long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = (dp[i] * a[i]) % MOD;
        for (int i = n; i > 0; i--) pd[i - 1] = (pd[i] * a[i]) % MOD;
        long inv = ModArithmetic.inv(dp[n], MOD);
        long[] ret = new long[n];
        for (int i = 0; i < n; i++) ret[i] = (((dp[i] * pd[i]) % MOD) * inv) % MOD;
        return ret;
    }

    /**
     * calculate 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param n
     * @param MOD
     * @return the array that contains 0!, ..., n! (mod MOD).
     */
    public static long[] factorialMemo(int n, long MOD) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * i) % MOD;
        return memo;
    }

    /**
     * calculate the inverse of 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param factorial [0!, ..., n!] (mod MOD).
     * @param MOD
     * @return the array that contains the inverse of 0!, ..., n! (mod MOD).
     */
    public static long[] invFactorialMemo(long[] factorial, long MOD) {
        final int n = factorial.length - 1;
        final long[] memo = new long[n + 1];
        memo[n] = ModArithmetic.inv(factorial[n], MOD);
        for (int i = n; i > 0; i--) memo[i - 1] = (memo[i] * i) % MOD;
        return memo;
    }

    /**
     * calculate a^0, ..., a^n (mod MOD) in O(n).
     * 
     * @param a   base
     * @param n   maximum index.
     * @param MOD
     * @return the array that contains the a^0, ..., a^n (mod MOD).
     */
    public static long[] powerMemo(long a, int n, long MOD) {
        if (a == 2) return powerMemo(n, MOD);
        long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * a) % MOD;
        return memo;
    }

    /**
     * calculate 2^0, ..., 2^n (mod MOD) in O(n).
     * 
     * @param n   maximum index.
     * @param MOD
     * @return the array that contains the 2^0, ..., 2^n (mod MOD).
     */
    public static long[] powerMemo(int n, long MOD) {
        long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] << 1) % MOD;
        return memo;
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a   base
     * @param b   index
     * @param MOD
     * @return a^b (mod MOD)
     */
    public static long power(long a, long b, long MOD) {
        a %= MOD;
        if (b == 0 || a == 1) return 1;
        long res = 1, p = a, c = 1;
        while (b > 0) {
            long lsb = b & -b;
            for (; lsb != c; c <<= 1, p = (p * p) % MOD);
            res = (res * p) % MOD;
            b ^= lsb;
        }
        return res;
    }

    /**
     * calculate the inverse of [1,n] mod MOD in O(n).
     * 
     * @param n
     * @return the array that contains the inverse of [1,n]. (array[0] = 0)
     */
    public long[] invMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = memo[(int) (MOD % i)];
            memo[i] = (q * r) % MOD;
        }
        return memo;
    }

    /**
     * calculate the inverse of a[0], ..., a[n - 1] mod MOD in O(n).
     * 
     * @param a
     * @return the array that contains the inverse of a[0], ..., a[n - 1].
     */
    public long[] invAll(long[] a) {
        int n = a.length;
        long[] dp = new long[n + 1];
        long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = (dp[i] * a[i    ]) % MOD;
        for (int i = n; i > 0; i--) pd[i - 1] = (pd[i] * a[i - 1]) % MOD;
        long inv = inv(dp[n], MOD);
        long[] invs = new long[n];
        for (int i = 0; i < n; i++) {
            long lr = (dp[i] * pd[i + 1]) % MOD;
            invs[i] = (lr * inv) % MOD;
        }
        return invs;
    }

    /**
     * calculate 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param n
     * @return the array that contains 0!, ..., n! (mod MOD).
     */
    public long[] factorialMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * i) % MOD;
        return memo;
    }

    /**
     * calculate the inverse of 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param factorial [0!, ..., n!] (mod MOD).
     * @return the array that contains the inverse of 0!, ..., n! (mod MOD).
     */
    public long[] invFactorialMemo(long[] factorial) {
        final int n = factorial.length - 1;
        final long[] memo = new long[n + 1];
        memo[n] = ModArithmetic.inv(factorial[n], MOD);
        for (int i = n; i > 0; i--) memo[i - 1] = (memo[i] * i) % MOD;
        return memo;
    }

    /**
     * calculate a^0, ..., a^n (mod MOD) in O(n).
     * 
     * @param a   base
     * @param n   maximum index.
     * @return the array that contains the a^0, ..., a^n (mod MOD).
     */
    public long[] powerMemo(long a, int n) {
        if (a == 2) return powerMemo(n, MOD);
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * a) % MOD;
        return memo;
    }

    /**
     * calculate 2^0, ..., 2^n (mod MOD) in O(n).
     * 
     * @param n   maximum index.
     * @return the array that contains the 2^0, ..., 2^n (mod MOD).
     */
    public long[] powerMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] << 1) % MOD;
        return memo;
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a   base
     * @param b   index
     * @return a^b (mod MOD)
     */
    public long power(long a, long b) {
        a %= MOD;
        if (b == 0 || a == 1) return 1;
        long res = 1, p = a, c = 1;
        while (b > 0) {
            long lsb = b & -b;
            for (; lsb != c; c <<= 1, p = (p * p) % MOD);
            res = (res * p) % MOD;
            b ^= lsb;
        }
        return res;
    }
}
