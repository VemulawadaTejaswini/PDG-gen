import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

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

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int si = sc.nextInt() - 1;
    int sj = sc.nextInt() - 1;
    int di = sc.nextInt() - 1;
    int dj = sc.nextInt() - 1;
    String[][] cells = new String[h][w];
    for (int i = 0; i < h; i++) {
      cells[i] = sc.next().split("");
    }
    boolean[][] visited = new boolean[h][w];
    int[][] mins = new int[h][w];
    for (int i = 0; i < h; i++) {
      Arrays.fill(mins[i], Integer.MAX_VALUE);
    }
    mins[si][sj] = 0;
    Deque<int[]> queue = new ArrayDeque<>();
    queue.add(new int[] {si, sj});
    visited[si][sj] = true;
    while (!queue.isEmpty()) {
      int[] c = queue.poll();
      int ci = c[0], cj = c[1];
      int[][] adjacents = new int[][] {
          {ci + 1, cj},
          {ci - 1, cj},
          {ci, cj + 1},
          {ci, cj - 1}
      };
      for (int[] a : adjacents) {
        int ai = a[0], aj = a[1];
        if (ai < 0 || aj < 0 || ai >= h || aj >= w) continue;
        if (cells[ai][aj].equals("#")) continue;
        if (visited[ai][aj] && mins[ai][aj] <= mins[ci][cj]) continue;
        visited[ai][aj] = true;
        mins[ai][aj] = mins[ci][cj];
        queue.add(a);
      }
      for (int ai = -2 + ci; ai <= 2 + ci; ai++) {
        for (int aj = -2 + cj; aj <= 2 + cj; aj++) {
          if (ai < 0 || aj < 0 || ai >= h || aj >= w) continue;
          if (cells[ai][aj].equals("#")) continue;
          if (visited[ai][aj] && mins[ai][aj] <= mins[ci][cj] + 1) continue;
          visited[ai][aj] = true;
          mins[ai][aj] = mins[ci][cj] + 1;
          queue.add(new int[] {ai, aj});
        }
      }
    }
    if (mins[di][dj] < Integer.MAX_VALUE) System.out.println(mins[di][dj]);
    else System.out.println(-1);
  }
}