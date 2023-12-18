
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] A = new int[50];
    static double th = Math.PI * 60.0 / 180.0;

    public static void main(String[] args) throws IOException{

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // ??????
       Point P1 = new Point(0, 0);
       Point P2 = new Point(100, 0);
       System.out.printf("%.8f %.8f\n", P1.x, P1.y);
       koch(n, P1, P2);
       System.out.printf("%.8f %.8f\n", P2.x, P2.y);
    }

    public static void koch(int d, Point P1, Point P2){
        if(d == 0) return;

        double x1 = P1.x;
        double y1 = P1.y;
        double x2 = P2.x;
        double y2 = P2.y;

        double sx = (2 * x1 + x2) / 3;
        double sy = (2 * y1 + y2) / 3;
        double tx = (x1 + 2 * x2) / 3;
        double ty = (y1 + 2 * y2) / 3;
        double ux = sx + (tx - sx) * Math.cos(th) - (ty - sy) * Math.sin(th);
        double uy = sy + (tx - sx) * Math.sin(th) + (ty - sy) * Math.cos(th);

        Point S = new Point(sx, sy);
        Point T = new Point(tx, ty);
        Point U = new Point(ux, uy);

        koch(d - 1, P1, S);
        System.out.printf("%.8f %.8f\n", sx, sy);
        koch(d -1, S, U);
        System.out.printf("%.8f %.8f\n", ux, uy);
        koch(d - 1, U, T);
        System.out.printf("%.8f %.8f\n", tx, ty);
        koch(d -1, T, P2);

    }

}

class Point{
    double x;
    double y;

    Point(double a, double b){
        x = a;
        y = b;
    }
}