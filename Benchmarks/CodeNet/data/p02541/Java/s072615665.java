import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;

public class Main {
    public static void main(String[] args) throws Exception {
        ExtendedScanner sc = new ExtendedScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(ExtendedScanner sc, FastPrintStream pw) {
        long n = sc.nextLong();
        long min = Long.MAX_VALUE;
        if (n % 2 == 0) {
            n *= 2;
        }
        var f = MathUtil.factorize(n);
        long[] qp = new long[f.size()];
        int idx = 0;
        for (var e : f.entrySet()) {
            long prd = 1;
            long p = e.getKey();
            for (int i = 0; i < e.getValue(); i++) {
                prd *= p;
            }
            qp[idx++] = prd;
        }
        int m = idx;
        for (int i = 0; i < (1 << m); i++) {
            long q1 = 1, q2 = 1;
            for (int j = 0; j < m; j++) {
                if (((i >> j) & 1) == 1) {
                    q1 *= qp[j];
                } else {
                    q2 *= qp[j];
                }
            }
            long[] xyg1 = MathUtil.extGCD(q1, -q2);
            long x1 = xyg1[0];
            long y1 = xyg1[1];
            if (xyg1[2] < 0) {
                x1 *= -1;
                y1 *= -1;
            }
            if (x1 < 0) {
                long mx = (-x1 + q2 - 1) / q2;
                x1 += q2 * mx;
                y1 += q1 * mx;
            }
            if (y1 < 0) {
                long my = (-y1 + q1 - 1) / q1;
                x1 += q2 * my;
                y1 += q1 * my;
            }
            if (x1 == 0 || y1 == 0) {
                x1 += q2;
                y1 += q1;
            }
            min = Math.min(min, y1 * q2);
        }
        pw.println(min);
    }
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
class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[2048];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(java.io.InputStream in) {
        this.in = in;
    }

    public FastScanner() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {
            buflen = in.read(buf);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        return hasNextByte() ? buf[ptr++] : -1;
    }

    public boolean hasNext() {
        while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
        return hasNextByte();
    }

    private StringBuilder nextSequence() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb;
    }

    public String next() {
        return nextSequence().toString();
    }

    public String next(int len) {
        return new String(nextChars(len));
    }

    public char nextChar() {
        if (!hasNextByte()) throw new java.util.NoSuchElementException();
        return (char) readByte();
    }

    public char[] nextChars() {
        StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (32 < b && b < 127 && i < len) {
            s[i++] = (char) b; b = readByte();
        }
        if (i != len) {
            throw new java.util.NoSuchElementException(
                String.format("Next token has smaller length than expected.", len)
            );
        }
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
            } else if (b == -1 || !(32 < b && b < 127)) {
                return minus ? -n : n;
            } else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        return Math.toIntExact(nextLong());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public void close() {
        try {
            in.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends FastScanner {
    public ExtendedScanner() {super();}
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



/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public IntArrayList(final int capacity) {this.a = new int[Math.max(1, capacity)];}
    public IntArrayList() {this(DEFAULT_SIZE);}
    public void add(final int v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public int removeLast() {return a[--tail];}
    public int get(final int i) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final int v) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final int[] b = new int[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }
    public int size() {return tail;}
    public void clear() {tail = 0;}
    public void reverse(final int begin, final int end) {IntArrays.reverse(a, begin, end);}
    public void reverse() {IntArrays.reverse(a, 0, tail);}
    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public void sort() {Arrays.sort(a, 0, tail);}
    public boolean addIf(final int v, final IntPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public PrimitiveIterator.OfInt iterator() {return new IntArrayListIterator();}
    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public int nextInt() {return a[i++];}
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
final class IntArrays {
    private IntArrays(){}
    public static void swap(final int[] a, final int u, final int v) {
        final int tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final int[] a, int begin, int end) {
        while (end - begin > 1) swap(a, begin++, --end);
    }
    public static void reverse(final int[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final int[] a) {Arrays.sort(a); reverse(a);}
    public static int fold(final int[] a, final IntBinaryOperator op) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsInt(ret, a[i]);
        return ret;
    }
    public static int sum(final int[] a) {return fold(a, Integer::sum);}
    public static int max(final int[] a) {return fold(a, Integer::max);}
    public static int min(final int[] a) {return fold(a, Integer::min);}
    public static IntPair maxWithIndex(final int[] a) {
        int max = max(a); return new IntPair(find(a, max), max);
    }
    public static IntPair minWithIndex(final int[] a) {
        int min = min(a); return new IntPair(find(a, min), min);
    }
    public static int find(final int[] a, final int v) {
        for (int i = 0; i < a.length; i++) if (a[i] == v) return i;
        return -1;
    }
    public static void map(final int[] a, final IntUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsInt(a[i]));}
    public static int filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsInt(a[i - 1], a[i]);
    }
    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(int[] p, int[] a) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permute2(int[] p, int[] a, int[] b) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp;
                tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                tmp = b[j]; b[j] = b[p[j]]; b[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permute3(int[] p, int[] a, int[] b, int[] c) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp;
                tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                tmp = b[j]; b[j] = b[p[j]]; b[p[j]] = tmp;
                tmp = c[j]; c[j] = c[p[j]]; c[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permuteN(int[] p, int[]... as) {
        for (int[] a : as) permute(p, a);
    }
    public static int lowerBound(int[] sorted, int key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] < key) l = m;
            else r = m;
        }
        return r;
    }
    public static int upperBound(int[] sorted, int key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] <= key) l = m;
            else r = m;
        }
        return r;
    }
    public static int countRange(int[] sorted, int fromKey, int toKey) {
        return lowerBound(sorted, toKey) - lowerBound(sorted, fromKey);
    }
    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final int[] a, final int[] b) {return compare(a, b) == 0;}
    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
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
class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 15;
    private final byte[] buf = new byte[BUF_SIZE];
    private int ptr = 0;
    private final java.lang.reflect.Field strField;
    private final java.nio.charset.CharsetEncoder encoder;

    private java.io.OutputStream out;

    public FastPrintStream(java.io.OutputStream out) {
        this.out = out;
        java.lang.reflect.Field f;
        try {
            f = java.lang.String.class.getDeclaredField("value");
            f.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException e) {
            f = null;
        }
        this.strField = f;
        this.encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
    }

    public FastPrintStream(java.io.File file) throws java.io.IOException {
        this(new java.io.FileOutputStream(file));
    }

    public FastPrintStream(java.lang.String filename) throws java.io.IOException {
        this(new java.io.File(filename));
    }

    public FastPrintStream() {
        this(System.out);
        try {
            java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
            f.setAccessible(true);
            f.set(System.out, false);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            // ignore
        }
    }

    public FastPrintStream println() {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) '\n';
        return this;
    }

    public FastPrintStream println(java.lang.Object o) {
        return print(o).println();
    }

    public FastPrintStream println(java.lang.String s) {
        return print(s).println();
    }

    public FastPrintStream println(char[] s) {
        return print(s).println();
    }

    public FastPrintStream println(char c) {
        return print(c).println();
    }

    public FastPrintStream println(int x) {
        return print(x).println();
    }

    public FastPrintStream println(long x) {
        return print(x).println();
    }

    public FastPrintStream println(double d, int precision) {
        return print(d, precision).println();
    }

    private FastPrintStream print(byte[] bytes) {
        int n = bytes.length;
        if (ptr + n > BUF_SIZE) {
            internalFlush();
            try {
                out.write(bytes);
            } catch (java.io.IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.arraycopy(bytes, 0, buf, ptr, n);
            ptr += n;
        }
        return this;
    }

    public FastPrintStream print(java.lang.Object o) {
        return print(o.toString());
    }

    public FastPrintStream print(java.lang.String s) {
        if (strField == null) {
            return print(s.getBytes());
        } else {
            try {
                Object value = strField.get(s);
                if (value instanceof byte[]) {
                    return print((byte[]) value);
                } else {
                    return print((char[]) value);
                }
            } catch (IllegalAccessException e) {
                return print(s.getBytes());
            }
        }
    }

    public FastPrintStream print(char[] s) {
        try {
            return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
        } catch (java.nio.charset.CharacterCodingException e) {
            byte[] bytes = new byte[s.length];
            for (int i = 0; i < s.length; i++) {
                bytes[i] = (byte) s[i];
            }
            return print(bytes);
        }
    }

    public FastPrintStream print(char c) {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) c;
        return this;
    }

    public FastPrintStream print(int x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(long x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(double d, int precision) {
        if (d < 0) {
            print('-');
            d = -d;
        }
        d += Math.pow(10, -precision) / 2;
        print((long) d).print('.');
        d -= (long) d;
        for(int i = 0; i < precision; i++){
            d *= 10;
            print((int) d);
            d -= (int) d;
        }
        return this;
    }

    private void internalFlush() {
        try {
            out.write(buf, 0, ptr);
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            out.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int len(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }

    private static int len(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntPair {
    public int fst, snd;
    public IntPair(final int fst, final int snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair)) return false;
        final IntPair p = (IntPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + fst;
        hash = hash * 31 + snd;
        return hash;
    }
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class MathUtil{
    private MathUtil(){}
    public static IntArrayList primeList(int n) {
        IntArrayList primes = new IntArrayList();
        int[] div = osak(n);
        for (int i = 2; i <= n; i++) {
            if (div[i] == i) primes.add(i);
        }
        return primes;
    }
    public static int[] osak(int n) {
        if (n <= 0) throw new AssertionError();
        int[] div = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) {
                div[i] = i;
            } else {
                div[i] = 2;
            }
        }
        for (int i = 3; i <= n; i += 2) {
            if (div[i] == i) {
                if ((long) i * i > n) continue;
                for (int j = i * i; j <= n; j += i << 1) {
                    div[j] = i;
                }
            }
        }
        return div;
    }
    public static java.util.HashMap<Long, Integer> factorize(long n) {
        java.util.HashMap<Long, Integer> factors = new java.util.HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {
                n /= p;
                q++;
            }
            if (q > 0) factors.put(p, q);
        }
        if (n > 1) factors.put(n, 1);
        return factors;
    }
    public static LongArrayList divisors(long n) {
        LongArrayList div = new LongArrayList();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                div.add(i);
                div.add(n / i);
            }
        }
        return div;
    }
    private static java.util.HashMap<Long, Integer> mergeFactor(java.util.HashMap<Long, Integer> fac1, java.util.HashMap<Long, Integer> fac2) {
        if (fac1.size() < fac2.size()) {
            return mergeFactor(fac2, fac1);
        }
        for (java.util.Map.Entry<Long, Integer> e : fac2.entrySet()) {
            long prime = e.getKey();
            int num = e.getValue();
            if (fac1.containsKey(prime)) {
                fac1.put(prime, Math.max(fac1.get(prime), num));
            } else {
                fac1.put(prime, num);
            }
        }
        return fac1;
    }
    public static java.util.HashMap<Long, Integer> factorizedLCM(long a, long b) {
        return mergeFactor(factorize(a), factorize(b));
    }
    public static java.util.HashMap<Long, Integer> factorizedLCM(long... xs) {
        java.util.HashMap<Long, Integer> lcm = new java.util.HashMap<>();
        for (long x : xs) lcm = mergeFactor(lcm, factorize(x));
        return lcm;
    }
    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a < b) {
            long tmp = a; a = b; b = tmp;
        }
        if (b == 0) return a;
        if (a == 0) return b;
        for (long r = a % b; r != 0; r = a % b) {
            a = b; b = r;
        }
        return b;
    }
    public static long gcd(long... xs) {
        long gcd = 0;
        for (long x : xs) gcd = gcd(gcd, x);
        return gcd;
    }
    /**
     * Return one of the solutions to {@code ax+by=gcd(a, b)}.
     * 
     * @return {@code x}, {@code y}, {@code gcd(a, b)}.
     * @param a a of ax+by=gcd(a, b).
     * @param b b of ax+by=gcd(a, b).
     */
    public static long[] extGCD(long a, long b) {
        long s = a, sx = 1, sy = 0; // ax + by = s
        long t = b, tx = 0, ty = 1; // ax + by = t
        for (long tmp, u, ux, uy; s % t != 0;) {
            // u: ax + by = s % t
            tmp = s / t;
            u  = s  - t  * tmp; s  = t ; t  = u ;
            ux = sx - tx * tmp; sx = tx; tx = ux;
            uy = sy - ty * tmp; sy = ty; ty = uy;
        }
        return new long[]{tx, ty, a * tx + b * ty};
    }
    public static long inv(long a, long MOD) {
        long b = MOD;
        long u = 1, v = 0;
        while (b > 0) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            long tmp2 = u; u = v; v = tmp2;
        }
        u %= MOD;
        return u < 0 ? u + MOD : u;
    }
    /**
     * @return pair(g, x) s.t. g = gcd(a, b), xa = g (mod b), 0 <= x < b/g
     */
    public static long[] gcdInv(long a, long mod) {
        if ((a %= mod) < 0) a += mod;
        if (a == 0) return new long[]{mod, 0};
        long s = mod, t = a;
        long m0 = 0, m1 = 1;
        while (t > 0) {
            long u = s / t;
            s -= t * u;
            m0 -= m1 * u;
            long tmp;
            tmp = s; s = t; t = tmp;
            tmp = m0; m0 = m1; m1 = tmp;
        }
        if (m0 < 0) m0 += mod / s;
        return new long[]{s, m0};
    }
    public static long pow(long a, long b, long mod) {
        if (mod == 1) return 0;
        if ((a %= mod) < 0) a += mod;
        long pow = 1;
        for (long p = a, c = 1; b > 0;) {
            long lsb = b & -b;
            while (lsb != c) {
                c <<= 1;
                p = (p * p) % mod;
            }
            pow = (pow * p) % mod;
            b ^= lsb;
        }
        return pow;
    }
    public static long eulerPhi(long n) {
        for (long p : factorize(n).keySet()) {
            n = (n / p) * (p - 1);
        }
        return n;
    }
    public static long comb(long n, long r) {
        if (n < r) return 0;
        r = Math.min(r, n - r);
        long res = 1; for (long d = 1; d <= r; d++) {res *= n--; res /= d;}
        return res;
    }
    public static long ceilSqrt(long n) {
        long l = -1, r = n;
        while (r - l > 1) {
            long m = (r + l) >> 1;
            if (m * m >= n) r = m;
            else l = m;
        }
        return r;
    }
    public static long floorSqrt(long n) {
        long l = 0, r = n + 1;
        while (r - l > 1) {
            long m = (r + l) >> 1;
            if (m * m > n) r = m;
            else l = m;
        }
        return l;
    }
    public static long[] crt(long[] r, long[] m){
        if (r.length != m.length) {
            throw new AssertionError("Different length.");
        }
        int n = r.length;
        long r0 = 0, m0 = 1;
        for(int i=0; i<n; i++){
            if (m[i] < 1) {
                throw new AssertionError();
            }
            long m1 = m[i];
            long r1 = r[i] % m1;
            if (r1 < 0) r1 += m1;
            if (m0 < m1){
                long tmp;
                tmp = r0; r0 = r1; r1 = tmp;
                tmp = m0; m0 = m1; m1 = tmp;
            }
            if (m0 % m1 == 0){
                if (r0 % m1 != r1) return new long[]{0, 0};
                continue;
            }
            long[] gi = gcdInv(m0, m1);
            long g = gi[0], im = gi[1];
            long u1 = m1 / g;
            if((r1 - r0) % g != 0) return new long[]{0, 0};
            long x = (r1 - r0) / g % u1 * im % u1;
            r0 += x * m0;
            m0 *= u1;
            if (r0 < 0) r0 += m0;
        } 
        return new long[]{r0, m0};
    }
    public static long garner(long[] c, long[] mods) {
        int n = c.length + 1;
        long[] cnst = new long[n];
        long[] coef = new long[n];
        java.util.Arrays.fill(coef, 1);
        for (int i = 0; i < n - 1; i++) {
            long m1 = mods[i];
            long v = (c[i] - cnst[i] + m1) % m1;
            v = v * pow(coef[i], m1 - 2, m1) % m1;

            for (int j = i + 1; j < n; j++) {
                long m2 = mods[j];
                cnst[j] = (cnst[j] + coef[j] * v) % m2;
                coef[j] = (coef[j] * m1) % m2;
            }
        }
        return cnst[n - 1];
    }
    public static long floorSum(long n, long m, long a, long b){
        long ans = 0;
        if(a >= m){
            ans += (n - 1) * n * (a / m) / 2;
            a %= m;
        }
        if(b >= m){
            ans += n * (b / m);
            b %= m;
        }
        long ymax = (a * n + b) / m;
        long xmax = ymax * m - b;
        if (ymax == 0) return ans;
        ans += (n - (xmax + a - 1) / a) * ymax;
        ans += floorSum(ymax, a, m, (a - xmax % a) % a);
        return ans;
    }
    /**
     * @param m prime
     */
    public static int primitiveRoot(int m) {
        if (m == 2) return 1;
        if (m == 167772161) return 3;
        if (m == 469762049) return 3;
        if (m == 754974721) return 11;
        if (m == 998244353) return 3;
        int[] divs = new int[20];
        divs[0] = 2;
        int cnt = 1;
        int x = (m - 1) / 2;
        while (x % 2 == 0) x /= 2;
        for (int i = 3; (long) i * i <= x; i += 2) {
            if (x % i == 0) {
                divs[cnt++] = i;
                while (x % i == 0) x /= i;
            }
        }
        if (x > 1) {
            divs[cnt++] = x;
        }
        for (int g = 2; ; g++) {
            boolean ok = true;
            for (int i = 0; i < cnt; i++) {
                if (pow(g, (m - 1) / divs[i], m) == 1) {
                    ok = false;
                    break;
                }
            }
            if (ok) return g;
        }
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class LongArrayList implements Iterable<Long> {
    private long[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public LongArrayList(final int capacity) {this.a = new long[Math.max(1, capacity)];}
    public LongArrayList() {this(DEFAULT_SIZE);}
    public void add(final long v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public long removeLast() {return a[--tail];}
    public long get(final int i) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final long v) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final long[] b = new long[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }
    public int size() {return tail;}
    public void clear() {tail = 0;}
    public void reverse(final int begin, final int end) {LongArrays.reverse(a, begin, end);}
    public void reverse() {LongArrays.reverse(a, 0, tail);}
    public long[] toArray() {
        final long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public void sort() {Arrays.sort(a, 0, tail);}
    public boolean addIf(final long v, final LongPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public PrimitiveIterator.OfLong iterator() {return new LongArrayListIterator();}
    private class LongArrayListIterator implements PrimitiveIterator.OfLong {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public long nextLong() {return a[i++];}
    }
}
