import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Point start = new Point(0, 0);
        Point end = new Point(100, 0);
        System.out.println(start);
        kochCurve(n, start, end);
        System.out.println(end);
    }

    private static void kochCurve(int n, Point p1, Point p2) {
        if (n == 0) {
            return;
        }

        Point s;
        Point t;
        Point u;

        s = new Point(2 * p1.x / 3d + p2.x / 3d,
                2 * p1.y / 3d + p2.y / 3d);
        t = new Point(2 * p2.x / 3d + p1.x / 3d,
                2 * p2.y / 3d + p1.y / 3d);
        u = new Point((p2.x + p1.x) / 2d - Math.sqrt(3d) / 6d * (p2.y - p1.y),
                (p2.y + p1.y) / 2d + Math.sqrt(3d) / 6d * (p2.x - p1.x));

        kochCurve(n-1, p1, s);
        System.out.println(s);
        kochCurve(n-1, s, u);
        System.out.println(u);
        kochCurve(n-1, u, t);
        System.out.println(t);
        kochCurve(n-1, t, p2);
    }

    private static class Point {
        double x;
        double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("%.8f %.8f", x, y);
        }
    }
}

