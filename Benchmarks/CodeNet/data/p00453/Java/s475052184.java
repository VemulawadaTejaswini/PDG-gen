import java.util.*;

public class Main {
  // constant
  static final int MAX_INT = 1 << 30;
  static final int MAX_N = 150;
  static final int MAX_K = 10;

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

      Stone[] stones = new Stone[n * MAX_K];
      int nst = 0;

      Stone[][] ystones = new Stone[n][MAX_K + 1];
      int[] nyst = new int[n];
      Arrays.fill(nyst, 0);

      int max_x = 0;

      for (int y = 0; y < n; y++) {
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
          int x = sc.nextInt() - 1;
          int d = sc.nextInt();

          Stone st = new Stone(nst, x, y, d);
          stones[nst++] = st;
          ystones[y][nyst[y]++] = st;

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

      for (int i = 0; i < nyst[0]; i++) {
        Stone st0 = ystones[0][i];
        dists[m][st0.id] = 0;
        visited[m][st0.id] = true;
        q.add(new Qt(m, st0.id));
      }

      if (m > 0)
        for (int i = 0; i < nyst[1]; i++) {
          Stone st1 = ystones[1][i];
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
        Stone stu = stones[qu.id];

        int distu = dists[mu][stu.id];

        if (stu.y >= n - 1 || (mu > 0 && stu.y >= n - 2)) {
          if (min_gdist > distu) min_gdist = distu;
          continue;
        }

        if (distu > min_gdist) continue;

        int y1 = stu.y + 1;
        for (int i = 0; i < nyst[y1]; i++) {
          Stone stv = ystones[y1][i];
          int dv = distu + (stu.d + stv.d) * Math.abs(stu.x - stv.x);

          if (dists[mu][stv.id] > dv) {
            dists[mu][stv.id] = dv;
            if (! visited[mu][stv.id]) {
              visited[mu][stv.id] = true;
              q.add(new Qt(mu, stv.id));
            }
          }
        }

        if (mu > 0) {
          int y2 = stu.y + 2;
          int mv = mu - 1;

          for (int i = 0; i < nyst[y2]; i++) {
            Stone stv = ystones[y2][i];
            int dv = distu + (stu.d + stv.d) * Math.abs(stu.x - stv.x);

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