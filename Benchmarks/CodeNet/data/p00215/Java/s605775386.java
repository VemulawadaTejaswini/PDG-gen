import java.io.*;
import java.util.*;

class Main {
  // constant

  static final int MAX_INT = (1 << 31) - 1;

  // inner classes

  static class Point {
    int x, y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  // subroutines

  static int dist(Point p0, Point p1) {
    return Math.abs(p1.x - p0.x) + Math.abs(p1.y - p0.y);
  }

  // main

  public static final void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String[] wh = br.readLine().trim().split(" ");
      int w = Integer.parseInt(wh[0]);
      int h = Integer.parseInt(wh[1]);
      if (w == 0 && h == 0) break;

      Point[][] nodes = new Point[5][1000];
      int[] nlens = new int[5];

      for (int i = 0; i < 5; i++) nlens[i] = 0;

      Point start = null;
      Point goal = null;

      for (int y = 0; y < h; y++) {
        String hl = br.readLine().trim();

        for (int x = 0; x < w; x++) {
          char ch = hl.charAt(x);

          switch (ch) {
          case 'S':
            start = new Point(x, y);
            break;
          case 'G':
            goal = new Point(x, y);
            break;
          case '.':
            break;
          default:
            int attr = ch - '1';
            nodes[attr][nlens[attr]++] = new Point(x, y);
          }
        }
      }

      int min_dist = MAX_INT;
      int min_attr = -1;

      for (int sattr = 0; sattr < 5; sattr++) {
        Point[] prev_nodes = new Point[1];
        int pnlen = 1;
        prev_nodes[0] = start;

        int[] prev_dists = new int[1];
        prev_dists[0] = 0;

        for (int k = 1; k < 5; k++) {
          int attr0 = (sattr + k) % 5;
          Point[] nodes0  = new Point[1000];
          int nlen0 = nlens[attr0];
          int[] dists0 = new int[nlen0];

          for (int i = 0; i < nlen0; i++) {
            Point nd = nodes0[i] = nodes[attr0][i];
            int min_dist0 = MAX_INT;

            for (int j = 0; j < pnlen; j++) {
              int d = prev_dists[j] + dist(prev_nodes[j], nd);
              if (min_dist0 > d) min_dist0 = d;
            }

            dists0[i] = min_dist0;
          }

          prev_nodes = nodes0;
          pnlen = nlen0;
          prev_dists = dists0;
        }

        int min_gdist = MAX_INT;

        for (int j = 0; j < pnlen; j++) {
          int d = prev_dists[j] + dist(prev_nodes[j], goal);
          if (min_gdist > d) min_gdist = d;
        }

        if (min_dist > min_gdist) {
          min_dist = min_gdist;
          min_attr = sattr;
        }
      }

      if (min_attr < 0)
        System.out.println("NA");
      else
        System.out.println("" + (min_attr + 1) + " " + min_dist);
    }
  }
}