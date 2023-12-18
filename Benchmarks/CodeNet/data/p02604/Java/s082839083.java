import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
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
        ExtendedScanner s = new ExtendedScanner(System.in);
        Out o = new Out(System.out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        long[][] xyp = new long[n][3];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            xyp[i][0] = x;
            xyp[i][1] = y;
            xyp[i][2] = p;
        }
        long[][] sx = new long[n + 1][1 << n];
        for (int i = 0; i <= n; i++) Arrays.fill(sx[i], Const.LINF);
        LongArrayList putx = new LongArrayList(n);
        for (int j = 0; j < 1 << n; j++) {
            for(int k = j;; k = (k - 1) & j) {
                int i = Integer.bitCount(k);
                putx.add(0);
                for (int l = 0; l < n; l++) if (((k >> l) & 1) == 1) putx.add(xyp[l][0]);
                long s = 0;
                for (int l = 0; l < n; l++) {
                    if (((j >> l) & 1) == 0) continue;
                    long d = Const.LINF;
                    PrimitiveIterator.OfLong it = putx.iterator();
                    while (it.hasNext()) d = Math.min(d, xyp[l][2] * Math.abs(it.nextLong() - xyp[l][0]));
                    s += d;
                }
                sx[i][j] = Math.min(sx[i][j], s);
                putx.clear();
                if (k == 0) break;
            }
        }
        long[][] sy = new long[n + 1][1 << n];
        for (int i = 0; i <= n; i++) Arrays.fill(sy[i], Const.LINF);
        LongArrayList puty = new LongArrayList(n);
        for (int j = 0; j < 1 << n; j++) {
            for(int k = j;; k = (k - 1) & j) {
                int i = Integer.bitCount(k);
                puty.add(0);
                for (int l = 0; l < n; l++) {
                    if (((k >> l) & 1) == 1) puty.add(xyp[l][1]);
                }
                long s = 0;
                for (int l = 0; l < n; l++) {
                    if (((j >> l) & 1) == 0) continue;
                    long d = Const.LINF;
                    PrimitiveIterator.OfLong it = puty.iterator();
                    while (it.hasNext()) d = Math.min(d, xyp[l][2] * Math.abs(it.nextLong() - xyp[l][1]));
                    s += d;
                }
                sy[i][j] = Math.min(sy[i][j], s);
                puty.clear();
                if (k == 0) break;
            }
        }
        for (int k = 0; k <= n; k++) {
            long min = Const.LINF;
            for (int i = 0; i < 1 << n; i++) {
                for (int a = 0; a <= k; a++) {
                    min = Math.min(min, sx[a][i] + sy[k - a][((1 << n) - 1) ^ i]);
                }
            }
            out.write(min).write('\n');
        }
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
    public boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = nextChars(w);
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long   LINF = 1l << 59;
    public static final int    IINF = 1  << 30;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA  = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};

    private Const(){}
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
