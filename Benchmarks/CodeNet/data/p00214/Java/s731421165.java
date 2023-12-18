import java.io.*;
import java.util.*;

class Main {
  // inner classes

  static class Point {
    int x, y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  // subroutines

  static int oProd(Point p, Point v0, Point v1) {
    // (p - v0) x (v1 - v0)
    return (p.x - v0.x) * (v1.y - v0.y) - (v1.x - v0.x) * (p.y - v0.y);
  }

  static boolean inside(Point p, Point[] vs) {
    int nump = 0;
    int numm = 0;

    for (int i = 0; i < 4; i++) {
      Point v0 = vs[i];
      Point v1 = vs[(i + 1) % 4];
      int op = oProd(p, v0, v1);
      if (op > 0)
        nump++;
      else if (op < 0)
        numm++;
      if (nump > 0 && numm > 0) return false;
    }
    return true;
  }

  static boolean crossLines(Point u0, Point u1, Point v0, Point v1) {
    int ux = u1.x - u0.x;
    int uy = u1.y - u0.y;
    int vx = v1.x - v0.x;
    int vy = v1.y - v0.y;

    int det = -ux * vy * vx * uy;
    if (det == 0) return false;

    int vux = v0.x - u0.x;
    int vuy = v0.y - u0.y;

    double t = (double)(-vy * vux + vx * vuy) / det;
    double s = (double)( uy * vux + ux * vuy) / det;

    return (t >= 0.0 && t <= 1.0 && s >= 0.0 && s <= 1.0);
  }

  static boolean crossQuads(Point[] q1, Point[] q2) {
    for (int i = 0; i < 4; i++)
      if (inside(q1[i], q2)) return true;

    for (int i = 0; i < 4; i++)
      if (inside(q2[i], q1)) return true;

    for (int i = 0; i < 4; i++) {
      Point u0 = q1[i];
      Point u1 = q1[(i + 1) % 4];

      for (int j = 0; j < 4; j++) {
        Point v0 = q2[j];
        Point v1 = q2[(j + 1) % 4];
        if (crossLines(u0, u1, v0, v1)) return true;
      }
    }

    return false;
  }

  // main

  public static final void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      int n = Integer.parseInt(br.readLine().trim());
      if (n == 0) break;

      for (int i = 0; i < n; i++) {
        int m = Integer.parseInt(br.readLine().trim());

        Point[][] quads = new Point[m][4];

        for (int j = 0; j < m; j++) {
          String[] qs = br.readLine().trim().split(" ");

          for (int k = 0; k < 4; k++) {
            quads[j][k] =
              new Point(Integer.parseInt(qs[2 * k]),
                        Integer.parseInt(qs[2 * k + 1]));
          }
        }

        int[] ids = new int[m];
        Arrays.fill(ids, -1);

        for (int i0 = 0; i0 < m; i0++)
          for (int i1 = i0 + 1; i1 < m; i1++)
            if (crossQuads(quads[i0], quads[i1])) {
              int id = i0;
              while (ids[id] >= 0) id = ids[id];
              if (id != i1) ids[id] = i1;
            }

        int count = 0;
        for (int i0 = 0; i0 < m; i0++)
          if (ids[i0] < 0) count++;

        System.out.println(count);
      }
    }
  }
}