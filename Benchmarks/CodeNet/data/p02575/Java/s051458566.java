import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.util.function.BinaryOperator;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
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
        FIHateShortestPathProblem solver = new FIHateShortestPathProblem();
        solver.solve(1, in, out);
        out.close();
    }

    static class FIHateShortestPathProblem {
        private static final long INF = (long) 1e15;

        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int h = in.ints(), w = in.ints();
            long[] dp = new long[w];
            FIHateShortestPathProblem.IV[] init = IntStream.range(0, w).mapToObj(x -> new FIHateShortestPathProblem.IV(x, -x)).toArray(FIHateShortestPathProblem.IV[]::new);
            LazySegmentTree<FIHateShortestPathProblem.IV, Long> st = new LazySegmentTree<FIHateShortestPathProblem.IV, Long>(
                    init,
                    (x1, x2) -> x1.value + x1.index <= x2.value + x2.index ? x1 : x2,
                    new FIHateShortestPathProblem.IV(-1, INF),
                    (x, u) -> new FIHateShortestPathProblem.IV(x.index, u),
                    Math::max,
                    -1L
            );

            for (int i = 0; i < w; i++) dp[i] = -i;

            for (int i = 1; i <= h; i++) {
                int a = in.ints() - 1, b = in.ints();
                if (a == 0) {
                    st.update(0, b, INF);
                } else {
                    long v = st.query(a - 1, a).value;
                    st.update(a, b, v);
                }
                FIHateShortestPathProblem.IV iv = st.query(0, w);
                long ans = iv.index + iv.value;
                //for (int j = 0; j < w; j++) ans = Math.min(ans, dp[j] + j);
                out.ans(ans >= INF ? -1 : i + ans).ln();
            }
        }

        private static class IV {
            int index;
            long value;

            public IV(int index, long value) {
                this.index = index;
                this.value = value;
            }

        }

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 32 * 1024;
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
            return (int) longs();
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

    static class LightWriter2 implements AutoCloseable {
        private static final int BUF_SIZE = 32 * 1024;
        private static final int BUF_THRESHOLD = 1024;
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
            } catch (ReflectiveOperationException ignored) {
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

        public LightWriter2 ans(long l) {
            if (!breaked) {
                print(' ');
            }
            if (l == 0) return print('0');
            if (l < 0) {
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

    static interface ObjIntFunction<T, R> {
        R apply(T x, int y);

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

    }

    static class Reflection {
        public static <T> Class<? extends T> getComponentClass(T[] a) {
            return (Class<? extends T>) a.getClass().getComponentType();
        }

        public static <T> Class<? extends T> getClass(T t) {
            return (Class<? extends T>) t.getClass();
        }

        public static <T> T[] newInstance(Class<T> clazz, int length) {
            return (T[]) Array.newInstance(clazz, length);
        }

    }

    static class LazySegmentTree<T, U> {
        private final int n;
        private final int m;
        private final T[] tree;
        private final U[] lazy;
        private final BinaryOperator<T> op;
        private final T zero;
        private final BiFunction<T, U, T> up;
        private final BinaryOperator<U> merge;
        private final U nop;
        private final ObjIntFunction<U, U> mul;

        public LazySegmentTree(T[] array, BinaryOperator<T> op, T zero, BiFunction<T, U, T> up,
                               BinaryOperator<U> merge, U nop,
                               ObjIntFunction<U, U> mul) {
            this.n = array.length;
            this.op = op;
            this.up = up;
            this.zero = zero;
            this.merge = merge;
            this.nop = nop;
            this.mul = mul;
            this.m = n == 1 ? 1 : Integer.highestOneBit(n - 1) << 1;
            this.tree = Reflection.newInstance(Reflection.getComponentClass(array), 2 * m - 1);
            this.lazy = Reflection.newInstance(Reflection.getClass(nop), 2 * m - 1);
            Arrays.fill(tree, zero);
            System.arraycopy(array, 0, this.tree, m - 1, array.length);
            Arrays.fill(lazy, nop);
            for (int i = m - 2; i >= 0; i--) {
                tree[i] = op.apply(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        public LazySegmentTree(T[] array, BinaryOperator<T> op, T zero, BiFunction<T, U, T> up,
                               BinaryOperator<U> merge, U nop) {
            this(array, op, zero, up, merge, nop, (q, n) -> q);
        }

        private void eval(int len, int k) {
            if (lazy[k] == nop) {
                return;
            } else if (k * 2 + 1 < m * 2 - 1) {
                lazy[k * 2 + 1] = merge.apply(lazy[k * 2 + 1], lazy[k]);
                lazy[k * 2 + 2] = merge.apply(lazy[k * 2 + 2], lazy[k]);
            }
            tree[k] = up.apply(tree[k], mul.apply(lazy[k], len));
            lazy[k] = nop;
        }

        private T update(int l, int r, U q, int k, int sl, int sr) {
            if (r <= sl || sr <= l) {
                eval(sr - sl, k);
                return tree[k];
            }
            if (l <= sl && sr <= r) {
                lazy[k] = merge.apply(lazy[k], q);
                eval(sr - sl, k);
                return tree[k];
            } else {
                eval(sr - sl, k);
                return tree[k] = op.apply(
                        update(l, r, q, k * 2 + 1, sl, (sl + sr) / 2),
                        update(l, r, q, k * 2 + 2, (sl + sr) / 2, sr)
                );
            }
        }

        public void update(int l, int r, U q) {
            update(l, r, q, 0, 0, m);
        }

        private T query(int l, int r, int k, int sl, int sr) {
            if (r <= sl || sr <= l) {
                return zero;
            }
            eval(r - l, k);
            if (l <= sl && sr <= r) {
                return tree[k];
            } else {
                T left = query(l, r, 2 * k + 1, sl, (sl + sr) / 2);
                T right = query(l, r, 2 * k + 2, (sl + sr) / 2, sr);
                return op.apply(left, right);
            }
        }

        public T query(int l, int r) {
            return query(l, r, 0, 0, m);
        }

    }
}

