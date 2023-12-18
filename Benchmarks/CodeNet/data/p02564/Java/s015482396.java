import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Stack;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.util.Collection;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.util.List;
import java.security.AccessControlException;
import java.io.Writer;
import java.util.Collections;
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
        GSCC solver = new GSCC();
        solver.solve(1, in, out);
        out.close();
    }

    static class GSCC {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints(), m = in.ints();
            GSCC.Node[] nodes = new GSCC.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new GSCC.Node(i);
            for (int i = 0; i < m; i++) {
                int x = in.ints(), y = in.ints();
                nodes[x].next.add(nodes[y]);
                nodes[y].prev.add(nodes[x]);
            }
            List<? extends Collection<GSCC.Node>> groups = SCCDecomposer.decompose2(Arrays.asList(nodes));
            out.ans(groups.size()).ln();
            for (Collection<GSCC.Node> group : groups) {
                out.ans(group.size());
                for (GSCC.Node node : group) out.ans(node.index);
                out.ln();
            }
        }

        private static class Node implements NodeLike<GSCC.Node> {
            final int index;
            final List<GSCC.Node> next = new ArrayList<>();
            final List<GSCC.Node> prev = new ArrayList<>();

            Node(int index) {
                this.index = index;
            }

            public int getIndex() {
                return index;
            }

            public List<GSCC.Node> getNextNodes() {
                return next;
            }

        }

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

        public LightWriter2 ans(int i) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            if (i == 0) return print('0');
            if (i < 0) {
                print('-');
                i = -i;
            }
            int n = 0;
            long t = i;
            while (t > 0) {
                t /= 10;
                n++;
            }
            allocate(n);
            for (int j = 1; j <= n; j++) {
                buf[ptr + n - j] = (byte) (i % 10 + '0');
                i /= 10;
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

    static class SCCDecomposer<T extends NodeLike<T>> {
        private final int n;
        private int nowOrd;
        private int groupNum;
        private final List<? extends T> nodes;
        private final Stack<Integer> visited;
        private final int[] low;
        private final int[] ord;
        private final int[] ids;

        public SCCDecomposer(List<? extends T> nodes) {
            this.n = nodes.size();
            this.nodes = nodes;
            this.visited = new Stack<>();
            this.low = new int[n];
            this.ord = new int[n];
            Arrays.fill(ord, -1);
            this.ids = new int[n];
        }

        private void dfs(int v) {
            low[v] = ord[v] = nowOrd++;
            visited.push(v);
            for (T next : nodes.get(v).getNextNodes()) {
                int to = next.getIndex();
                if (ord[to] == -1) {
                    dfs(to);
                    low[v] = Math.min(low[v], low[to]);
                } else {
                    low[v] = Math.min(low[v], ord[to]);
                }
            }
            if (low[v] == ord[v]) {
                while (true) {
                    int u = visited.pop();
                    ord[u] = n;
                    ids[u] = groupNum;
                    if (u == v) break;
                }
                groupNum++;
            }
        }

        public static <T extends NodeLike<T>> List<? extends Collection<T>> decompose2(List<T> nodes) {
            int n = nodes.size();
            if (n == 0) return Collections.emptyList();
            if (n == 1) return Collections.singletonList(Collections.singletonList(nodes.get(0)));
            SCCDecomposer<T> decomposer = new SCCDecomposer<>(nodes);
            for (int i = 0; i < n; i++) {
                if (decomposer.ord[i] == -1) decomposer.dfs(i);
            }
            int m = decomposer.groupNum;
            int[] ids = decomposer.ids;
            List<List<T>> res = new ArrayList<>(m);
            int[] count = new int[m];
            for (int i = 0; i < n; i++) count[ids[i] = m - 1 - ids[i]]++;
            for (int i = 0; i < m; i++) res.add(new ArrayList<>(count[i]));
            for (int i = 0; i < n; i++) res.get(ids[i]).add(nodes.get(i));
            return res;
        }

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

    }

    static interface NodeLike<T extends NodeLike<T>> {
        int getIndex();

        Collection<T> getNextNodes();

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

