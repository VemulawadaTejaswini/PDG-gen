import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

/**
 * @see <a href='http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?lang=jp&id='>??????</a>
 */
public class Main {
    private static FastReader in = new FastReader();
    private static final double SQRT3 = Math.sqrt(3d);

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.run();
    }

    private void run() {
        int n = in.nextInt();

        List<Point> points = Arrays.asList(Point.of(0, 0), Point.of(100, 0));
        for (int i = 0; i < n; i++) {
            List<Point> newPoints = new ArrayList<>(points.size() * 4 - 3);
            for (int j = 0; j < points.size() - 1; j++) {
                Point temp = points.get(j);
                Point next = points.get(j + 1);
                newPoints.add(temp);
                addPointsBetweem(newPoints, temp, next);
            }
            newPoints.add(points.get(points.size() - 1));
            points = newPoints;
        }

        points.forEach(System.out::println);
    }

    private void addPointsBetweem(List<Point> points, Point temp, Point next) {
        points.add(temp.internalDivide(next, 1d, 3d));
        switch (directBetween(temp, next)) {
            case HORIZONTAL:
                points.add(Point.of((temp.x + next.x) / 2, temp.y + (next.x - temp.x) / 2 / SQRT3));
                break;
            case RIGHT_UPWARD:
                points.add(Point.of(temp.x, (temp.y + 2d * next.y) / 3));
                break;
            case RIGHT_DOWNWARD:
                points.add(Point.of(next.x, (2d * temp.y + next.y) / 3));
                break;
            default:
                System.exit(-1);
        }
        points.add(temp.internalDivide(next, 2d, 3d));
    }

    private Direction directBetween(Point temp, Point next) {
        if (temp.y == next.y) {
            return Direction.HORIZONTAL;
        }
        if (Math.signum(next.y - temp.y) == Math.signum(next.x - temp.x)) {
            return Direction.RIGHT_UPWARD;
        }
        return Direction.RIGHT_DOWNWARD;
    }

    enum Direction {
        HORIZONTAL, RIGHT_DOWNWARD, RIGHT_UPWARD,
    }

    private static class Point {
        double x;
        double y;

        static Point of(double x, double y) {
            Point newInstance = new Point();
            newInstance.x = x;
            newInstance.y = y;
            return newInstance;
        }

        Point internalDivide(Point opponent, double numerator, double denominator) {
            double coefficientThis = denominator - numerator;
            return Point.of(
                    (coefficientThis * x + numerator * opponent.x) / denominator,
                    (coefficientThis * y + numerator * opponent.y) / denominator
            );
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

}

class FastReader {
    private InputStream in = System.in;
    private byte[] buf = new byte[1024];
    private int charNum;
    private int charLen;
    private StringBuilder sb = new StringBuilder();

    public int read() {
        if (charLen == -1)
            throw new InputMismatchException();
        if (charNum >= charLen) {
            charNum = 0;
            try {
                charLen = in.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (charLen <= 0)
                return -1;
        }
        return buf[charNum++];
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isWhitespace(c));
        return res * sgn;
    }

    public boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}