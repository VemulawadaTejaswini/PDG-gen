import java.util.Scanner;

class Main {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            Point p = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.println(crossProduct(sub(a,b), sub(b, p)) < 0.0 &&
                    crossProduct(sub(b,c), sub(c, p)) < 0.0 &&
                    crossProduct(sub(c, a), sub(a, p)) < 0.0 ||
                    crossProduct(sub(a,b), sub(b, p)) > 0.0 &&
                    crossProduct(sub(b,c), sub(c, p)) > 0.0 &&
                    crossProduct(sub(c, a), sub(a, p)) > 0.0 ? "YES" : "NO");
        }
    }

    static double crossProduct(Point a, Point b) {
        return a.x * b.y - a.y * b.x;
    }
    static Point sub(Point a, Point b) {
        return new Point(b.x-a.x,b.y-a.y);
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

