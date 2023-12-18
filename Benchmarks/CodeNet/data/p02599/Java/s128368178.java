import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FRangeSetQuery solver = new FRangeSetQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRangeSetQuery {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), queryCount = in.nextInt();
            int[] c = in.readIntArray(n);
            for (int i = 0; i < n; i++) {
                c[i]--;
            }
            Pii[] queries = new Pii[queryCount];
            for (int i = 0; i < queryCount; i++) {
                queries[i] = Pii.of(in.nextInt() - 1, in.nextInt());
            }

            List<Integer>[] byEnd = Util.arrayOfLists(n + 1);
            for (int i = 0; i < queryCount; i++) {
                byEnd[queries[i].second].add(i);
            }

            IntSumSegmentTree st = new IntSumSegmentTree(n);
            int[] last = new int[n];
            Arrays.fill(last, -1);

            int[] answer = new int[queryCount];
            for (int i = 0; i < n; i++) {
                if (last[c[i]] != -1) {
                    st.update(last[c[i]], 0);
                }

                st.update(i, 1);
                last[c[i]] = i;

                for (int j : byEnd[i + 1]) {
                    answer[j] = st.query(queries[j].first, queries[j].second);
                }
            }

            for (int x : answer)
                out.println(x);
        }

    }

    static class Util {
        private Util() {
        }

        public static <T> List<T>[] arrayOfLists(int n) {
            List<T>[] array = new List[n];
            for (int i = 0; i < n; i++) {
                array[i] = new ArrayList<>();
            }
            return array;
        }

    }

    static class InputReader {
        public final BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class IntSumSegmentTree {
        public final int size;
        public final int[] value;

        public IntSumSegmentTree(int size) {
            this.size = size;
            value = new int[2 * size];
        }

        public void update(int i, int v) {
            i += size;
            value[i] = v;
            while (i > 1) {
                i /= 2;
                value[i] = value[2 * i] + value[2 * i + 1];
            }
        }

        public int query(int i, int j) {
            int res_left = 0, res_right = 0;
            for (i += size, j += size; i < j; i /= 2, j /= 2) {
                if ((i & 1) == 1) {
                    int b = value[i++];
                    res_left = res_left + b;
                }
                if ((j & 1) == 1) {
                    int a = value[--j];
                    res_right = a + res_right;
                }
            }
            return res_left + res_right;
        }

    }

    static class Pii implements Comparable<Pii> {
        public final int first;
        public final int second;

        public Pii(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public static Pii of(int first, int second) {
            return new Pii(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pii pair = (Pii) o;
            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            return Arrays.hashCode(new int[]{first, second});
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
        }

        public int compareTo(Pii o) {
            if (first != o.first)
                return Integer.compare(first, o.first);
            return Integer.compare(second, o.second);
        }

    }
}

