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
import java.util.TreeMap;
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
        private static final int INF = (int) 1e7;

        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int h = in.ints(), w = in.ints();
            TreeMap<Integer, Integer> set = new TreeMap<>();
            IntSegmentTree st = new IntSegmentTree(new long[w], Math::min, INF, (x, u) -> u);
            for (int i = 0; i < w; i++) set.put(i, 0);
            for (int i = 1; i <= h; i++) {
                int a = in.ints() - 1, b = in.ints();
                int delta = INF;
                Integer key;
                while ((key = set.ceilingKey(a)) != null && key < b) {
                    delta = Math.min(delta, set.get(key) + (b - key));
                    st.update(key, INF);
                    set.remove(key);
                }
                if (set.containsKey(b)) delta = Math.min(delta, set.get(b));
                if (b != w) {
                    set.put(b, delta);
                    st.update(b, delta);
                }

                long min = st.query(0, w);
                out.ans(min >= INF ? -1 : min + i).ln();
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

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

    }

    static class IntSegmentTree {
        private final int n;
        private final int m;
        private final long[] tree;
        private final LongBinaryOperator op;
        private final LongBinaryOperator up;
        private final long zero;

        public IntSegmentTree(long[] array, LongBinaryOperator op, long zero, LongBinaryOperator up) {
            this.n = array.length;
            this.m = n == 1 ? 1 : Integer.highestOneBit(n - 1) << 1;
            this.tree = new long[m * 2 - 1];
            this.op = op;
            this.up = up;
            this.zero = zero;
            Arrays.fill(tree, zero);
            System.arraycopy(array, 0, this.tree, m - 1, array.length);
            for (int i = m - 2; i >= 0; i--) {
                tree[i] = op.applyAsLong(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        public void update(int i, long v) {
            i += m - 1;
            tree[i] = up.applyAsLong(tree[i], v);
            while (i > 0) {
                i = (i - 1) / 2;
                tree[i] = op.applyAsLong(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        public long query(int l, int r) {
            long left = zero, right = zero;
            l += m - 1;
            r += m - 1;
            while (l < r) {
                if ((l & 1) == 0) {
                    left = op.applyAsLong(left, tree[l]);
                }
                if ((r & 1) == 0) {
                    right = op.applyAsLong(tree[r - 1], right);
                }
                l = l / 2;
                r = (r - 1) / 2;
            }
            return op.applyAsLong(left, right);
        }

    }
}

