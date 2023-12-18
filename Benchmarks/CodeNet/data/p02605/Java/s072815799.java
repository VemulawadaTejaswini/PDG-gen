import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;
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
        ExtendedScanner s = new ExtendedScanner(System.in);
        Out o = new Out(System.out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        HashMap<Integer, TreeSet<Integer>> ul = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> rl = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> dl = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> ll = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> um = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> rm = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> dm = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> lm = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> up = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> rp = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> dp = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> lp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char u = sc.nextChars()[0];
            if (u == 'U') {
                if (!ul.containsKey(x)) {
                    ul.put(x, new TreeSet<>());
                }
                ul.get(x).add(y);
                if (!um.containsKey(y - x)) {
                    um.put(y - x, new TreeSet<>());
                }
                um.get(y - x).add(x);
                if (!up.containsKey(y + x)) {
                    up.put(y + x, new TreeSet<>());
                }
                up.get(y + x).add(x);
            } else if (u == 'R') {
                if (!rl.containsKey(y)) {
                    rl.put(y, new TreeSet<>());
                }
                rl.get(y).add(x);
                if (!rm.containsKey(y - x)) {
                    rm.put(y - x, new TreeSet<>());
                }
                rm.get(y - x).add(x);
                if (!rp.containsKey(y + x)) {
                    rp.put(y + x, new TreeSet<>());
                }
                rp.get(y + x).add(x);
            } else if (u == 'D') {
                if (!dl.containsKey(x)) {
                    dl.put(x, new TreeSet<>());
                }
                dl.get(x).add(y);
                if (!dm.containsKey(y - x)) {
                    dm.put(y - x, new TreeSet<>());
                }
                dm.get(y - x).add(x);
                if (!dp.containsKey(y + x)) {
                    dp.put(y + x, new TreeSet<>());
                }
                dp.get(y + x).add(x);
            } else if (u == 'L') {
                if (!ll.containsKey(y)) {
                    ll.put(y, new TreeSet<>());
                }
                ll.get(y).add(x);
                if (!lm.containsKey(y - x)) {
                    lm.put(y - x, new TreeSet<>());
                }
                lm.get(y - x).add(x);
                if (!lp.containsKey(y + x)) {
                    lp.put(y + x, new TreeSet<>());
                }
                lp.get(y + x).add(x);
            }
        }
        long min = Long.MAX_VALUE;
        for (Map.Entry<Integer, TreeSet<Integer>> ue : ul.entrySet()) {
            int x = ue.getKey();
            if (!dl.containsKey(x)) {
                continue;
            }
            TreeSet<Integer> uys = ue.getValue();
            TreeSet<Integer> dys = dl.get(x);
            for (int uy : uys) {
                Integer dy = dys.higher(uy);
                if (dy == null) {
                    continue;
                }
                min = Math.min(min, (dy - uy) * 5);
            }
        }
        for (Map.Entry<Integer, TreeSet<Integer>> re : rl.entrySet()) {
            int y = re.getKey();
            if (!ll.containsKey(y)) {
                continue;
            }
            TreeSet<Integer> rxs = re.getValue();
            TreeSet<Integer> lxs = ll.get(y);
            for (int rx : rxs) {
                Integer lx = lxs.higher(rx);
                if (lx == null) {
                    continue;
                }
                min = Math.min(min, (lx - rx) * 5);
            }
        }
        for (Map.Entry<Integer, TreeSet<Integer>> ume : um.entrySet()) {
            int m = ume.getKey();
            if (!lm.containsKey(m)) {
                continue;
            }
            TreeSet<Integer> ums = ume.getValue();
            TreeSet<Integer> lms = lm.get(m);
            for (int ux : ums) {
                Integer lx = lms.higher(ux);
                if (lx == null) {
                    continue;
                }
                min = Math.min(min, (lx - ux) * 10);
            }
        }
        for (Map.Entry<Integer, TreeSet<Integer>> upe : up.entrySet()) {
            int p = upe.getKey();
            if (!rp.containsKey(p)) {
                continue;
            }
            TreeSet<Integer> ups = upe.getValue();
            TreeSet<Integer> rps = rp.get(p);
            for (int ux : ups) {
                Integer rx = rps.lower(ux);
                if (rx == null) {
                    continue;
                }
                min = Math.min(min, (ux - rx) * 10);
            }
        }
        for (Map.Entry<Integer, TreeSet<Integer>> dme : dm.entrySet()) {
            int m = dme.getKey();
            if (!rm.containsKey(m)) {
                continue;
            }
            TreeSet<Integer> dms = dme.getValue();
            TreeSet<Integer> rms = rm.get(m);
            for (int dx : dms) {
                Integer rx = rms.lower(dx);
                if (rx == null) {
                    continue;
                }
                min = Math.min(min, (dx - rx) * 10);
            }
        }
        for (Map.Entry<Integer, TreeSet<Integer>> dpe : dp.entrySet()) {
            int p = dpe.getKey();
            if (!lp.containsKey(p)) {
                continue;
            }
            TreeSet<Integer> dps = dpe.getValue();
            TreeSet<Integer> lps = lp.get(p);
            for (int dx : dps) {
                Integer lx = lps.higher(dx);
                if (lx == null) {
                    continue;
                }
                min = Math.min(min, (lx - dx) * 10);
            }
        }
        if (min == Long.MAX_VALUE) {
            out.write("SAFE\n");
        } else {
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
