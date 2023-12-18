import java.io.*;
import java.util.*;
import java.awt.geom.*;

class Circle {
    public Point2D.Double o;
    public double r;
    Circle() {
        this.o = new Point2D.Double(0, 0);
        this.r = 0;
    }
    Circle(Point2D.Double o, double r) {
        this.o = o;
        this.r = r;
    }
    Point2D.Double[] intersectionPoint(Circle c) {
        Point2D.Double[] ip = new Point2D.Double[2];
        double l = o.distance(c.o);
        double a = Math.atan2(c.o.y - o.y, c.o.x - o.x);
        double t = Math.acos((r*r - c.r*c.r + l*l) / (2 * l * r));
        ip[0] = new Point2D.Double(r*Math.cos(a+t) + o.x, r*Math.sin(a+t) + o.y);
        ip[1] = new Point2D.Double(r*Math.cos(a-t) + o.x, r*Math.sin(a-t) + o.y);
        return ip;
    }
}

public class Main {
    int n;
    Circle[] cs;
    Point2D.Double[] p;
    Scanner sc;

    Main() {
        sc = new Scanner(System.in);
    }

    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        cs = new Circle[n];
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double r = sc.nextDouble();
            cs[i] = new Circle(new Point2D.Double(x, y), r);
        }

        p = new Point2D.Double[2*n];
        p[0] = cs[0].o; p[2*n-1] = cs[n-1].o;
        for (int i = 0; i < n-1; i++) {
            Point2D.Double[] _p = cs[i].intersectionPoint(cs[i+1]);
            p[i*2+1] = _p[0];
            p[i*2+2] = _p[1];
        }
 
//        for (int i = 0; i < 2*n; i++) {
//            System.out.println(p[i]);
//        }
        return true;
    }

    void run() {
        while (init()) {
            double[][] graph = new double[2*n][2*n];
            for (int i = 0; i < 2*n; i++) 
                for (int j = 0; j < 2*n; j++) 
                    graph[i][j] = 1e18;
 
            for (int i = 0; i < 2*n; i++) {
                for (int j = 0; j < 2*n; j++) {
                    Line2D.Double line = new Line2D.Double(p[i], p[j]);
                    if (0 <= j - i && j - i <= 2) {
                        graph[i][j] = p[i].distance(p[j]);
                        graph[j][i] = graph[i][j];
                    } else {
                        for (int k = (i+1)/2+1; k < (j+1)/2; k++) {
                            if (!line.intersectsLine(new Line2D.Double(p[k*2-1], p[k*2]))) {
//                                System.out.println("Line " + (k*2-1) + "," + k*2 + 
//                                        " and Line " + i + "," + j + " are not intersects");
                                graph[i][j] = 1e18;
                                break;
                            }
                            graph[i][j] = p[i].distance(p[j]);
                            graph[j][i] = graph[i][j];
                        }
                    }
                }
            }

            for (int k = 0; k < 2*n; k++) 
                for (int i = 0; i < 2*n; i++) 
                    for (int j = 0; j < 2*n; j++) 
                        graph[i][j] = Math.min(graph[i][j], graph[i][k]+graph[k][j]);

            System.out.println(graph[0][2*n-1]);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}