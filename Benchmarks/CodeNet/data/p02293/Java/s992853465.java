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

      int q = parseInt(br.readLine());

      String[] lines;
      Point2D[] p = new Point2D[4];
      StringBuilder buf = new StringBuilder();

      for(int i=0; i<q; i++) {
        lines = br.readLine().split(" ");
        int x, y;
        for(int j=0,k=0; j<p.length; j++) {
          x = parseInt(lines[k++]);
          y = parseInt(lines[k++]);
          p[j] = new Point2D(x, y);
        }

        Vector v = new Vector();
        if(v.isParallel(p[0], p[1], p[2], p[3]))
          buf.append(2).append("\n");
        else if(v.isOrthogonal(p[0], p[1], p[2], p[3]))
          buf.append(1).append("\n");
        else
          buf.append(0).append("\n");
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
  }

  private class Vector extends Point2D {

    private static final long serialVersionUID = 1L;

    public Vector() { super(); }
    public Vector(double x, double y) { super(x, y); }

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
  }
}
