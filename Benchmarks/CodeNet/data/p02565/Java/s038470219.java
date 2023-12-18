import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.OptionalInt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.util.Iterator;
import java.nio.CharBuffer;
import java.util.Collection;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
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
        HTwoSAT solver = new HTwoSAT();
        solver.solve(1, in, out);
        out.close();
    }

    static class HTwoSAT {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints();
            long d = in.longs();
            long[] x = new long[n], y = new long[n], z = new long[2 * n];
            in.longs(x, y);
            // 座標圧縮
            System.arraycopy(x, 0, z, 0, n);
            System.arraycopy(y, 0, z, n, n);
            OrderedCompressor cmp = new OrderedCompressor(z);
            // 2-SAT
            int m = cmp.size();
            TwoSat sat = new TwoSat(m);
            for (int i = 0; i < n; i++) sat.or(cmp.map(x[i]) + 1, cmp.map(y[i]) + 1);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < i; j++) {
                    if (cmp.unmap(i) - cmp.unmap(j) >= d) continue;
                    sat.or(-1 - i, -1 - j);
                }
            }
            boolean[] res = sat.solve();
            if (res == null) {
                out.noln();
                return;
            }
            out.yesln();
            for (int i = 0; i < n; i++) {
                out.ans(res[cmp.map(x[i])] ? x[i] : y[i]).ln();
            }
        }

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract String string();

        public long longs() {
            return Long.parseLong(string());
        }

        public final void longs(long[]... arrays) {
            int l = Arrays.stream(arrays).mapToInt(a -> a.length).min().orElse(0);
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = longs();
                }
            }
        }

        public abstract void close();

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
        private LightWriter2.BoolLabel boolLabel = LightWriter2.BoolLabel.YES_NO_FIRST_UP;

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

        public LightWriter2 ans(long l) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
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

        public LightWriter2 ans(boolean b) {
            return ans(boolLabel.transfer(b));
        }

        public LightWriter2 yesln() {
            return ans(true).ln();
        }

        public LightWriter2 noln() {
            return ans(false).ln();
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

        public enum BoolLabel {
            YES_NO_FIRST_UP("Yes", "No"),
            YES_NO_ALL_UP("YES", "NO"),
            YES_NO_ALL_DOWN("yes", "no"),
            Y_N_ALL_UP("Y", "N"),
            POSSIBLE_IMPOSSIBLE_FIRST_UP("Possible", "Impossible"),
            POSSIBLE_IMPOSSIBLE_ALL_UP("POSSIBLE", "IMPOSSIBLE"),
            POSSIBLE_IMPOSSIBLE_ALL_DOWN("possible", "impossible"),
            FIRST_SECOND_FIRST_UP("First", "Second"),
            FIRST_SECOND_ALL_UP("FIRST", "SECOND"),
            FIRST_SECOND_ALL_DOWN("first", "second"),
            ALICE_BOB_FIRST_UP("Alice", "Bob"),
            ALICE_BOB_ALL_UP("ALICE", "BOB"),
            ALICE_BOB_ALL_DOWN("alice", "bob"),
            ;
            private final String positive;
            private final String negative;

            BoolLabel(String positive, String negative) {
                this.positive = positive;
                this.negative = negative;
            }

            private String transfer(boolean f) {
                return f ? positive : negative;
            }

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

    static interface Verified {
    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 32 * 1024;
        private final InputStream stream;
        private final StringBuilder builder = new StringBuilder();
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

        private void loadToken() {
            builder.setLength(0);
            skip();
            for (int b = read(); !isTokenSeparator(b); b = read()) {
                builder.appendCodePoint(b);
            }
        }

        public String string() {
            loadToken();
            return builder.toString();
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

    static class OrderedCompressor implements Iterable<Long> {
        private final Map<Long, Integer> natural = new HashMap<>();
        private final long[] reverse;

        public OrderedCompressor(long... values) {
            int n = values.length, counter = 0;
            long[] tmp = new long[n];
            IntroSort.sort(values);
            for (int i = 0; i < n; i++) {
                if (i != 0 && values[i - 1] == values[i]) continue;
                natural.put(values[i], counter);
                tmp[counter++] = values[i];
            }
            this.reverse = Arrays.copyOf(tmp, counter);
        }

        public OrderedCompressor(Collection<Long> values) {
            this(values.stream().mapToLong(x -> x).toArray());
        }

        public int map(long x) {
            return natural.get(x);
        }

        public long unmap(int x) {
            return reverse[x];
        }

        public int size() {
            return reverse.length;
        }

        public Iterator<Long> iterator() {
            return new Iterator<>() {
                int pos = 0;

                public boolean hasNext() {
                    return pos < reverse.length;
                }

                public Long next() {
                    return reverse[pos++];
                }
            };
        }

    }

    static class QuickSort {
        private QuickSort() {
        }

        private static void med(long[] a, int low, int x, int y, int z) {
            if (a[z] < a[x]) {
                ArrayUtil.swap(a, low, x);
            } else if (a[y] < a[z]) {
                ArrayUtil.swap(a, low, y);
            } else {
                ArrayUtil.swap(a, low, z);
            }
        }

        static int step(long[] a, int low, int high) {
            int x = low + 1, y = low + (high - low) / 2, z = high - 1;
            if (a[x] < a[y]) {
                med(a, low, x, y, z);
            } else {
                med(a, low, y, x, z);
            }

            int lb = low + 1, ub = high;
            while (true) {
                while (a[lb] < a[low]) {
                    lb++;
                }
                ub--;
                while (a[low] < a[ub]) {
                    ub--;
                }
                if (lb >= ub) {
                    return lb;
                }
                ArrayUtil.swap(a, lb, ub);
                lb++;
            }
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void swap(long[] a, int x, int y) {
            long t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static class SCCDecomposer {
        private SCCDecomposer() {
            throw new UnsupportedOperationException();
        }

        public static <T extends NodeLike<T>> List<? extends Collection<T>> decompose(T... nodes) {
            return decompose(Arrays.asList(nodes));
        }

        public static <T extends NodeLike<T>> List<? extends Collection<T>> decompose(List<T> nodes) {
            int n = nodes.size(), allocated = 0;
            boolean[] visited = new boolean[n];
            int[] counter = new int[n];
            for (int i = 0; i < n; i++) {
                if (visited[i]) continue;
                allocated = allocate(nodes.get(i), allocated, counter, visited);
            }
            int[] order = new int[n];
            for (int i = 0; i < n; i++) order[n - counter[i] - 1] = i;
            List<List<T>> result = new ArrayList<>();
            for (int i : order) {
                if (counter[i] == -1) continue;
                List<T> group = new ArrayList<>();
                makeGroup(nodes.get(i), counter, group);
                result.add(group);
            }
            return result;
        }

        private static int allocate(NodeLike<?> node, int allocated, int[] counter, boolean[] visited) {
            visited[node.getIndex()] = true;
            for (NodeLike<?> next : node.getNextNodes()) {
                if (visited[next.getIndex()]) continue;
                allocated = allocate(next, allocated, counter, visited);
            }
            counter[node.getIndex()] = allocated;
            return allocated + 1;
        }

        private static <T extends NodeLike<T>> void makeGroup(T node, int[] counter, List<T> group) {
            counter[node.getIndex()] = -1;
            group.add(node);
            for (T next : node.getPrevNodes()) {
                if (counter[next.getIndex()] == -1) continue;
                makeGroup(next, counter, group);
            }
        }

    }

    static class HeapSort {
        private HeapSort() {
        }

        private static void heapfy(long[] a, int low, int high, int i, long val) {
            int child = 2 * i - low + 1;
            while (child < high) {
                if (child + 1 < high && a[child] < a[child + 1]) {
                    child++;
                }
                if (val >= a[child]) {
                    break;
                }
                a[i] = a[child];
                i = child;
                child = 2 * i - low + 1;
            }
            a[i] = val;
        }

        static void sort(long[] a, int low, int high) {
            for (int p = (high + low) / 2 - 1; p >= low; p--) {
                heapfy(a, low, high, p, a[p]);
            }
            while (high > low) {
                high--;
                long pval = a[high];
                a[high] = a[low];
                heapfy(a, low, high, low, pval);
            }
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            return Integer.bitCount(v);
        }

        public static int msb(int v) {
            if (v == 0) {
                throw new IllegalArgumentException("Bit not found");
            }
            v |= (v >> 1);
            v |= (v >> 2);
            v |= (v >> 4);
            v |= (v >> 8);
            v |= (v >> 16);
            return count(v) - 1;
        }

    }

    static interface NodeLike<T extends NodeLike<T>> {
        int getIndex();

        Collection<T> getNextNodes();

        default Collection<T> getPrevNodes() {
            // default implementation for an *undirected* graph
            return getNextNodes();
        }

    }

    static class TwoSat {
        private final int n;
        private final TwoSat.Node[] nodes;

        public TwoSat(int n) {
            this.n = n;
            this.nodes = new TwoSat.Node[2 * n];
            for (int i = 0; i < 2 * n; i++) nodes[i] = new TwoSat.Node(i);
        }

        private int encodeIndex(int x) {
            if (0 < x) {
                if (n < x) throw new IllegalArgumentException();
                return x - 1;
            } else if (x < 0) {
                if (x < -n) throw new IllegalArgumentException();
                return n - x - 1;
            } else throw new IllegalArgumentException();
        }

        public void implies(int x, int y) {
            x = encodeIndex(x);
            y = encodeIndex(y);
            nodes[x].next.add(nodes[y]);
            nodes[y].prev.add(nodes[x]);
        }

        public void or(int x, int y) {
            implies(-x, y);
            implies(-y, x);
        }

        public boolean[] solve() {
            List<? extends Collection<TwoSat.Node>> groups = SCCDecomposer.decompose(nodes);
            int m = groups.size();
            int[] ord = new int[2 * n];
            for (int i = 0; i < m; i++) {
                for (TwoSat.Node node : groups.get(i)) ord[node.index] = i;
            }
            //System.out.println(m + "/" + Arrays.toString(ord));
            boolean[] result = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (ord[i] == ord[n + i]) return null;
                result[i] = ord[i] > ord[n + i];
            }
            return result;
        }

        private static class Node implements NodeLike<TwoSat.Node> {
            final int index;
            final List<TwoSat.Node> next = new ArrayList<>();
            final List<TwoSat.Node> prev = new ArrayList<>();

            Node(int index) {
                this.index = index;
            }

            public int getIndex() {
                return index;
            }

            public Collection<TwoSat.Node> getNextNodes() {
                return next;
            }

            public Collection<TwoSat.Node> getPrevNodes() {
                return prev;
            }

        }

    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static void sort(long[] a, int low, int high) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && a[j - 1] > a[j]; j--) {
                    ArrayUtil.swap(a, j - 1, j);
                }
            }
        }

    }

    static class IntroSort {
        private static int INSERTIONSORT_THRESHOLD = 16;

        private IntroSort() {
        }

        static void sort(long[] a, int low, int high, int maxDepth) {
            while (high - low > INSERTIONSORT_THRESHOLD) {
                if (maxDepth-- == 0) {
                    HeapSort.sort(a, low, high);
                    return;
                }
                int cut = QuickSort.step(a, low, high);
                sort(a, cut, high, maxDepth);
                high = cut;
            }
            InsertionSort.sort(a, low, high);
        }

        public static void sort(long[] a) {
            if (a.length <= INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(a, 0, a.length);
            } else {
                sort(a, 0, a.length, 2 * BitMath.msb(a.length));
            }
        }

    }
}

