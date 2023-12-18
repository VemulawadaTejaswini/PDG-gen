import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  class Info {
    int y;
    int d;
    int c;

    Info(int y, int d, int c) {
      this.y = y;
      this.d = d;
      this.c = c;
    }
  }

  class Data {
    int cost;
    int dist;

    public String toString() {
      return "{" + cost + ", " + dist + "}";
    }
  }

  void run() {
    for (; ; ) {
      int n, m, c, s, g;
      n = ni();
      m = ni();
      c = ni();
      s = ni();
      g = ni();
      if (n == 0) {
        break;
      }

      ArrayList<LinkedList<Info>> list = new ArrayList<>();
      for (int i = 0; i <= n; ++i) {
        list.add(new LinkedList<>());
      }
      for (int i = 0; i < m; ++i) {
        int x, y, d, ci;
        x = ni();
        y = ni();
        d = ni();
        ci = ni();
        list.get(x).add(new Info(y, d, ci));
      }

      int[][] LUT = new int[c + 1][20001];
      int[] p = new int[c + 1];
      for (int i = 1; i <= c; ++i) {
        p[i] = ni();
      }
      for (int i = 1; i <= c; ++i) {
        int[] q = new int[p[i]];
        for (int j = 0; j < p[i] - 1; ++j) {
          q[j] = ni();
        }
        q[p[i] - 1] = 1 << 28;
        int[] r = new int[p[i]];
        for (int j = 0; j < p[i]; ++j) {
          r[j] = ni();
        }
        int idx = 0;
        for (int j = 1; j <= 20000; ++j) {
          if (j > q[idx]) {
            ++idx;
          }
          LUT[i][j] = LUT[i][j - 1] + r[idx];
        }
//        debug(LUT[i]);
      }
      Data[][][] d = new Data[c + 1][n + 1][n + 1];
      for (int h = 1; h <= c; ++h) {
        for (int i = 1; i <= n; ++i) {
          for (int j = 1; j <= n; ++j) {
            d[h][i][j] = new Data();
            d[h][i][j].cost = 1 << 28;
            d[h][i][j].dist = 1 << 28;
          }
        }
      }
      for (int i = 1; i <= n; ++i) {
        for (Info info : list.get(i)) {
          Data dat = new Data();
          dat.dist = info.d;
          if (d[info.c][i][info.y].dist > dat.dist) {
            d[info.c][i][info.y] = dat;
            d[info.c][info.y][i] = dat;
          }
        }
      }


      for (int h = 1; h <= c; ++h) {
        for (int i = 1; i <= n; ++i) {
          for (int j = 1; j <= n; ++j) {
            for (int k = 1; k <= n; ++k) {
              if (d[h][i][j].dist > d[h][i][k].dist + d[h][k][j].dist) {
                d[h][i][j].dist = d[h][i][k].dist + d[h][k][j].dist;
              }
            }
          }
        }
      }
      for (int h = 1; h <= c; ++h) {
        for (int i = 1; i <= n; ++i) {
          for (int j = 1; j <= n; ++j) {
            if (d[h][i][j].dist == 1 << 28) {
              continue;
            }
            d[h][i][j].cost = LUT[h][d[h][i][j].dist];
          }
        }
      }
      int[][] ans = new int[n + 1][n + 1];
      for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= n; ++j) {
          ans[i][j] = 1 << 28;
        }
      }
      for (int h = 1; h <= c; ++h) {
        for (int i = 1; i <= n; ++i) {
          for (int j = 1; j <= n; ++j) {
            ans[i][j] = Math.min(ans[i][j], d[h][i][j].cost);
          }
        }
      }
      for (int f = 1; f <= c; ++f) {
        for (int h = 1; h <= c; ++h) {
          for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
              for (int k = 1; k <= n; ++k) {
                if (ans[i][j] > d[f][i][k].cost + d[h][k][j].cost) {
                  ans[i][j] = d[f][i][k].cost + d[h][k][j].cost;
                }
              }
            }
          }
        }
      }
      System.out.println(ans[s][g] == 1 << 28 ? -1 : ans[s][g]);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}