import java.awt.geom.Point2D.Double;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      Point2D p0, p1, p2;
      String[] line = br.readLine().split(" ");
      int q = parseInt(br.readLine());
      p1 = new Point2D(parseInt(line[0]), parseInt(line[1]));
      p2 = new Point2D(parseInt(line[2]), parseInt(line[3]));

      Vector v = new Vector();
      StringBuilder buf = new StringBuilder();
      for(int i=0; i<q; i++) {
        line = br.readLine().split(" ");
        p0 = new Point2D(parseInt(line[0]), parseInt(line[1]));
        buf.append(v.reflect(p1, p2, p0)).append("\n");
      }

      System.out.print(buf);

    }
    catch( IOException e ) {
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
      return String.format("%.10f %.10f", x,y);
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
    public Point2D reflect(Point2D sp1, Point2D sp2, Point2D p) {
      return p.sum(project(sp1,sp2,p).diff(p).multiple(2.0));
    }
  }
}
