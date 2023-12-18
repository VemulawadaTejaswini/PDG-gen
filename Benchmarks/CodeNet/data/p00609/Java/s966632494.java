/*
 * Main.java: 1023: Amazing Graze
 */

import java.util.*;

public class Main {
  // constant

  static final int MAX_CRD = 10000;
  static final int NUM_DIV = 100;

  static final int[][] DXYS = {
    {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}
  };

  // subroutines

  static boolean close(int x0, int y0, int x1, int y1, int d) {
    int dx = x1 - x0;
    int dy = y1 - y0;
    return (dx * dx + dy * dy <= d * d);
  }

  static boolean cross_cr_sq(int cx, int cy, int r,
                             int x0, int y0, int x1, int y1) {
    // center of circle is inside of square
    if (cx >= x0 && cx <= x1 && cy >= y0 && cy <= y1) return true;

    // one of corners of square is inside of circle
    if (close(x0, y0, cx, cy, r) ||
        close(x0, y1, cx, cy, r) ||
        close(x1, y0, cx, cy, r) ||
        close(x1, y1, cx, cy, r))
      return true;

    // one of edges of square intersects with circle
    if ((cx >= x0 && cx <= x1 &&
         (Math.abs(cy - y0) <= r || Math.abs(y1 - cy) <= r)) ||
        (cy >= y0 && cy <= y1 &&
         (Math.abs(cx - x0) <= r || Math.abs(x1 - cx) <= r)))
      return true;

    return false;
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int sql = MAX_CRD / NUM_DIV;

    for (;;) {
      int an = sc.nextInt();
      int bn = sc.nextInt();
      int r = sc.nextInt();
      if ((an | bn | r) == 0) break;

      int r4 = r * 4;

      ArrayList<ArrayList<int[]>> ars = new ArrayList<ArrayList<int[]>>();
      for (int i = 0; i < NUM_DIV * NUM_DIV; i++)
        ars.add(new ArrayList<int[]>());

      for (int i = 0; i < an; i++) {
        int ax = sc.nextInt();
        int ay = sc.nextInt();

        int xi = ax / sql;
        int yi = ay / sql;

        int[] axy = {ax, ay};
        ars.get(yi * NUM_DIV + xi).add(axy);

        for (int[] dxy: DXYS) {
          int xi0 = xi + dxy[0];
          int yi0 = yi + dxy[1];

          if (xi0 >= 0 && xi0 < NUM_DIV && yi0 >= 0 && yi0 < NUM_DIV) {
            int rx0 = xi0 * sql;
            int ry0 = yi0 * sql;
            if (cross_cr_sq(ax, ay, r4, rx0, ry0, rx0 + sql, ry0 + sql))
              ars.get(yi0 * NUM_DIV + xi0).add(axy);
          }
        }
      }

      int power = 0;

      for (int i = 0; i < bn; i++) {
        int bx = sc.nextInt();
        int by = sc.nextInt();

        int xi = bx / sql;
        int yi = by / sql;

        for (int[] axy: ars.get(yi * NUM_DIV + xi))
          if (close(bx, by, axy[0], axy[1], r4))
            power++;
      }

      System.out.println(power);
    }
  }
}