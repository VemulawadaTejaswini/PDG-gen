import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DFriends solver = new DFriends();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriends {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
//    	w.print("Case #"+testNumber+": ");
            int n = c.readInt(), m = c.readInt();
            UnionFind dsu = new UnionFind(n);
            for (int i = 0; i < m; i++) {
                int u = c.readInt() - 1, v = c.readInt() - 1;
                dsu.unify(u, v);
            }

            int max = 1;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, dsu.componentSize(i));
            }
            w.printLine(max);

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class UnionFind {
        private int size;
        private int[] sz;
        private int[] id;
        private int numComponents;

        public UnionFind(int size) {

            if (size <= 0) {
                throw new IllegalArgumentException("Size <= 0 is not allowed");
            }

            this.size = numComponents = size;
            sz = new int[size];
            id = new int[size];

            for (int i = 0; i < size; i++) {
                id[i] = i;
                sz[i] = 1;
            }
        }

        public int find(int p) {

            int root = p;
            while (root != id[root]) {
                root = id[root];
            }

            while (p != root) {
                int next = id[p];
                id[p] = root;
                p = next;
            }

            return root;
        }

        public int componentSize(int p) {
            return sz[find(p)];
        }

        public void unify(int p, int q) {

            int root1 = find(p);
            int root2 = find(q);

            if (root1 == root2) {
                return;
            }

            if (sz[root1] < sz[root2]) {
                sz[root2] += sz[root1];
                id[root1] = root2;
            } else {
                sz[root1] += sz[root2];
                id[root2] = root1;
            }
            numComponents--;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

