import java.util.HashMap;
import java.util.Map;

public class Main {
  static long[][] d;
  static int m;
  private static void solve() {
    m = ni();
    int[][] p = new int[m][2];
    for (int i = 0; i < m;i ++) {
      p[i][0] = ni();
      p[i][1] = ni();
      
    }
    d = new long[m][m];
    for (int i = 0; i < m; i ++) {
      for (int j = 0; j < m; j ++) {
        d[i][j] = f(p[i], p[j]);
      }
    }
    long ret = dfs(new HashMap<Long, Integer>(), new boolean[m], 0);
    System.out.println(ret);
  }
  
  static Map<String, Long> memo = new HashMap<>();
  private static long dfs(Map<Long, Integer> now, boolean[] used, int depth) {
    if (depth == m / 2) {
      long ret = 0;
      for (Map.Entry<Long, Integer> entry : now.entrySet()) {
        int x = entry.getValue();
        ret += x * (x - 1) / 2;
      }
      return ret;
    }
    
    long ret = 0;
    for (int i = 0; i < m; i ++) {
      if (used[i]) continue;
      used[i] = true;
      
      for (int j = i + 1; j < m; j ++) {
        if (used[j]) continue;
        
        used[j] = true;
        long key = d[i][j];
        if (!now.containsKey(key)) {
          now.put(key, 0);
        }
        int num = now.get(key);
        now.put(key, num + 1);
        long v = dfs(now, used, depth + 1);
        ret = Math.max(ret, v);
        now.put(key, num);
        used[j] = false;
      }
      used[i] = false;
      break;
    }
    return ret;
  }


  private static long f(int[] p1, int[] p2) {
    if (p1 == p2) return -1;
    int dx = p2[0] - p1[0];
    int dy = p2[1] - p1[1];
    
    if (dx < 0) {
      dx = -dx;
      dy = -dy;
    }
    
    int g = gcd(dx, Math.abs(dy));
    dx /= g;
    dy /= g;

    return (long)dx * 1000000 + dy;
    
  }


  public static int gcd(int a, int b) {
    if (a > b) {
      int tmp = a;
        a = b;
        b = tmp;
    }
    while (a != 0) {
      int c = a;
        a = b % c;
        b = c;
    }
    return b;
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