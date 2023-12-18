import java.util.Scanner;

class  Point{
    double x;
    double y;

    Point(){}

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(100, 0);

        System.out.println(String.format("%.8f", p1.x) + " " + String.format("%.8f", p1.y));
        koch(n, p1, p2);
        System.out.println(String.format("%.8f", p2.x) + " " + String.format("%.8f", p2.y));
    }

    private static void koch(int n, Point p1, Point p2) {

        if (n == 0){
            return;
        }

        // ?°??§??????¬????????§???
        double th = Math.PI * 60.0 / 180.0;

        Point s = new Point();
        Point t = new Point();
        Point u = new Point();

        s.x = (2*p1.x + p2.x) / 3;
        s.y = (2*p1.y + p2.y) / 3;

        t.x = (p1.x + 2*p2.x) / 3;
        t.y = (p1.y + 2*p2.y) / 3;

        u.x = (t.x - s.x) * Math.cos(th) - (t.y - s.y) * Math.sin(th) + s.x;
        u.y = (t.x - s.x) * Math.sin(th) + (t.y - s.y) * Math.cos(th) + s.y;

        koch(n-1, p1, s);
        System.out.println(String.format("%.8f", s.x) + " " + String.format("%.8f", s.y));
        koch(n-1, s, u);
        System.out.println(String.format("%.8f", u.x) + " " + String.format("%.8f", u.y));
        koch(n-1, u, t);
        System.out.println(String.format("%.8f", t.x) + " " + String.format("%.8f", t.y));
        koch(n-1, t, p2);
    }
}