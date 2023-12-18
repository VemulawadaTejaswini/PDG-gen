import java.util.*;

public class Main {
  // constant

  static final int MAX_INT = (1 << 30);
  static final int[][] DXYS = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

  static final int BRD_PATH = -1;
  static final int BRD_MONT = -2;
  static final int BRD_ISLD = -3;

  // inner classes

  static class Stat {
    int pos;
    int[] ices;

    Stat(int pos, int[] ices) {
      this.pos = pos;
      this.ices = ices;
    }
  }

  static class Dist {
    ArrayList<HashMap<String, Integer>> dists;

    Dist(int size) {
      dists = new ArrayList<HashMap<String, Integer>>(size);
      for (int i = 0; i < size; i++)
        dists.add(new HashMap<String, Integer>());
    }

    int get(int pos, String key) {
      Integer d = dists.get(pos).get(key);
      return (d == null) ? MAX_INT : d;
    }

    void put(int pos, String key, int val) {
      dists.get(pos).put(key, val);
    }

    Collection<Integer> values(int pos) {
      return dists.get(pos).values();
    }
  }

  // subroutines

  static String joinInt(int[] inta) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < inta.length; i++) {
      if (i > 0) sb.append(',');
      sb.append(inta[i]);
    }
    return sb.toString();
  }

  static void print_board(int[] brds, int w, int h, int start, int goal) {
    for (int pos = 0; pos < w * h; pos++) {
      if (pos == start)
        System.out.print("  S");
      else if (pos == goal)
        System.out.print("  G");
      else
        System.out.printf("%3d", brds[pos]);
      if ((pos + 1) % w == 0) System.out.println();
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int w = sc.nextInt();
      int h = sc.nextInt();
      int wh = w * h;
      if (w == 0 && h == 0) break;

      int start = -1, goal = -1;
      int[] brds = new int[wh];

      for (int y = 0; y < h; y++) {
        String hl = sc.next().trim();

        for (int x = 0; x < w; x++) {
          int pos = y * w + x;

          switch (hl.charAt(x)) {
          case '.':
            brds[pos] = BRD_PATH;
            break;
          case '#':
            brds[pos] = BRD_MONT;
            break;
          case 'X':
            brds[pos] = BRD_ISLD;
            break;
          case 'S':
            start = pos;
            brds[pos] = BRD_PATH;
            break;
          case 'G':
            goal = pos;
            brds[pos] = BRD_PATH;
            break;
          }
        }
      }

      int nice = 0;
      ArrayList<Integer> iclist = new ArrayList<Integer>();

      for (int y = 0; y < h; y++) {
        for (int x = 0; x < w; x++) {
          int pos = y * w + x;

          if (brds[pos] == BRD_ISLD) {
            iclist.add(1);
            brds[pos] = nice;

            Stack<Integer> q = new Stack<Integer>();
            q.push(pos);

            while (! q.isEmpty()) {
              int pos0 = q.pop();
              int x0 = pos0 % w;
              int y0 = pos0 / w;

              for (int[] dxy: DXYS) {
                int x1 = x0 + dxy[0];
                int y1 = y0 + dxy[1];
                int pos1 = y1 * w + x1;

                if (x1 >= 0 && x1 < w && y1 >= 0 && y1 < h &&
                    brds[pos1] == BRD_ISLD) {
                  iclist.set(nice, iclist.get(nice) + 1);
                  brds[pos1] = nice;
                  q.push(pos1);
                }
              }
            }

            nice += 1;
          }
        }
      }

      int[] ices = new int[nice];
      for (int i = 0; i < nice; i++)
        ices[i] = iclist.get(i) / 2;

      //print_board(brds, w, h, start, goal);
      //for(int ic: ices) System.out.print(" " + ic);
      //System.out.println();

      Dist dists = new Dist(wh);
      dists.put(start, joinInt(ices), 0);

      ArrayList<Stat> q = new ArrayList<Stat>();
      q.add(new Stat(start, ices.clone()));

      while (! q.isEmpty()) {
        Stat st = q.remove(0);
        String stKey = joinInt(st.ices);
        int stDist = dists.get(st.pos, stKey);
        //System.out.printf("q(%d,%d)\n", st.pos % w, st.pos / w);

        if (st.pos == goal) continue;

        int x = st.pos % w;
        int y = st.pos / w;

        for (int[] dxy: DXYS) {
          int x0 = x + dxy[0];
          int y0 = y + dxy[1];

          if (x0 >= 0 && x0 < w && y0 >= 0 && y0 < h) {
            int pos0 = y0 * w + x0;
            int ic = brds[pos0];

            if (ic == BRD_MONT) continue;

            int[] ics0 = st.ices.clone();

            if (ic >= 0) {
              if (ics0[ic] <= 0) continue;
              ics0[ic]--;
            }

            int d0 = stDist + 1;
            String key0 = joinInt(ics0);

            if (dists.get(pos0, key0) >= MAX_INT) {
              dists.put(pos0, key0, d0);
              q.add(new Stat(pos0, ics0));
            }
          }
        }
      }

      int min_dist = MAX_INT;

      for (int d: dists.values(goal))
        if (min_dist > d) min_dist = d;

      System.out.println(min_dist);
    }
  }
}