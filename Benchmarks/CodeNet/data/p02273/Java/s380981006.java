import java.util.Scanner;

public class Main {

    private static class Point {
        double x = 0;
        double y = 0;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("%.5f %.5f", x, y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Point min = new Point(0, 0);
        Point max = new Point(100, 0);

        System.out.println(min);
        koch(min, max, n);
        System.out.println(max);
    }

    private static void koch(Point min, Point max, int n) {
        if (n == 0) return;
        double sx = (2*min.x+1*max.x) / 3;
        double sy = (2*min.y+1*max.y) / 3;
        Point s = new Point(sx, sy);

        double tx = (1*min.x+2*max.x) / 3;
        double ty = (1*min.y+2*max.y) / 3;
        Point t = new Point(tx, ty);

        double ux = (tx-sx)*Math.cos(Math.toRadians(60)) - (ty-sy)*Math.sin(Math.toRadians(60))+sx;
        double uy = (tx-sx)*Math.sin(Math.toRadians(60)) + (ty-sy)*Math.cos(Math.toRadians(60))+sy;
        Point u = new Point(ux, uy);

        koch(min, s, n-1);
        System.out.println(s);
        koch(s, u, n-1);
        System.out.println(u);
        koch(u, t, n-1);
        System.out.println(t);
        koch(t, max, n-1);
    }
}

