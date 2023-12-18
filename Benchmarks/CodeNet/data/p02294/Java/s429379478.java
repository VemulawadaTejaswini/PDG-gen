// package codecheck;

import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    static double EPS = 1e-9;
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

    double inner(Point p) {
        return x * p.x + y * p.y;
    }
 
    double exterior(Point p) {
        return x * p.y - y * p.x;
    }

    double norm() {
        return x * x + y * y;
    }
}

class Segment {
    Point p1;
    Point p2;
 
    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}

class Geometries {
    static double EPS = 1e-9;

    static enum Position {
        COUNTER_CLOCKWISE(1),
        CLOCKWISE(-1),
        ONLINE_BACK(2),
        ONLINE_FRONT(-2),
        ON_SEGMENT(0);

        private int id;
        private Position(int id) {
            this.id = id;
        }
    }

    //return the position of p2 against the vector from p0 to p1
    static Position ccw(Point p0, Point p1, Point p2) {
        Point v1 = p1.subtract(p0);
        Point v2 = p2.subtract(p0);
        if( v1.exterior(v2) > EPS)  return Position.COUNTER_CLOCKWISE;
        if( v1.exterior(v2) < -EPS) return Position.CLOCKWISE;
        if( v1.inner(v2) < - EPS)   return Position.ONLINE_BACK;
        if( v1.norm() < v2.norm() ) return Position.ONLINE_FRONT;
        return Position.ON_SEGMENT;
    }
    static Position ccw(Segment s, Point p) {
        return ccw(s.p1, s.p2, p);
    }

    static boolean intersect(Segment s1, Segment s2) {
        Position pos1, pos2, pos3, pos4;
        pos1 = ccw(s1, s2.p1);
        pos2 = ccw(s1, s2.p2);
        pos3 = ccw(s2, s1.p1);
        pos3 = ccw(s2, s1.p2);
        return ( (pos1.id * pos2.id) <= 0 && (pos3.id * pos4.id) <= 0 );
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
 
            if (Geometries.intersect(s1, s2)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

  }
}

