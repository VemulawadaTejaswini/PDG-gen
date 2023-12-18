import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            double[] a = new double[8];
            for(int i=0;i<8;i++)a[i]=sc.nextDouble();
            double e = (a[2]-a[0])*(a[7]-a[5])-(a[3]-a[1])*(a[6]-a[4]);
            System.out.println(e==0?"YES":"NO");
//            Point a = new Point(sc.nextDouble(), sc.nextDouble());
//            Point b = new Point(sc.nextDouble(), sc.nextDouble());
//            Point c = new Point(sc.nextDouble(), sc.nextDouble());
//            Point d = new Point(sc.nextDouble(), sc.nextDouble());
//            double e = (b.x-a.x)*(d.y-c.y)-(b.y-a.y)*(d.x-c.x);
//            System.out.println(e==0?"YES":"NO");
           // System.out.println(cross(sub(a, b), sub(c, d)) == 0 ? "YES" : "NO");
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


