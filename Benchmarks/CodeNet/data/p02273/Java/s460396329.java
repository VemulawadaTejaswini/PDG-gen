import java.io.*;

public class Main {

    class Point {
        public final double x;
        public final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("%f %f", x, y);
        }
    }

    void f(int n, Point s, Point e) {
        if (n == 0) return;
        double unitX = e.x - s.x;
        double unitY = e.y - s.y;
        Point e1 = new Point(s.x + unitX / 3, s.y + unitY / 3);
        f(n - 1, s, e1);
        System.out.println(e1.toString());
        Point e2 =
                new Point(e1.x + unitX / 3 * Math.cos(Math.PI / 3) - unitY / 3 * Math.sin(Math.PI / 3),
                        e1.y + unitX / 3 * Math.sin(Math.PI / 3) + unitY / 3 * Math.cos(Math.PI / 3));
        f(n - 1, e1, e2);
        System.out.println(e2.toString());
        Point e3 = new Point(s.x + unitX * 2 / 3, s.y + unitY * 2 / 3);
        f(n - 1, e2, e3);
        System.out.println(e3.toString());
        f(n - 1, e3, e);
    }

    void solve() {
        int n = io.nextInt();
        Point s = new Point(0, 0);
        Point e = new Point(100, 0);
        System.out.println(s.toString());
        f(n, s, e);
        System.out.println(e.toString());
    }

    boolean f(int n, int[] A, int idx, int sum) {
        if (idx == A.length) return n == sum;
        return f(n, A, idx + 1, sum + A[idx]) || f(n, A, idx + 1, sum);
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    IO io = new IO();

    class IO {
        private final int SIZE = 1 << 12;
        private final InputStream stream = System.in;
        private final byte[] buffer = new byte[SIZE];
        private int ptr = 0, buffLen = 0;

        private boolean hasNextByte() {
            if (ptr < buffLen) return true;
            ptr = 0;
            try {
                buffLen = stream.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffLen > 0;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isAscii(byte i) {
            return '!' <= i && i <= '~';
        }

        public char nextChar() {
            byte b = readByte();
            while (!isAscii(b)) b = readByte();
            return (char) b;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while (isAscii(b)) {
                sb.append((char) b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            return Integer.valueOf(next());
        }

        public long nextLong() {
            return Long.valueOf(next());
        }

        public double nextDouble() {
            return Double.valueOf(next());
        }
    }
}

