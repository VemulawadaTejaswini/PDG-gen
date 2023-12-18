import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int[] p = In.ni(n * n, e -> e - 1);
        int[] d = new int[n * n];
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = i; j < n - i; j++) {
                d[i * n + j] = i;
                d[(n - i - 1) * n + j] = i;
                d[j * n + i] = i;
                d[j * n + (n - i - 1)] = i;
            }
        }
        long ans = 0;
        IntDeque q = new IntDeque(n * n);
        boolean[] open = new boolean[n * n];
        for (int k = 0; k < n * n; k++) {
            int s = p[k];
            ans += d[s];
            open[s] = true;
            q.addLast(s);
            while (q.size() > 0) {
                int u = q.pollFirst();
                int uy = u / n;
                int ux = u % n;
                for (int dr = 0; dr < 4; dr++) {
                    int vy = uy + Const.dy4[dr];
                    int vx = ux + Const.dx4[dr];
                    int v = vy * n + vx;
                    if (vy < 0 || vx < 0 || vy >= n || vx >= n) continue;
                    if (open[u] && d[v] > d[u]) {
                        d[v] = d[u];
                        q.addFirst(v);
                    }
                    if (!open[u] && d[v] > d[u] + 1) {
                        d[v] = d[u] + 1;
                        q.addLast(v);
                    }
                }
            }
        }
        out.append(ans);
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
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
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
final class IntDeque implements Iterable<Integer> {
    private int head = -1;
    private int tail = 0;
    private int p[];
    private int n[];
    private static final int DEFAULT_SIZE = 64;
    public IntDeque(final int initialSize) {this(Math.max(1, initialSize - initialSize / 2), Math.max(1, initialSize / 2));}
    private IntDeque(final int pSize, final int nSize) {this.p = new int[pSize]; this.n = new int[nSize];}
    public IntDeque() {this(DEFAULT_SIZE);}
    public void addLast(final int v) {putByRawIndex(tail++, v);}
    public void addFirst(final int v) {putByRawIndex(head--, v);}
    public int pollFirst() {
        if (size() == 0) throw new NoSuchElementException("Deque is empty.");
        return getByRawIndex(++head);
    }
    public int pollLast() {
        if (size() == 0) throw new NoSuchElementException("Deque is empty.");
        return getByRawIndex(--tail);
    }
    public int get(int index) {
        index += head + 1;
        if (index >= tail) throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
        return getByRawIndex(index);
    }
    public int getFirst() {return get(0);}
    public int getLast() {return get(size() - 1);}
    public void map(int index, final IntUnaryOperator f) {
        index += head + 1;
        if (index >= tail) throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
        mapByRawIndex(index, f);
    }
    public void mapFirst(final IntUnaryOperator f) {map(0, f);}
    public void mapLast(final IntUnaryOperator f) {map(size() - 1, f);}
    public int size() {return tail - head - 1;}
    public void clear(boolean shrink) {
        head = -1; tail = 0;
        if (shrink) {
            p = new int[DEFAULT_SIZE];
            n = new int[DEFAULT_SIZE];
        }
    }
    public int[] toArray() {
        final int size = size();
        final int[] a = new int[size];
        for (int i = 0; i < size; i++) a[i] = get(i);
        return a;
    }
    private void growPos() {
        final int pSize = p.length;
        final int[] pCopy = new int[pSize << 1];
        System.arraycopy(p, 0, pCopy, 0, pSize);
        p = pCopy;
    }
    private void growNeg() {
        final int nSize = n.length;
        final int[] nCopy = new int[nSize << 1];
        System.arraycopy(n, 0, nCopy, 0, nSize);
        n = nCopy;
    }
    private int getByRawIndex(final int index) {
        if (index >= 0) return p[index];
        else return n[-(index + 1)];
    }
    private void putByRawIndex(final int index, final int v) {
        if (index < 0) {
            if (index <= -(n.length + 1)) growNeg();
            n[-(index + 1)] = v;
        } else {
            if (index >= p.length) growPos();
            p[index] = v;
        }
    }
    private void mapByRawIndex(final int index, final IntUnaryOperator f) {
        if (index >= 0) p[index] = f.applyAsInt(p[index]);
        else n[-(index + 1)] = f.applyAsInt(n[-(index + 1)]);
    }
    public PrimitiveIterator.OfInt iterator() {return new IntDequeIterator();}
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size(); i++) {
            sb.append(get(i));
            if (i < size() - 1) sb.append(" ");
        }
        sb.append(']');
        return sb.toString();
    }
    private class IntDequeIterator implements PrimitiveIterator.OfInt {
        private int i = head;
        public boolean hasNext() {return i < tail;}
        public int nextInt() {return getByRawIndex(i++);}
    }
}
