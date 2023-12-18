import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.awt.geom.Point2D.Double;

import static java.lang.Integer.parseInt;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines;
      Point2D[] s = new Point2D[2];
      StringBuilder buf = new StringBuilder();

      lines = br.readLine().split(" ");
      int x, y;
      for(int j=0,k=0; j<s.length; j++) {
        x = parseInt(lines[k++]);
        y = parseInt(lines[k++]);
        s[j] = new Point2D(x, y);
      }

      int q = parseInt(br.readLine());
      Vector v = new Vector();

      for(int i=0; i<q; i++) {
        lines = br.readLine().split(" ");
        Point2D p = new Point2D(parseInt(lines[0]), parseInt(lines[1]));
        Point2D result = v.project(s[0], s[1], p);
        buf.append(result.x).append(" ").append(result.y).append("\n");
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.out.println(e);
    }
  }

  private class Point2D extends Double {
    private static final long serialVersionUID = 1L;
    double EPS = 1e-10;

    public Point2D() { super(); }
    public Point2D(double x, double y) { super(x, y); }

    public boolean equals (double a, double b) {
      return Math.abs(a-b) < EPS;
    }
    public Point2D sum(Point2D b) {
      return new Point2D(x+b.x, y+b.y);
    }
    public Point2D diff(Point2D b) {
      return new Point2D(x-b.x, y-b.y);
    }
    public Point2D multiple(double k) {
      return new Point2D(x*k, y*k);
    }

    @Override
    public String toString() {
      return "[" + x + "," + y + "]";
    }
  }

  private class Vector extends Point2D {

    private static final long serialVersionUID = 1L;

    public Vector() { super(); }
    public Vector(double x, double y) { super(x, y); }
    public Vector(Point2D p) { super(p.x, p.y); }

    public double norm() {
      return x * x + y * y;
    }
    public double dot(Point2D a, Point2D b) {
      return a.x * b.x + a.y * b.y;
    }
    public double cross(Point2D a, Point2D b) {
      return a.x * b.y - a.y * b.x;
    }
    public boolean isOrthogonal(Point2D a, Point2D b) {
      return equals(dot(a,b) , 0.0);
    }
    public boolean isOrthogonal(Point2D a1, Point2D a2, Point2D b1, Point2D b2) {
      return isOrthogonal(a1.diff(a2), b1.diff(b2));
    }
    public boolean isParallel(Point2D a, Point2D b) {
      return equals(cross(a, b), 0.0);
    }
    public boolean isParallel(Point2D a1, Point2D a2, Point2D b1, Point2D b2) {
      return isParallel(a1.diff(a2), b1.diff(b2));
    }

    public Point2D project(Point2D sp1, Point2D sp2, Point2D p) {
      Vector base = new Vector( sp2.diff(sp1) );
      double r = dot(p.diff(sp1), base) / base.norm();

      return sp1.sum(base.multiple(r));
    }
  }
}
