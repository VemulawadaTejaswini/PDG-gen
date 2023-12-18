import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  private static class UnionFind {
    UnionFind parent = null;
    int n;
    UnionFind(int n) {
      this.n = n;
    }
    UnionFind get() {
      if (parent != null) return this.parent.get();
      return this;
    }
    void addTo(UnionFind parent) {
      this.parent = parent;
    }

  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] p = sc.nextIntArray(n * n);
    for (int i = 0; i < n * n; i++) p[i]--;
    int[][] seats = new int[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(seats[i], 1);
    }
    UnionFind[] uf = new UnionFind[n * n];
    Map<UnionFind, Integer> mins = new HashMap<>();
    int count = 0;
    int[][] dir = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    for (int pi : p) {
      int i = pi / n;
      int j = pi % n;
      seats[i][j] = 0;
      uf[pi] = new UnionFind(pi);
      int[] dist = new int[] {i, j, n - 1 - i, n - 1- j};
      Arrays.sort(dist);
      int min = dist[0];
      Set<UnionFind> heads = new HashSet<>();
      for (int[] d : dir) {
        if (i + d[0] < 0 || i + d[0] >= n || j + d[1] < 0 || j + d[1] >= n) continue;
        if (seats[i + d[0]][j + d[1]] == 1) continue;
        int a = (i + d[0]) * n + j + d[1];
        UnionFind head = uf[a].get();
        min = Math.min(min, mins.get(head));
        heads.add(head);
      }
      if (heads.isEmpty()) {
        mins.put(uf[pi], min);
      } else {
        List<UnionFind> headList = new ArrayList<>();
        headList.addAll(heads);
        mins.put(headList.get(0), min);
        uf[pi].addTo(headList.get(0));
        for (int k = 1; k < headList.size(); k++) {
          headList.get(k).addTo(headList.get(0));
        }
      }
      count += min;
    }
    System.out.println(count);
  }
}