import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDoubleDots solver = new DDoubleDots();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDoubleDots {
        int[] ans;
        ArrayList<Integer>[] a;
        boolean[] vis;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            a = new ArrayList[n];
            vis = new boolean[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
            ans = new int[n];
            while (m-- > 0) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1;
                a[u].add(v);
                a[v].add(u);
            }
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            vis[0] = true;
            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int i : a[cur])
                    if (!vis[i]) {
                        vis[i] = true;
                        ans[i] = cur;
                        q.add(i);
                    }
            }
            for (int i = 1; i < n; i++)
                if (!vis[i]) {
                    w.println("No");
                    return;
                }
            w.println("Yes");
            for (int i = 1; i < n; i++) w.println(++ans[i]);
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

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

