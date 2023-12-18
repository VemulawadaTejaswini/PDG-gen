import java.util.*;
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    int N; // 2<=N<=200000
    Point[] points;
    long result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        points = new Point[N];
        for (int i=0; i<N; i++) {
            Point point = new Point();
            point.x = sc.nextLong();
            point.y = sc.nextLong();
            points[i] = point;
        }
        result = 0L;
    }

    private void solve() {
        for (int i=0; i<N; i++) {
            Point p1 = points[i];
            for (int j=i; j<N; j++) {
                Point p2 = points[j];
                long d = p1.getDistance(p2);
                if (result < d) {
                    result = d;
                }
            }
        }
    }

    private void output() {
        System.out.println(result);
    }
}

class Point {
    long x;
    long y;

    long getDistance(Point p) {
        long x = p.x - this.x;
        if (x < 0) { x = x*(-1); }
        long y = p.y - this.y;
        if (y < 0) { y = y*(-1); }
        return x + y;
    }
}