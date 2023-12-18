import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
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
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        long[][] g = new long[r + 1][c + 1];
        for (int i = 0; i < k; i++) g[sc.nextInt()][sc.nextInt()] = sc.nextLong();
        long[][][] dp = new long[4][r + 1][c + 1];
        for (int i = 1; i <= r; i++) {
            for (int x = 1; x <= 3; x++) {
                for (int j = 1; j <= c; j++) {
                    dp[x][i][j] = Longs.max(dp[x - 1][i][j - 1] + g[i][j], dp[x][i][j - 1]);
                    if (x == 1) {
                        dp[x][i][j] = Longs.max(dp[x][i][j], g[i][j] + Longs.max(dp[1][i - 1][j], dp[2][i - 1][j], dp[3][i - 1][j]));
                    }
                }
            }
        }
        long ans = Longs.max(dp[1][r][c], dp[2][r][c], dp[3][r][c]);
        out.writeln(ans);
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


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Longs {
    private Longs(){}
    public static long max(long a, long b) {
        return Math.max(a, b);
    }
    public static long max(long a, long b, long c) {
        return Math.max(Math.max(a, b), c);
    }
    public static long max(long a, long b, long c, long d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }
    public static long max(long a, long b, long c, long d, long e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
    public static long max(long a, long b, long c, long d, long e, long f) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f);
    }
    public static long max(long a, long b, long c, long d, long e, long f, long g) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g);
    }
    public static long max(long a, long b, long c, long d, long e, long f, long g, long h) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g), h);
    }
    public static long max(long a, long... vals) {
        long ret = a; for (long e : vals) ret = Math.max(ret, e);
        return ret;
    }
    public static long min(long a, long b) {
        return Math.min(a, b);
    }
    public static long min(long a, long b, long c) {
        return Math.min(Math.min(a, b), c);
    }
    public static long min(long a, long b, long c, long d) {
        return Math.min(Math.min(Math.min(a, b), c), d);
    }
    public static long min(long a, long b, long c, long d, long e) {
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    }
    public static long min(long a, long b, long c, long d, long e, long f) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f);
    }
    public static long min(long a, long b, long c, long d, long e, long f, long g) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g);
    }
    public static long min(long a, long b, long c, long d, long e, long f, long g, long h) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g), h);
    }
    public static long min(long a, long... vals) {
        long ret = a; for (long e : vals) ret = Math.min(ret, e);
        return ret;
    }
    public static long fold(final LongBinaryOperator func, final long... a) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = func.applyAsLong(ret, a[i]);
        return ret;
    }
    public static boolean isPowerOfTwo(final long n) {return n != 0 && (-n & n) == n;}
    public static int ceilExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);}
    public static int floorExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);}
    public static int ceilExponent(final long n, final int base) {
        if (base == 2) return ceilExponent(n);
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            final long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) break;
            m = r;
        }
        return i;
    }
    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static long cld(final long a, final long b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        if (a < 0 && b < 0) return (a + b + 1) / b;
        return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static long fld(final long a, final long b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        if (a > 0 && b <= 0) return (a - b - 1) / b;
        return a / b;
    }
    public static String join(final String sep, final long... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}
