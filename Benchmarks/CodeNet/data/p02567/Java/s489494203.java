import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.util.function.Predicate;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.util.function.BinaryOperator;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.util.Objects;
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
        JSegmentTree solver = new JSegmentTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSegmentTree {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints(), q = in.ints();
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) a[i] = in.longs();
            AclLazySegmentTree2<Long, Long> st = new AclLazySegmentTree2<>(a, Long::max, -1L, (x, u) -> u, Long::max, -1L);
            for (int i = 0; i < q; i++) {
                int t = in.ints();
                if (t == 1) {
                    int x = in.ints() - 1;
                    long v = in.longs();
                    st.update(x, v);
                } else if (t == 2) {
                    int l = in.ints() - 1, r = in.ints();
                    out.ans(st.query(l, r)).ln();
                } else if (t == 3) {
                    int x = in.ints() - 1;
                    long v = in.longs();
                    out.ans(1 + st.maxRight(x, s -> s < v)).ln();
                } else throw new RuntimeException();
            }
        }

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

    static class AclLazySegmentTree2<T, U> {
        private final int n;
        private final int m;
        private final int log;
        private final BinaryOperator<T> op;
        private final T zero;
        private final BiFunction<T, U, T> up;
        private final BinaryOperator<U> merge;
        private final U nop;
        private final ObjIntFunction<U, U> mul;
        private final T[] tree;
        private final U[] lazy;

        public AclLazySegmentTree2(T[] array, BinaryOperator<T> op, T zero, BiFunction<T, U, T> up, BinaryOperator<U> merge, U nop, ObjIntFunction<U, U> mul) {
            this.n = array.length;
            this.log = n == 1 ? 0 : 32 - Integer.numberOfLeadingZeros(n - 1);
            this.m = 1 << this.log;
            this.op = op;
            this.zero = zero;
            this.up = up;
            this.merge = merge;
            this.nop = nop;
            this.mul = mul;
            this.tree = Reflection.newInstance(Reflection.getComponentClass(array), 2 * m);
            this.lazy = Reflection.newInstance(Reflection.getClass(nop), 2 * m);
            Arrays.fill(tree, this.zero);
            Arrays.fill(lazy, this.nop);
            System.arraycopy(array, 0, tree, m, n);
            for (int i = m - 1; i > 0; i--) {
                tree[i] = op.apply(tree[(i << 1)], tree[(i << 1) | 1]);
            }
        }

        public AclLazySegmentTree2(T[] array, BinaryOperator<T> op, T zero, BiFunction<T, U, T> up, BinaryOperator<U> merge, U nop) {
            this(array, op, zero, up, merge, nop, (u, w) -> u);
        }

        private void push(int k) {
            if (lazy[k] == nop) return;
            int lk = (k << 1), rk = (k << 1) | 1;
            tree[lk] = up.apply(tree[lk], lazy[k]);
            tree[rk] = up.apply(tree[rk], lazy[k]);
            if (lk < m) lazy[lk] = merge.apply(lazy[k], lazy[lk]);
            if (rk < m) lazy[rk] = merge.apply(lazy[k], lazy[rk]);
            lazy[k] = nop;
        }

        private void pushTo(int k) {
            for (int i = log; i > 0; i--) push(k >> i);
        }

        private void pushTo(int lk, int rk) {
            for (int i = log; i > 0; i--) {
                if (((lk >> i) << i) != lk) push(lk >> i);
                if (((rk >> i) << i) != rk) push(rk >> i);
            }
        }

        private void updateFrom(int k) {
            k >>= 1;
            while (k > 0) {
                tree[k] = op.apply(tree[(k << 1)], tree[(k << 1) | 1]);
                k >>= 1;
            }
        }

        public T query(int l, int r) {
            if (l >= r) return zero;
            l += m;
            r += m;
            pushTo(l, r);
            T sumLeft = zero, sumRight = zero;
            while (l < r) {
                if ((l & 1) == 1) sumLeft = op.apply(sumLeft, tree[l++]);
                if ((r & 1) == 1) sumRight = op.apply(tree[--r], sumRight);
                l >>= 1;
                r >>= 1;
            }
            return op.apply(sumLeft, sumRight);
        }

        public void update(int i, U v) {
            i += m;
            pushTo(i);
            tree[i] = up.apply(tree[i], v);
            updateFrom(i);
        }

        public int maxRight(int l, Predicate<T> g) {
            if (!g.test(zero)) throw new IllegalArgumentException("Identity element must satisfy the condition.");
            if (n <= l) return n;
            l += m;
            pushTo(l);
            T sum = zero;
            do {
                l >>= Integer.numberOfTrailingZeros(l);
                if (!g.test(op.apply(sum, tree[l]))) {
                    while (l < m) {
                        push(l);
                        l = l << 1;
                        if (g.test(op.apply(sum, tree[l]))) {
                            sum = op.apply(sum, tree[l]);
                            l++;
                        }
                    }
                    return l - m;
                }
                sum = op.apply(sum, tree[l]);
                l++;
            } while ((l & -l) != l);
            return n;
        }

    }

    static interface ObjIntFunction<T, R> {
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

        public LightWriter2 ans(String s) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            return print(s);
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

        public LightWriter2 ans(int i) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            print(i);
            return this;
        }

        public LightWriter2 ans(Object obj) {
            return ans(Objects.toString(obj));
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

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

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
}

