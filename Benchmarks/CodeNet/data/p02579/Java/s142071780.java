import java.util.Arrays;
import java.util.TreeSet;

public class Main {

  private static void solve() {
    int h = ni();
    int w = ni();

    int[] s = na(2);
    int[] g = na(2);

    char[][] map = new char[h + 2][w + 2];
    for (int i = 1; i <= h; i++) {
      char[] line = ns();
      for (int j = 1; j <= w; j++) {
        map[i][j] = line[j - 1];
      }
    }
    int[][] d = dijk(map, s);

    int ret = d[g[0]][g[1]];
    if (ret >= Integer.MAX_VALUE / 2) {
      System.out.println(-1);
    } else {
      System.out.println(ret);
    }
  }

  public static int[][] dijk(char[][] map, int[] s) {
    int h = map.length;
    int w = map[0].length;
    final int[][] td = new int[h][w];
    for (int[] v : td)
      Arrays.fill(v, Integer.MAX_VALUE);

    TreeSet<int[]> q = new TreeSet<>((a, b) -> {
      if (td[a[0]][a[1]] - td[b[0]][b[1]] != 0)
        return td[a[0]][a[1]] - td[b[0]][b[1]];
      return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
    });

    q.add(s);
    td[s[0]][s[1]] = 0;
    while (q.size() > 0) {
      int[] cur = q.pollFirst();

      for (int dy = -2; dy <= 2; dy++) {
        for (int dx = -2; dx <= 2; dx++) {
          int ny = cur[0] + dy;
          int nx = cur[1] + dx;
          if (ny < 0 || ny >= h || nx < 0 || nx >= w)
            continue;

          int len = Math.abs(dy) + Math.abs(dx) <= 1 ? 0 : 1;
          int nd = td[cur[0]][cur[1]] + len;

          if (map[ny][nx] == '.' && nd < td[ny][nx]) {
            int[] nex = { ny, nx };
            q.remove(nex);
            td[ny][nx] = nd;
            q.add(nex);
          }
        }
      }
    }

    return td;
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}
