import java.util.*;

public class Main {
  // constant

  static final char[] RGB = {'R', 'G', 'B'};
  static final int MAX_D = 20;

  // global variables

  static int w, h, wh;
  static int min_dist = MAX_D;

  // subroutines

  static char[] paint(char c, char[] brd) {
    char corg = brd[0];
    if (corg == c) return brd;

    char[] brd0 = brd.clone();
    brd0[0] = c;

    ArrayList<Integer> q = new ArrayList<Integer>();
    q.add(0);

    while (! q.isEmpty()) {
      int xy = q.remove(0);
      int x = xy % w;
      int y = xy / w;

      if (x < w - 1) {
        int xy0 = y * w + (x + 1);
        if (brd0[xy0] == corg) {
          brd0[xy0] = c;
          q.add(xy0);
        }
      }

      if (y < h - 1) {
        int xy1 = (y + 1) * w + x;
        if (brd0[xy1] == corg) {
          brd0[xy1] = c;
          q.add(xy1);
        }
      }
    }

    return brd0;
  }

  static boolean finished(char[] brd) {
    char c = brd[0];

    for (int i = 1; i < wh; i++)
      if (brd[i] != c) return false;

    return true;
  }

  static void get_min_dist(int d, char[] u, HashMap<String, Integer> visited) {
    if (finished(u)) {
      if (min_dist > d) min_dist = d;
      return;
    }

    if (d >= min_dist) return;

    for (char cv: RGB) {
      char[] v = paint(cv, u);
      String vstr = new String(v);

      if (! visited.containsKey(vstr)) {
        visited.put(vstr, 1);
        get_min_dist(d + 1, v, visited);
        visited.remove(vstr);
      }
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    while (true) {
      w = sc.nextInt();
      h = sc.nextInt();
      wh = w * h;
      if (w == 0 && h == 0) break;

      char[] start = new char[wh];

      for (int i = 0; i < wh; i++) {
        String ch = sc.next("[RGB]");
        start[i] = ch.charAt(0);
      }

      String ststr = new String(start);
      HashMap<String, Integer> visited = new HashMap<String, Integer>();
      visited.put(ststr, 1);

      min_dist = MAX_D;
      get_min_dist(0, start, visited);

      System.out.println(min_dist);
    }
  }
}