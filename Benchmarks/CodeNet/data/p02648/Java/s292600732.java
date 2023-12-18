import static java.lang.Math.max;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static FastScanner fsc;
    static Out out;
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        fsc = new FastScanner();
        out = new Out(System.out);
        solve();
        out.flush();
        out.close();
    }

    public static void solve() {
        int n = fsc.nextInt();
        int[] v = new int[0x40000];
        int[] w = new int[0x40000];
        for (int i = 1; i <= n; i++) {
            v[i] = fsc.nextInt();
            w[i] = fsc.nextInt();
        }
        int lmax = 100001;
        int[] memo = new int[0x200 * lmax];
        for (int i = 1; i < 0x200; i++) {
            for (int j = 1; j < lmax; j++) {
                if (j >= w[i]) {
                    memo[i * lmax + j] = max(memo[(i >> 1) * lmax + j], memo[(i >> 1) * lmax + j - w[i]] + v[i]);
                } else {
                    memo[i * lmax + j] = memo[(i >> 1) * lmax + j];
                }
                memo[i * lmax + j] = max(memo[i * lmax + j], memo[i * lmax + j - 1]);
            }
        }
        int q = fsc.nextInt();
        FastLongDeque que = new FastLongDeque(0x200);
        while (q --> 0) {
            int x = fsc.nextInt();
            int m = fsc.nextInt();
            que.addLast(0);
            int max = 0;
            for (; x >= 0x200; x >>= 1) {
                int sz = que.size();
                while (sz --> 0) {
                    long vw = que.removeFirst();
                    if ((vw & 0xffff_ffffl) + w[x] <= m) que.addLast(vw + ((long) v[x] << 32) + w[x]);
                    que.addLast(vw);
                }
            }
            while (que.size() > 0) {
                long vw = que.removeFirst();
                int vs = (int) (vw >>> 32);
                int ws = (int) (vw & 0xffff_ffffl);
                max = max(max, vs + memo[x * lmax + m - ws]);
            }
            out.write(max).write('\n');
            que.clear();
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();
    public static int ni() {return fsc.nextInt();}
    public static int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public static long nl() {return fsc.nextLong();}
    public static long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public static char[] nc() {return fsc.next().toCharArray();}
    public static char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public static double nd() {return fsc.nextDouble();}
    public static double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public static String ns() {return fsc.next();}
    public static String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buffer);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buffer[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buffer[ptr] && buffer[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        for (; ; b = readByte()) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Queue for long type.
 */
final class FastLongDeque {
    private static final int DEFAULT_CAPACITY = 64;
    private long[] circularArray;
    private int head;
    private int tail;
    private int len;
    private int mask;
    private int size;
    public FastLongDeque(int capacity) {
        int k = 1; while (k < capacity) k <<= 1;
        this.len = k;
        this.mask = k - 1;
        this.circularArray = new long[k];
        this.head = 0;
        this.tail = 0;
    }
    public FastLongDeque() {
        this(DEFAULT_CAPACITY);
    }
    public void addFirst(long val) {
        if (size == len) grow();
        head = (head - 1 + len) & mask;
        circularArray[head] = val;
        size++;
    }
    public void addLast(long val) {
        if (size == len) grow();
        circularArray[tail] = val;
        tail = (tail + 1) & mask;
        size++;
    }
    public long removeFirst() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        long ret = circularArray[head];
        head = (head + 1) & mask;
        size--;
        return ret;
    }
    public long removeLast() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        tail = (tail - 1 + len) & mask;
        long ret = circularArray[tail];
        size--;
        return ret;
    }
    public long get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        return circularArray[(head + index) & mask];
    }
    public long getFirst() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        return circularArray[head];
    }
    public long getLast() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        return circularArray[(tail - 1 + len) & mask];
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = tail = 0;
    }
    public PrimitiveIterator.OfLong iterator() {
        return new DequeIterator();
    }
    public PrimitiveIterator.OfLong descendingIterator() {
        return new DescendingDequeIterator();
    }
    public long[] toArray() {
        long[] ret = new long[size];
        for (int i = 0; i < size; i++) ret[i] = circularArray[(head + i) & mask];
        return ret;
    }
    public void clear(int newCapacity) {
        int k = 1; while (k < newCapacity) k <<= 1;
        if (k != len) {
            len = k;
            mask = k - 1;
            circularArray = new long[k];
        }
        head = tail = 0;
    }
    private void grow() {
        int len1 = len - head, len2 = len - len1;
        long[] newArray = new long[len << 1];
        System.arraycopy(circularArray, head, newArray, 0, len1);
        System.arraycopy(circularArray, 0, newArray, len1, len2);
        circularArray = newArray;
        len <<= 1;
        mask = len - 1;
        head = 0; tail = size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(circularArray[(head + i) & mask]);
            if (i < size - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private class DequeIterator implements PrimitiveIterator.OfLong {
        private int it;
        public boolean hasNext() {return it < size;}
        public long nextLong() {return circularArray[(head + it++) & mask];}
    }
    private class DescendingDequeIterator implements PrimitiveIterator.OfLong {
        private int it = size;
        public boolean hasNext() {return it > 0;}
        public long nextLong() {return circularArray[(head + --it) & mask];}
    }
}


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
