import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point a = new Point();
        Point b = new Point();
        a.x = 0;
        a.y = 0;
        b.x = 100;
        b.y = 0;

        System.out.println(a.x + " " + a.y);
        koch(n, a, b);
        System.out.println(b.x + " " + b.y);
     }

    public static void koch(int n, Point a, Point b){
        if(n == 0) return;
        Point s = new Point();
        Point t = new Point();
        Point u = new Point();
        double th = (Math.PI / 180) * 60;

        s.x = (2.0 * a.x + 1.0 * b.x) / 3.0;
        s.y = (2.0 * a.y + 1.0 * b.y) / 3.0;
        t.x = (1.0 * a.x + 2.0 * b.x) / 3.0;
        t.y = (1.0 * a.y + 2.0 * b.y) / 3.0;
        u.x = (t.x - s.x) * Math.cos(th) - (t.y - s.y) * Math.sin(th) + s.x;
        u.y = (t.x - s.x) * Math.sin(th) + (t.y - s.y) * Math.cos(th) + s.y;

        koch(n - 1, a, s);
        System.out.println(s.x + " " + s.y);
        koch(n - 1, s, u);
        System.out.println(u.x + " " + u.y);
        koch(n - 1, u, t);
        System.out.println(t.x + " " + t.y);
        koch(n - 1, t, b);
    }

}


class Point{
    double x, y;
}