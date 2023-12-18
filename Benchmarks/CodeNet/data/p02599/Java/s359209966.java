import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pranay2516
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F2 solver = new F2();
        solver.solve(1, in, out);
        out.close();
    }

    static class F2 {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt(), q = in.nextInt(), a[] = in.readIntArray(n);
            HashSet<Integer>[] seg = new HashSet[4 * n + 1];
            for (int i = 0; i < 4 * n + 1; ++i) seg[i] = new HashSet<>();
            buildTree(seg, a, 1, 0, n - 1);
            while (q-- > 0) out.println(query(seg, 1, 0, n - 1, in.nextInt() - 1, in.nextInt() - 1).size());
        }

        void buildTree(HashSet<Integer>[] seg, int[] a, int index, int s, int e) {
            if (s > e) return;
            if (s == e) {
                seg[index].add(a[s]);
                return;
            }
            int mid = (s + e) / 2;
            buildTree(seg, a, 2 * index, s, mid);
            buildTree(seg, a, 2 * index + 1, mid + 1, e);
            seg[index].addAll(seg[2 * index + 1]);
            seg[index].addAll(seg[2 * index]);
        }

        HashSet<Integer> query(HashSet<Integer>[] seg, int index, int s, int e, int qs, int qe) {
            HashSet<Integer> left = new HashSet<>();
            HashSet<Integer> right = new HashSet<>();
            HashSet<Integer> result = new HashSet<>();
            if (qe < s || qs > e) return result;
            if (qs <= s && qe >= e) return seg[index];
            int mid = (s + e) / 2;
            left = query(seg, 2 * index, s, mid, qs, qe);
            right = query(seg, 2 * index + 1, mid + 1, e, qs, qe);
            result.addAll(left);
            result.addAll(right);
            return result;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] readIntArray(int size) {
            int[] array = new int[(int) size];
            for (int i = 0; i < size; i++) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

