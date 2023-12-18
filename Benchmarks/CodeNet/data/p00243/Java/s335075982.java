import java.util.*;

public class Main {
  // constant

  static final char[] RGB = {'R', 'G', 'B'};

  // global variables

  static int w, h, wh;

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

      HashMap<String, Integer> dists = new HashMap<String, Integer>();
      dists.put(ststr, 0);

      ArrayList<String> q = new ArrayList<String>();
      q.add(ststr);

      int min_dist = -1;

      while (! q.isEmpty()) {
        String ustr = q.remove(0);
        char[] u = ustr.toCharArray();

        if (finished(u)) {
          min_dist = dists.get(ustr);
          break;
        }

        int du = dists.get(ustr) + 1;

        for (char cv: RGB) {
          if (u[0] == cv) continue;

          char[] v = paint(cv, u);
          String vstr = new String(v);

          if (! dists.containsKey(vstr)) {
            dists.put(vstr, du);
            q.add(vstr);
          }
        }
      }

      System.out.println(min_dist);
    }
  }
}