import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.TreeSet;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            AReachableTowns solver = new AReachableTowns();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class AReachableTowns {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            Point[] pts = new Point[n];
            for (int i = 0; i < n; i++) {
                pts[i] = new Point();
                pts[i].x = in.readInt();
                pts[i].y = in.readInt();
                pts[i].id = i;
            }
            Point[] sorted = pts.clone();
            Arrays.sort(sorted, (a, b) -> -Integer.compare(a.x, b.x));
            DSUExt dsu = new DSUExt(n);
            dsu.reset();
            TreeSet<Point> map = new TreeSet<>((a, b) -> Integer.compare(a.y, b.y));
            for (Point pt : sorted) {
                Point largest = null;
                while (true) {
                    Point ceil = map.ceiling(pt);
                    if (ceil == null) {
                        break;
                    }
                    largest = ceil;
                    dsu.merge(pt.id, ceil.id);
                    map.remove(ceil);
                }
                if (largest != null) {
                    map.add(largest);
                } else {
                    map.add(pt);
                }
            }

            for (Point pt : pts) {
                out.println(dsu.size[dsu.find(pt.id)]);
            }
        }

    }

    static class DSU {
        protected int[] p;
        protected int[] rank;

        public DSU(int n) {
            p = new int[n];
            rank = new int[n];
        }

        public void reset() {
            for (int i = 0; i < p.length; i++) {
                p[i] = i;
                rank[i] = 0;
            }
        }

        public final int find(int a) {
            if (p[a] == p[p[a]]) {
                return p[a];
            }
            preAccess(a);
            return p[a] = find(p[a]);
        }

        protected void preAccess(int a) {

        }

        protected void preMerge(int a, int b) {

        }

        public final void merge(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) {
                return;
            }
            if (rank[a] == rank[b]) {
                rank[a]++;
            }

            if (rank[a] < rank[b]) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            preMerge(a, b);
            p[b] = a;
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static class Point {
        int id;
        int x;
        int y;

    }

    static class DSUExt extends DSU {
        int[] size;

        public DSUExt(int n) {
            super(n);
            size = new int[n];
        }

        public void reset() {
            super.reset();
            Arrays.fill(size, 1);
        }

        protected void preMerge(int a, int b) {
            super.preMerge(a, b);
            size[a] += size[b];
        }

    }
}

