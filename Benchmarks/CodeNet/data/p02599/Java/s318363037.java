import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeMap;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author fakhoury
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FRangeSetQuery solver = new FRangeSetQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRangeSetQuery {
        void add(int value, TreeMap<Integer, Integer> map) {
            Integer old = map.get(value);
            if (old == null) old = 0;
            map.put(value, old + 1);
        }

        void rem(int value, TreeMap<Integer, Integer> map) {
            Integer old = map.get(value);
            if (old == 1) {
                map.remove(value);
            } else {
                map.put(value, old - 1);
            }
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            Query[] queries = new Query[q];
            for (int i = 0; i < q; i++) {
                queries[i] = new Query(in.nextInt() - 1, in.nextInt() - 1, i);
            }

            int blockSize = (int) Math.sqrt(n);

            Collections.sort(Arrays.asList(queries), new Comparator<Query>() {

                public int compare(Query query, Query t1) {
                    int ret = query.left / blockSize - t1.left / blockSize;
                    if (ret == 0)
                        ret = query.right / blockSize - t1.right / blockSize;
                    return ret;
                }
            });

            int[] answer = new int[q];

            TreeMap<Integer, Integer> map = new TreeMap<>();

            int left = 1, right = 0;
            for (Query query : queries) {
                while (right < query.right) add(a[++right], map);
                while (right > query.right) rem(a[right--], map);
                while (left < query.left) rem(a[left++], map);
                while (left > query.left) add(a[--left], map);
                answer[query.id] = map.size();
            }

            for (int i : answer)
                out.println(i);
        }

        class Query {
            int left;
            int right;
            int id;

            public Query(int left, int right, int id) {
                this.left = left;
                this.right = right;
                this.id = id;
            }

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

        public int nextInt() {
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

        public void println(int i) {
            writer.println(i);
        }

    }
}

