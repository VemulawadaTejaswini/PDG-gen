import java.util.*;

public class Main {
  // constant
  static final int MAX_INT = 1 << 30;

  // inner classes

  static class Stone {
    int id, x, y, d;

    Stone(int id, int x, int y, int d) {
      this.id = id;
      this.x = x;
      this.y = y;
      this.d = d;
    }
  }

  static class Qt {
    int m, id;

    Qt(int m, int id) {
      this.m = m;
      this.id = id;
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      if ((n | m) == 0) break;

      ArrayList<Stone> stones = new ArrayList<Stone>();
      int nst = 0;

      ArrayList<ArrayList<Stone>> ystones =
        new ArrayList<ArrayList<Stone>>();
      for (int y = 0; y < n; y++)
        ystones.add(new ArrayList<Stone>());

      int max_x = 0;

      for (int y = 0; y < n; y++) {
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
          int x = sc.nextInt() - 1;
          int d = sc.nextInt();

          Stone st = new Stone(nst, x, y, d);
          nst++;
          stones.add(st);
          ystones.get(y).add(st);

          if (max_x <= x) max_x = x + 1;
        }
      }

      int min_gdist = MAX_INT;
      int[][] dists = new int[m + 1][nst];
      boolean[][] visited = new boolean[m + 1][nst];

      for (int i = 0; i <= m; i++)
        for (int j = 0; j < nst; j++) {
          dists[i][j] = MAX_INT;
          visited[i][j] = false;
        }

      ArrayList<Qt> q = new ArrayList<Qt>();

      for (Stone st0: ystones.get(0)) {
        dists[m][st0.id] = 0;
        visited[m][st0.id] = true;
        q.add(new Qt(m, st0.id));
      }

      if (m > 0)
        for (Stone st1: ystones.get(1)) {
          dists[m - 1][st1.id] = 0;
          visited[m - 1][st1.id] = true;
          q.add(new Qt(m - 1, st1.id));
        }

      while (! q.isEmpty()) {
        Qt qu = q.get(0);

        for (int i = 1; i < q.size(); i++) {
          Qt qi = q.get(i);
          if (dists[qu.m][qu.id] > dists[qi.m][qi.id])
            qu = qi;
        }

        q.remove(qu);

        int mu = qu.m;
        Stone stu = stones.get(qu.id);

        if (stu.y >= n - 1 || (mu > 0 && stu.y >= n - 2)) {
          int gdist = dists[mu][stu.id];
          if (min_gdist > gdist) min_gdist = gdist;
          continue;
        }

        for (Stone stv: ystones.get(stu.y + 1)) {
          int dv =
            dists[mu][stu.id] + (stu.d + stv.d) * Math.abs(stu.x - stv.x);

          if (dists[mu][stv.id] > dv) {
            dists[mu][stv.id] = dv;
            if (! visited[mu][stv.id]) {
              visited[mu][stv.id] = true;
              q.add(new Qt(mu, stv.id));
            }
          }
        }

        if (mu > 0) {
          int mv = mu - 1;

          for (Stone stv: ystones.get(stu.y + 2)) {
            int dv =
              dists[mu][stu.id] + (stu.d + stv.d) * Math.abs(stu.x - stv.x);

            if (dists[mv][stv.id] > dv) {
              dists[mv][stv.id] = dv;
              if (! visited[mv][stv.id]) {
                visited[mv][stv.id] = true;
                q.add(new Qt(mv, stv.id));
              }
            }
          }
        }
      }

      System.out.println(min_gdist);
    }
  }
}