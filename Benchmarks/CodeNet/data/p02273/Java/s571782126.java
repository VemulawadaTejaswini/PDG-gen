import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Point start = new Point(0.0, 0.0);
        Point end = new Point(100.0, 0);

        start.print();
        koch(n, start, end);
        end.print();
    }

    private static void koch(int d, Point p1, Point p2) {
        if (d == 0) return;

        // s, u, tの座標を計算
        Point s = new Point(
                (2.0 * p1.x + 1.0 * p2.x) / 3,
                (2.0 * p1.y + 1.0 * p2.y) / 3);
        Point t = new Point(
                (1.0 * p1.x + 2.0 * p2.x) / 3,
                (1.0 * p1.y + 2.0 * p2.y) / 3);
        double th = Math.PI * 60.0 / 180.0;
        Point u = new Point(
                (t.x - s.x) * Math.cos(th) - (t.y - s.y) * Math.sin(th) + s.x,
                (t.x - s.x) * Math.sin(th) - (t.y - s.y) * Math.cos(th) + s.y);

        koch(d - 1, p1, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, p2);

    }

}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.printf("%.8f %.8f%n", this.x, this.y);
    }
}
