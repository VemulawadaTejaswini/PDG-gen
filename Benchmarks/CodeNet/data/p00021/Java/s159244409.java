import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final double eps = 1e-10;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            Point d = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.println(cross(sub(a, b), sub(c, d)) < eps ? "YES" : "NO");
        }
    }

    static Point sub(Point a, Point b) {
        return new Point(b.x - a.x, b.y - a.y);
    }

    static double cross(Point a, Point b) {
        return a.x * b.y - a.y * b.x;
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

