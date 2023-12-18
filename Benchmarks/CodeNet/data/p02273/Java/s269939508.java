import java.util.Scanner;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

     public void show() {
        System.out.println(x + " " + y);
     }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point left = new Point(0, 0);
        Point right = new Point(100, 0);
        left.show();
        showKochCurve(n, left, right);
        right.show();
    }

    static void showKochCurve(int n, Point p1, Point p2) {
        if (n == 0) {
            return;
        }
        Point s = new Point((2 * p1.x + p2.x) / 3, (2 * p1.y + p2.y) / 3);
        Point t = new Point((p1.x + 2 * p2.x) / 3, (p1.y + 2 * p2.y) / 3);
        Point u = new Point((t.x - s.x) / 2 - (t.y - s.y) * Math.sqrt(3) / 2 + s.x,
                (t.x - s.x) * Math.sqrt(3) / 2 + (t.y - s.y) / 2 + s.y);
        showKochCurve(n - 1, p1, s);
        s.show();
        showKochCurve(n - 1, s, u);
        u.show();
        showKochCurve(n - 1, u, t);
        t.show();
        showKochCurve(n - 1, t, p2);
    }
}

