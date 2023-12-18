import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
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
        int q = sc.nextInt();
        int[] c = sc.ints(n, e -> e - 1);
        IntArrayList[] ls = new IntArrayList[n];
        for (int col = 0; col < n; col++) ls[col] = new IntArrayList();
        for (int i   = 0; i   < n; i++)   ls[c[i]].add(i);
        for (int col = 0; col < n; col++) ls[col].add(n);
        RangeOrderedSet set = new RangeOrderedSet(0, n + 1);
        for (int col = 0; col < n; col++) set.add(ls[col].get(0));
        int[] idx = new int[n];
        int[] lq = new int[q];
        int[] rq = new int[q];
        int[] iq = new int[q];
        for (int i = 0; i < q; i++) {
            iq[i] = i;
            lq[i] = sc.nextInt() - 1;
            rq[i] = sc.nextInt();
        }
        DependentSort.sort(lq, rq, iq);
        int[] ans = new int[q];
        int ptr = 0;
        for (int i = 0; i < q; i++) {
            int j = iq[i], l = lq[i], r = rq[i];
            while (ptr < l) {
                int col = c[ptr++];
                set.add(ls[col].get(++idx[col]));
            }
            ans[j] = set.count(l, r);
        }
        for (int i = 0; i < q; i++) {
            out.writeln(ans[i]);
        }
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
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
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

final class InsertionSort {
    static void sort(final int[] a) {sort(a, 0, a.length);}
    static void sort(final int[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
    }
    static void sort(final long[] a) {sort(a, 0, a.length);}
    static void sort(final long[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
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
 */
final class RadixSort {
    private static final int INT_INSERTION_SORT_THRESHOLD = 120;
    private static final int LONG_INSERTION_SORT_THRESHOLD = 250;
    public static void sort(final int[] a) {sort(a, 0, a.length);}
    public static void sortDescending(final int[] a) {sortDescending(a, 0, a.length);}
    public static void sort(final int[] a, final int fr, final int to) {
        if (to - fr <= INT_INSERTION_SORT_THRESHOLD) {InsertionSort.sort(a, fr, to); return;}
        final int n = a.length;
        final int[] c0 = new int[0x101], c1 = new int[0x101], c2 = new int[0x101], c3 = new int[0x101];
        c0[0] = fr; c1[0] = fr; c2[0] = fr; c3[0] = fr;
        for (int i = fr; i < to; i++) {
            final int v = a[i];
            final int b0 = v & 0xff, b1 = v >> 8 & 0xff, b2 = v >> 16 & 0xff, b3 = v >>> 24 ^ 0x80;
            c0[b0 + 1]++; c1[b1 + 1]++; c2[b2 + 1]++; c3[b3 + 1]++;
        }
        for (int i = 0; i < 0x100; i++) {
            c0[i + 1] += c0[i]; c1[i + 1] += c1[i]; c2[i + 1] += c2[i]; c3[i + 1] += c3[i];
        }
        final int[] b = new int[n];
        for (int i = fr; i < to; i++) {final int v = a[i]; b[c0[v        & 0xff]++] = v;}
        for (int i = fr; i < to; i++) {final int v = b[i]; a[c1[v >>> 8  & 0xff]++] = v;}
        for (int i = fr; i < to; i++) {final int v = a[i]; b[c2[v >>> 16 & 0xff]++] = v;}
        for (int i = fr; i < to; i++) {final int v = b[i]; a[c3[v >>> 24 ^ 0x80]++] = v;}
    }
    public static void sortDescending(final int[] a, final int fr, final int to) {
        sort(a, fr, to);
        int l = fr, r = to - 1;
        while (l < r) {final int tmp = a[l]; a[l] = a[r]; a[r] = tmp; l++; r--;}
    }
    public static void sort(final long[] a) {sort(a, 0, a.length);}
    public static void sortDescending(final long[] a) {sortDescending(a, 0, a.length);}
    public static void sort(final long[] a, final int fr, final int to) {
        if (to - fr <= LONG_INSERTION_SORT_THRESHOLD) {InsertionSort.sort(a, fr, to); return;}
        final int n = a.length;
        final int[] c0 = new int[0x101], c1 = new int[0x101], c2 = new int[0x101], c3 = new int[0x101];
        final int[] c4 = new int[0x101], c5 = new int[0x101], c6 = new int[0x101], c7 = new int[0x101];
        c0[0] = fr; c1[0] = fr; c2[0] = fr; c3[0] = fr; c4[0] = fr; c5[0] = fr; c6[0] = fr; c7[0] = fr;
        for (int i = fr; i < to; i++) {
            final long v = a[i];
            final int b0 = (int) (v & 0xff), b1 = (int) (v >> 8 & 0xff), b2 = (int) (v >> 16 & 0xff), b3 = (int) (v >> 24 & 0xff);
            final int b4 = (int) (v >> 32 & 0xff), b5 = (int) (v >> 40 & 0xff), b6 = (int) (v >> 48 & 0xff), b7 = (int) (v >>> 56 ^ 0x80);
            c0[b0 + 1]++; c1[b1 + 1]++; c2[b2 + 1]++; c3[b3 + 1]++; c4[b4 + 1]++; c5[b5 + 1]++; c6[b6 + 1]++; c7[b7 + 1]++;
        }
        for (int i = 0; i < 0x100; i++) {
            c0[i + 1] += c0[i]; c1[i + 1] += c1[i]; c2[i + 1] += c2[i]; c3[i + 1] += c3[i];
            c4[i + 1] += c4[i]; c5[i + 1] += c5[i]; c6[i + 1] += c6[i]; c7[i + 1] += c7[i];
        }
        final long[] b = new long[n];
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c0[(int) (v        & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c1[(int) (v >>> 8  & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c2[(int) (v >>> 16 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c3[(int) (v >>> 24 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c4[(int) (v >>> 32 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c5[(int) (v >>> 40 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c6[(int) (v >>> 48 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c7[(int) (v >>> 56 ^ 0x80)]++] = v;}
    }
    public static void sortDescending(final long[] a, final int fr, final int to) {
        sort(a, fr, to);
        int l = fr, r = to - 1;
        while (l < r) {final long tmp = a[l]; a[l] = a[r]; a[r] = tmp; l++; r--;}
    }
}

@FunctionalInterface
interface LongComparator {
    public int compare(long i, long j);
    public default boolean eq(final long i, final long j) {return compare(i, j) == 0;}
    public default boolean ne(final long i, final long j) {return compare(i, j) != 0;}
    public default boolean gt(final long i, final long j) {return compare(i, j) > 0;}
    public default boolean ge(final long i, final long j) {return compare(i, j) >= 0;}
    public default boolean lt(final long i, final long j) {return compare(i, j) < 0;}
    public default boolean le(final long i, final long j) {return compare(i, j) <= 0;}
}


final class ComparativeMergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;
    public static void sort(final int[] a, final IntComparator comparator) {sort(a, 0, a.length, comparator);}
    public static void sort(final int[] a, final int begin, final int end, final IntComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) ComparativeInsertionSort.sort(a, i, j, comparator);
            else {ComparativeInsertionSort.sort(a, i, end, comparator); break;}
            i = j;
        }
        final int len = end - begin;
        final int[] work = new int[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block, to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {System.arraycopy(work, wi, a, i, block - wi); break;}
                    if (comparator.gt(work[wi], a[ti])) a[i] = a[ti++];
                    else {a[i] = work[wi++]; if (wi == block) break;}
                }
            }
        }
    }
    public static void sort(final long[] a, final LongComparator comparator) {sort(a, 0, a.length, comparator);}
    public static void sort(final long[] a, final int begin, final int end, final LongComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) ComparativeInsertionSort.sort(a, i, j, comparator);
            else {ComparativeInsertionSort.sort(a, i, end, comparator); break;}
            i = j;
        }
        final int len = end - begin;
        final long[] work = new long[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block, to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {System.arraycopy(work, wi, a, i, block - wi); break;}
                    if (comparator.gt(work[wi], a[ti])) a[i] = a[ti++];
                    else {a[i] = work[wi++]; if (wi == block) break;}
                }
            }
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
    public static void permute(int[] a, int[] p) {
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

@FunctionalInterface
interface IntComparator {
    public int compare(int i, int j);
    public default boolean eq(final int i, final int j) {return compare(i, j) == 0;}
    public default boolean ne(final int i, final int j) {return compare(i, j) != 0;}
    public default boolean gt(final int i, final int j) {return compare(i, j) > 0;}
    public default boolean ge(final int i, final int j) {return compare(i, j) >= 0;}
    public default boolean lt(final int i, final int j) {return compare(i, j) < 0;}
    public default boolean le(final int i, final int j) {return compare(i, j) <= 0;}
}


class RangeOrderedSet {
    final int[] cnt;
    final int n;
    final int bias;

    public RangeOrderedSet(final int l, final int r) {
        this.bias = -l;
        int w = r - l;
        int nn = 1; while (nn < w) nn <<= 1;
        this.n = nn;
        this.cnt = new int[n << 1];
    }

    public void add(int i) {
        if (contains(i)) return;
        update(bias + i, 1);
    }

    public void remove(int i) {
        if (!contains(i)) return;
        update(bias + i, 0);
    }

    public int pollFirst() {
        int ret = first();
        remove(ret);
        return ret;
    }

    public int pollLast() {
        int ret = last();
        remove(ret);
        return ret;
    }

    public boolean contains(int i) {
        return cnt[bias + i + n] > 0;
    }

    public int first() {
        if (cnt[1] == 0) throw new NoSuchElementException();
        int k = 1;
        while (k < n) {
            k <<= 1;
            if (cnt[k] == 0) k |= 1;
        }
        return k - n - bias;
    }

    public int last() {
        if (cnt[1] == 0) throw new NoSuchElementException();
        int k = 1;
        while (k < n) {
            k <<= 1;
            if (cnt[k | 1] > 0) k |= 1;
        }
        return k - n - bias;
    }

    public int kthElement(int k) {
        if (cnt[1] <= k) throw new NoSuchElementException();
        int i = 1;
        int s = 0;
        k++;
        while (i < n) {
            i <<= 1;
            if (s + cnt[i] < k) {
                s += cnt[i];
                i |= 1;
            }
        }
        return i - n - bias;
    }

    public int lower(int i) {
        int r = bias + i + n;
        r /= r & -r;
        while (true) {
            if (cnt[--r] > 0) break;
            if (r == 0) throw new NoSuchElementException();
            r /= r & -r;
        }
        while (r < n) {
            r <<= 1;
            if (cnt[r | 1] > 0) r |= 1;
        }
        return r - n - bias;
    }

    public int floor(int i) {return contains(i) ? i : lower(i);}

    public int higher(int i) {
        int l = bias + i + 1 + n;
        l /= l & -l;
        while (true) {
            if (cnt[l] > 0) break;
            if (++l == n << 1) throw new NoSuchElementException();
            l /= l & -l;
        }
        while (l < n) {
            l <<= 1;
            if (cnt[l] == 0) l |= 1;
        }
        return l - n - bias;
    }

    public int ceiling(int i) {return contains(i) ? i : higher(i);}

    public boolean isEmpty() {return cnt[1] == 0;}

    public int size() {return cnt[1];}

    public int count(int l, int r) {
        l += bias; r += bias;
        if (l < 0 || r >= n) throw new OutOfRangeException("Out of Range.");
        l += n; r += n;
        int res = 0;
        while (r > l) {
            if ((l & 1) == 1) res += cnt[l++];
            if ((r & 1) == 1) res += cnt[--r];
            l >>= 1; r >>= 1;
        }
        return res;
    }

    void update(int i, final int c) {
        i += n;
        cnt[i] = c;
        while ((i >>= 1) > 0) cnt[i] = cnt[i << 1] + cnt[(i << 1) | 1];
    }

    public PrimitiveIterator.OfInt iterator() {return new AscendingSetIterator();}

    public PrimitiveIterator.OfInt descendingIterator() {return new DescendingSetIterator();}

    class AscendingSetIterator implements PrimitiveIterator.OfInt {
        int it = size() > 0 ? first() : Integer.MAX_VALUE;
        final int max = size() > 0 ? last() : Integer.MIN_VALUE;
        public boolean hasNext() {return it <= max;}
        public int nextInt() {
            int ret = it;
            it = it == max ? Integer.MAX_VALUE : higher(it);
            return ret;
        }
    }
    class DescendingSetIterator implements PrimitiveIterator.OfInt {
        int it = size() > 0 ? last() : Integer.MIN_VALUE;
        final int min = size() > 0 ? first() : Integer.MAX_VALUE;
        public boolean hasNext() {return it >= min;}
        public int nextInt() {
            int ret = it;
            it = it == min ? Integer.MIN_VALUE : lower(it);
            return ret;
        }
    }
    private class OutOfRangeException extends RuntimeException {
        private static final long serialVersionUID = 1437290411625321824L;
        private OutOfRangeException() {super();}
        private OutOfRangeException(String s) {super(s);}
    }
}

final class DependentSort {
    public static void sort(int[] a, Object... dependentArrays) {sort(a, false, dependentArrays);}
    public static void sortDescending(int[] a, Object... dependentArrays) {sort(a, true, dependentArrays);}
    private static void sort(int[] a, boolean descending, Object... dependentArrays) {
        int n = a.length;
        int[] p;
        if (descending) {
            p = IndexSort.sortDescending(a);
            RadixSort.sortDescending(a);
        } else {
            p = IndexSort.sort(a);
            RadixSort.sort(a);
        }
        boolean[] settled = new boolean[n];
        boolean ok = true;
        for (Object obj : dependentArrays) {
            if (obj instanceof int[]) {
                int[] arr = (int[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {settled[j] = !settled[j]; break;}
                        int tmp = arr[j]; arr[j] = arr[p[j]]; arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else if (obj instanceof long[]) {
                long[] arr = (long[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {settled[j] = !settled[j]; break;}
                        long tmp = arr[j]; arr[j] = arr[p[j]]; arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else throw new UnsupportedOperationException("dependent objects must be int[] or long[] type.");
            ok = !ok;
        }
    }
    public static void sort(long[] a, Object... dependentArrays) {sort(a, false, dependentArrays);}
    public static void sortDescending(long[] a, Object... dependentArrays) {sort(a, true, dependentArrays);}
    private static void sort(long[] a, boolean descending, Object... dependentArrays) {
        int n = a.length;
        int[] p;
        if (descending) {
            p = IndexSort.sortDescending(a);
            RadixSort.sortDescending(a);
        } else {
            p = IndexSort.sort(a);
            RadixSort.sort(a);
        }
        boolean[] settled = new boolean[n];
        boolean ok = true;
        for (Object obj : dependentArrays) {
            if (obj instanceof int[]) {
                int[] arr = (int[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {settled[j] = !settled[j]; break;}
                        int tmp = arr[j]; arr[j] = arr[p[j]]; arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else if (obj instanceof long[]) {
                long[] arr = (long[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {settled[j] = !settled[j]; break;}
                        long tmp = arr[j]; arr[j] = arr[p[j]]; arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else throw new UnsupportedOperationException("dependent objects must be int[] or long[] type.");
            ok = !ok;
        }
    }
}


final class IndexSort {
    public static int[] sort(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[i] - a[j]);
        return index;
    }
    public static int[] sortDescending(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[j] - a[i]);
        return index;
    }
    public static int[] sort(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[i], a[j]));
        return index;
    }
    public static int[] sortDescending(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[j], a[i]));
        return index;
    }
}


final class ComparativeInsertionSort {
    static void sort(final int[] a, final int from, final int to, final IntComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
    static void sort(final long[] a, final int from, final int to, final LongComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
}
