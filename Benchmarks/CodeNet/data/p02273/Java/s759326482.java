import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point p1 = new Point(0, 0), p2 = new Point(100, 0);
        System.out.println(p1.x + " " + p1.y);
        kochCurve(n, p1, p2);
        System.out.println(p2.x + " " + p2.y);
    }

    private static void kochCurve(int count, Point p1, Point p2) {
        if (count == 0) {
            return;
        }
        double a = Math.PI * 60 / 180;
        Point s = new Point((2 * p1.x + 1 * p2.x) / 3, (2 * p1.y + 1 * p2.y) / 3);
        Point t = new Point((1 * p1.x + 2 * p2.x) / 3, (1 * p1.y + 2 * p2.y) / 3);
        Point u = new Point((t.x - s.x) * Math.cos(a) - (t.y - s.y) * Math.sin(a) + s.x,
                            (t.x - s.x) * Math.sin(a) + (t.y - s.y) * Math.cos(a) + s.y);

        kochCurve(count - 1, p1, s);
        System.out.println(s.x + " " + s.y);
        kochCurve(count - 1, s, u);
        System.out.println(u.x + " " + u.y);
        kochCurve(count - 1, u, t);
        System.out.println(t.x + " " + t.y);
        kochCurve(count - 1, t, p2);
    }

    static class Point {

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double x;
        double y;
    }
}