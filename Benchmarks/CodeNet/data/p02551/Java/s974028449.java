import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.function.LongBinaryOperator;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.security.AccessControlException;
import java.io.Writer;
import java.io.InputStream;

/**
 * Built using CHelper reloaded plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner2 in = new LightScanner2(inputStream);
        LightWriter2 out = new LightWriter2(outputStream);
        FSimplifiedReversi solver = new FSimplifiedReversi();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSimplifiedReversi {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints(), q = in.ints();

            long[] init = new long[n];
            Arrays.fill(init, n - 1);
            IntLazySegmentTree vs = new IntLazySegmentTree(init, Math::min, n - 1, Math::min, Math::min, n - 1);
            IntLazySegmentTree hs = new IntLazySegmentTree(init, Math::min, n - 1, Math::min, Math::min, n - 1);

            long ans = (n - 2L) * (n - 2L);
            for (int i = 0; i < q; i++) {
                int t = in.ints(), x = in.ints() - 1;
                if (t == 1) {
                    int stuck = (int) hs.query(x, x + 1);
                    ans -= stuck - 1;
                    vs.update(0, stuck, x);
                } else {
                    int stuck = (int) vs.query(x, x + 1);
                    ans -= stuck - 1;
                    hs.update(0, stuck, x);
                }
            }
            out.ans(ans).ln();
        }

    }

    static class IntLazySegmentTree {
        private final int n;
        private final int m;
        private final long[] tree;
        private final long[] lazy;
        private final LongBinaryOperator op;
        private final long zero;
        private final LongBinaryOperator up;
        private final LongBinaryOperator merge;
        private final long nop;
        private final LongIntToLongFunction mul;

        public IntLazySegmentTree(long[] array, LongBinaryOperator op, long zero, LongBinaryOperator up,
                                  LongBinaryOperator merge, long nop,
                                  LongIntToLongFunction mul) {
            this.n = array.length;
            this.m = n == 1 ? 1 : Integer.highestOneBit(n - 1) << 1;
            this.op = op;
            this.zero = zero;
            this.up = up;
            this.merge = merge;
            this.nop = nop;
            this.mul = mul;
            this.tree = new long[m * 2 - 1];
            Arrays.fill(tree, zero);
            System.arraycopy(array, 0, this.tree, m - 1, array.length);
            this.lazy = new long[m * 2 - 1];
            Arrays.fill(lazy, nop);
            for (int i = m - 2; i >= 0; i--) {
                tree[i] = op.applyAsLong(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        public IntLazySegmentTree(long[] array, LongBinaryOperator op, long zero, LongBinaryOperator up,
                                  LongBinaryOperator merge, long nop) {
            this(array, op, zero, up, merge, nop, (q, n) -> q);
        }

        private void eval(int len, int k) {
            if (lazy[k] == nop) {
                return;
            } else if (k * 2 + 1 < m * 2 - 1) {
                lazy[k * 2 + 1] = merge.applyAsLong(lazy[k * 2 + 1], lazy[k]);
                lazy[k * 2 + 2] = merge.applyAsLong(lazy[k * 2 + 2], lazy[k]);
            }
            tree[k] = up.applyAsLong(tree[k], mul.applyAsLong(lazy[k], len));
            lazy[k] = nop;
        }

        private long update(int l, int r, long q, int k, int sl, int sr) {
            if (r <= sl || sr <= l) {
                eval(sr - sl, k);
                return tree[k];
            }
            if (l <= sl && sr <= r) {
                lazy[k] = merge.applyAsLong(lazy[k], q);
                eval(sr - sl, k);
                return tree[k];
            } else {
                eval(sr - sl, k);
                return tree[k] = op.applyAsLong(
                        update(l, r, q, k * 2 + 1, sl, (sl + sr) / 2),
                        update(l, r, q, k * 2 + 2, (sl + sr) / 2, sr)
                );
            }
        }

        public void update(int l, int r, long q) {
            update(l, r, q, 0, 0, m);
        }

        private long query(int l, int r, int k, int sl, int sr) {
            if (r <= sl || sr <= l) {
                return zero;
            }
            eval(sr - sl, k);
            if (l <= sl && sr <= r) {
                return tree[k];
            } else {
                long left = query(l, r, 2 * k + 1, sl, (sl + sr) / 2);
                long right = query(l, r, 2 * k + 2, (sl + sr) / 2, sr);
                return op.applyAsLong(left, right);
            }
        }

        public long query(int l, int r) {
            return query(l, r, 0, 0, m);
        }

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

    }

    static class LightWriter2 implements AutoCloseable {
        private static final int BUF_SIZE = 1024 * 1024;
        private static final int BUF_THRESHOLD = 64 * 1024;
        private final OutputStream out;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private final Field fastStringAccess;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter2(OutputStream out) {
            this.out = out;
            Field f;
            try {
                f = String.class.getDeclaredField("value");
                f.setAccessible(true);
                if (f.getType() != byte[].class) f = null;
            } catch (ReflectiveOperationException | AccessControlException ignored) {
                f = null;
            }
            this.fastStringAccess = f;
        }

        public LightWriter2(Writer out) {
            this.out = new LightWriter2.WriterOutputStream(out);
            this.fastStringAccess = null;
        }

        private void allocate(int n) {
            if (ptr + n <= BUF_SIZE) return;
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (BUF_SIZE < n) throw new IllegalArgumentException("Internal buffer exceeded");
        }

        public void close() {
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.flush();
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

        public LightWriter2 print(char c) {
            allocate(1);
            buf[ptr++] = (byte) c;
            breaked = false;
            return this;
        }

        public LightWriter2 print(String s) {
            byte[] bytes;
            if (this.fastStringAccess == null) bytes = s.getBytes();
            else {
                try {
                    bytes = (byte[]) fastStringAccess.get(s);
                } catch (IllegalAccessException ignored) {
                    bytes = s.getBytes();
                }
            }
            int n = bytes.length;
            if (n <= BUF_THRESHOLD) {
                allocate(n);
                System.arraycopy(bytes, 0, buf, ptr, n);
                ptr += n;
                return this;
            }
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.write(bytes);
                out.flush();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        private int print(long l) {
            if (l == 0) {
                print('0');
                return 1;
            } else if (l < 0) {
                print('-');
                l = -l;
            }
            int n = 0;
            long t = l;
            while (t > 0) {
                t /= 10;
                n++;
            }
            allocate(n);
            for (int i = 1; i <= n; i++) {
                buf[ptr + n - i] = (byte) (l % 10 + '0');
                l /= 10;
            }
            ptr += n;
            return n;
        }

        public LightWriter2 ans(long l) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            print(l);
            return this;
        }

        public LightWriter2 ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        private static class WriterOutputStream extends OutputStream {
            final Writer writer;
            final CharsetDecoder decoder;

            WriterOutputStream(Writer writer) {
                this.writer = writer;
                this.decoder = StandardCharsets.UTF_8.newDecoder();
            }

            public void write(int b) throws IOException {
                writer.write(b);
            }

            public void write(byte[] b) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b)).array());
            }

            public void write(byte[] b, int off, int len) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b, off, len)).array());
            }

            public void flush() throws IOException {
                writer.flush();
            }

            public void close() throws IOException {
                writer.close();
            }

        }

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 1024 * 1024;
        private final InputStream stream;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private int len;

        public LightScanner2(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (ptr < len) return buf[ptr++];
            try {
                ptr = 0;
                len = stream.read(buf);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (len == -1) return -1;
            return buf[ptr++];
        }

        private void skip() {
            int b;
            while (isTokenSeparator(b = read()) && b != -1) ;
            if (b == -1) throw new NoSuchElementException("EOF");
            ptr--;
        }

        public int ints() {
            long x = longs();
            if (x < Integer.MIN_VALUE || Integer.MAX_VALUE < x) throw new NumberFormatException("Overflow");
            return (int) x;
        }

        public long longs() {
            skip();
            int b = read();
            boolean negate;
            if (b == '-') {
                negate = true;
                b = read();
            } else negate = false;
            long x = 0;
            for (; !isTokenSeparator(b); b = read()) {
                if ('0' <= b && b <= '9') x = x * 10 + b - '0';
                else throw new NumberFormatException("Unexpected character '" + b + "'");
            }
            return negate ? -x : x;
        }

        public void close() {
            try {
                stream.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        private static boolean isTokenSeparator(int b) {
            return b < 33 || 126 < b;
        }

    }

    static interface LongIntToLongFunction<T, R> {
        long applyAsLong(long x, int y);

    }
}

