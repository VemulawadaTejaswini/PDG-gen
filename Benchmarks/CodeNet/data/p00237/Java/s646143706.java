import java.util.*;

public class Main {
  // constant

  static final double DELTA = 0.01;
  static final double DELTA2 = DELTA * DELTA;

  // inner classes

  static class Point {
    double x, y;

    Point(double x, double y) {
      this.x = x;
      this.y = y;
    }
  }

  // global variables

  // subroutines

  static double dist2(Point v0, Point v1) {
    double dvx = v1.x - v0.x;
    double dvy = v1.y - v0.y;
    return (dvx * dvx + dvy * dvy);
  }

  static double i_prod(Point v0, Point v1) {
    return v0.x * v1.x + v0.y * v1.y;
  }

  static double o_prod(Point v0, Point v1) {
    return v0.x * v1.y - v0.y * v1.x;
  }

  static void calc_trglen(Point[] trg, double[] lens) {
    for (int i = 0; i < 3; i++) {
      int j = (i + 1) % 3;
      lens[i] = Math.sqrt(dist2(trg[i], trg[j]));
    }
  }

  static Point[] trg2rect(Point[] trg, double[] lens, int d) {
    Point b0 = null;
    Point b1 = null;
    Point nv = null;

    for (int i0 = 0; i0 < 3; i0++) {
      int i1 = (i0 + 1) % 3;
      int i2 = (i1 + 1) % 3;

      if (Math.abs(lens[i1] - lens[i2]) <= DELTA) {
        b0 = trg[i0];
        b1 = trg[i1];
        nv = new Point(-b1.y + b0.y, b1.x - b0.x);
        Point v02 = new Point(trg[i2].x - b0.x, trg[i2].y - b0.y);
        if (i_prod(nv, v02) < 0) {
          nv.x = -nv.x;
          nv.y = -nv.y;
        }
        double nvlen = Math.sqrt(nv.x * nv.x + nv.y * nv.y);
        nv.x *= d / nvlen;
        nv.y *= d / nvlen;
      }
    }

    Point b2 = new Point(b1.x + nv.x, b1.y + nv.y);
    Point b3 = new Point(b0.x + nv.x, b0.y + nv.y);

    Point[] rect = new Point[4];
    rect[0] = b0;
    rect[1] = b1;
    rect[2] = b2;
    rect[3] = b3;

    return rect;
  }

  static boolean inside(Point p0, Point[] trg, double[] lens) {
    double op = 0.0;

    for (int i = 0; i < 3; i++) {
      int j = (i + 1) % 3;
      Point pv = new Point(p0.x - trg[i].x, p0.y - trg[i].y);
      Point tv = new Point(trg[j].x - trg[i].x, trg[j].y - trg[i].y);
      double op_d = o_prod(pv, tv) / lens[i];

      if (Math.abs(op_d) > DELTA) {
        if (op == 0.0)
          op = op_d;
        else if (op * op_d < 0)
          return false;
      }
    }

    return true;
  }

  static boolean cross_lines(Point u0, Point u1, Point v0, Point v1) {
    if (dist2(u0, v0) <= DELTA2 || dist2(u0, v1) <= DELTA2 ||
        dist2(u1, v0) <= DELTA2 || dist2(u1, v1) <= DELTA2)
      return true;

    /*
      # x = dux * t + u0x = dvx * s + v0x
      # y = duy * t + u0y = dvy * s + v0y
      # dux * t - dvx * s = v0x - u0x
      # duy * t - dvy * s = v0y - u0y
      # |dux -dvx| |t| = |v0x-u0x|
      # |duy -dvy| |s|   |v0y-u0y|
      # det == dux*(-dvy)-(-dvx)*duy = -dux*dvy+dvx*duy
      # |t| = 1/det * |-dvy dvx| |v0x-u0x|
      # |s|           |-duy dux| |v0y-u0y|
    */

    double dux = u1.x - u0.x;
    double duy = u1.y - u0.y;
    double dvx = v1.x - v0.x;
    double dvy = v1.y - v0.y;

    double det = -dux * dvy + dvx * duy;
    if (Math.abs(det) <= DELTA2) return false;

    double vux = v0.x - u0.x;
    double vuy = v0.y - u0.y;

    double t = (-dvy * vux + dvx * vuy) / det;
    double s = (-duy * vux + dux * vuy) / det;


    return (t >= 0.0 && t <= 1.0 && s >= 0.0 && s <= 1.0);
  }

  static boolean cross_trgs(Point[] trg0, double[] lens0,
                            Point[] trg1, double[] lens1) {
    for (int i = 0; i < 3; i++)
      if (inside(trg0[i], trg1, lens1) || inside(trg1[i], trg0, lens0))
        return true;

    for (int i0 = 0; i0 < 3; i0++) {
      int j0 = (i0 + 1) % 3;
      for (int i1 = 0; i1 < 3; i1++) {
        int j1 = (i1 + 1) % 3;
        if (cross_lines(trg0[i0], trg0[j0], trg1[i1], trg1[j1]))
          return true;
      }
    }

    return false;
  }

  static void connected(int id, int i, int n, boolean[][] edges, int[] ids) {
    if (ids[i] > 0) return;

    ids[i] = id;

    for (int j = 0; j < n; j++)
      if (ids[j] == 0 && edges[i][j])
        connected(id, j, n, edges, ids);
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      int d = sc.nextInt();
      if (n == 0 && d == 0) break;

      Point[][] trgs = new Point[n][3];
      double[][] trlens = new double[n][3];
      Point[][] rects = new Point[n][4];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
          double x = sc.nextDouble();
          double y = sc.nextDouble();
          trgs[i][j] = new Point(x, y);
        }

        calc_trglen(trgs[i], trlens[i]);
        rects[i] = trg2rect(trgs[i], trlens[i], d);
      }

      boolean[][] edges = new boolean[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) edges[i][j] = false;

      for (int i = 0; i < n; i++) {
        Point[] rct = rects[i];

        Point[] rtrg0 = new Point[3];
        rtrg0[0] = rct[0];
        rtrg0[1] = rct[1];
        rtrg0[2] = rct[2];
        double[] rtlens0 = new double[3];
        calc_trglen(rtrg0, rtlens0);

        Point[] rtrg1 = new Point[3];
        rtrg1[0] = rct[0];
        rtrg1[1] = rct[2];
        rtrg1[2] = rct[3];
        double[] rtlens1 = new double[3];
        calc_trglen(rtrg1, rtlens1);

        for (int j = 0; j < n; j++)
          if (i != j &&
              (cross_trgs(trgs[j], trlens[j], rtrg0, rtlens0) ||
               cross_trgs(trgs[j], trlens[j], rtrg1, rtlens1)))
            edges[i][j] = edges[j][i] = true;
      }

      int id = 0;
      int[] ids = new int[n];
      Arrays.fill(ids, 0);

      for (int i = 0; i < n; i++)
        if (ids[i] == 0) {
          id++;
          connected(id, i, n, edges, ids);
        }

      System.out.println(id);
    }
  }
}