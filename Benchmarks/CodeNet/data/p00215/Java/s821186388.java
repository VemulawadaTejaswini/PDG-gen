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

      ArrayList<?>[] nodes = new ArrayList<?>[5];

      for (int i = 0; i < 5; i++)
        nodes[i] = new ArrayList<Point>(1000);

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
            ((ArrayList<Point>)nodes[attr]).add(new Point(x, y));
          }
        }
      }

      int min_dist = MAX_INT;
      int min_attr = -1;

      for (int sattr = 0; sattr < 5; sattr++) {
        ArrayList<Point> prev_nodes = new ArrayList<Point>();
        prev_nodes.add(start);

        int[] prev_dists = new int[1];
        prev_dists[0] = 0;

        for (int k = 1; k < 5; k++) {
          int attr0 = (sattr + k) % 5;
          ArrayList<Point> nodes0 = (ArrayList<Point>)nodes[attr0];
          int[] dists0 = new int[nodes0.size()];

          for (int i = 0; i < nodes0.size(); i++) {
            Point nd = nodes0.get(i);
            int min_dist0 = MAX_INT;
            int pnlen = prev_nodes.size();

            for (int pi = 0; pi < pnlen; pi++) {
              int d = prev_dists[pi] + dist(prev_nodes.get(pi), nd);
              if (min_dist0 > d) min_dist0 = d;
            }

            dists0[i] = min_dist0;
          }

          prev_nodes = nodes0;
          prev_dists = dists0;
        }

        int min_gdist = MAX_INT;
        int pnlen = prev_nodes.size();

        for (int pi = 0; pi < pnlen; pi++) {
          int d = prev_dists[pi] + dist(prev_nodes.get(pi), goal);
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