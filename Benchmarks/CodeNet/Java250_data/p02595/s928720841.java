import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
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
        BDistance solver = new BDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDistance {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long d = in.nextInt();
            d = d * d;
            Point[] points = Point.readPoints(in, n);

            int answer = 0;
            for (Point p : points) {
                if (p.norm() <= d)
                    answer++;
            }

            out.println(answer);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

    static class Point implements Comparable<Point> {
        public long x;
        public long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public static Point read(InputReader in) {
            return new Point(in.nextLong(), in.nextLong());
        }

        public static Point[] readPoints(InputReader in, int n) {
            Point[] p = new Point[n];
            for (int i = 0; i < n; i++) {
                p[i] = read(in);
            }
            return p;
        }

        public long norm() {
            return x * x + y * y;
        }

        public String toString() {
            return String.format("(%d, %d)", x, y);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

        public int compareTo(Point o) {
            int ret = Long.compare(x, o.x);
            if (ret != 0)
                return ret;
            return Long.compare(y, o.y);
        }

    }
}

