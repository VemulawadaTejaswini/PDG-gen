// package codecheck;

import java.util.Scanner;
import java.util.Arrays;

class Geometries {
    static double EPS = 1e-9;
    class Point implements Comparable<Point> {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point o) {
            if (Math.abs(x - o.x) > EPS)
                return (int) Math.signum(x - o.x);
            else
                return (int) Math.signum(y - o.y);
        }

        Point add(Point p) {
            return new Point(x + p.x, y + p.y);
        }
     
        Point subtract(Point p) {
            return new Point(x - p.x, y - p.y);
        }
     
        Point multiply(double k) {
            return new Point(x * k, y * k);
        }
     
        Point devide(double k) {
            return new Point(x / k, y / k);
        }
    }

    class Segment {
        Point p1;
        Point p2;

        public Segment() {
            this(new Point(), new Point());
        }
     
        public Segment(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
    }

    static double exteriorProduct(Point p1, Point p2) {
        return p1.x * p2.y - p1.y * p2.x;
    }

    static boolean cross(Segment s1, Segment s2) {
        bool b1 = exteriorProduct(s1.p2.subtract(s1.p1), s2.p1) * exteriorProduct(s1.p2.subtract(s1.p1), s2.p2)  < EPS ;
        bool b2 = exteriorProduct(s2.p2.subtract(s2.p1), s1.p1) * exteriorProduct(s2.p2.subtract(s2.p1), s1.p2)  < EPS ;
        return b1 && b2;
    }
}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String line;
        String[] words;
 
        int q = sc.nextInt();
 
        for (int i = 0; i < q; i++) {
            double xp0, yp0, xp1, yp1, xp2, yp2, xp3, yp3;
            xp0 = sc.nextDouble();
            yp0 = sc.nextDouble();
            xp1 = sc.nextDouble();
            yp1 = sc.nextDouble();
            xp2 = sc.nextDouble();
            yp2 = sc.nextDouble();
            xp3 = sc.nextDouble();
            yp3 = sc.nextDouble();
 
            Point p0, p1, p2, p3;
            p0 = new Point(xp0, yp0);
            p1 = new Point(xp1, yp1);
            p2 = new Point(xp2, yp2);
            p3 = new Point(xp3, yp3);

            Segment s1, s2;
            s1 = new Segment(p0, p1);
            s2 = new Segment(p2, p3);
 
            if (Geometries.cross(s1, s2)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

  }
}

