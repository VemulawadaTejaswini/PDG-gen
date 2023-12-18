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
    int[][] mins = new int[h][w];
    for (int i = 0; i < h; i++) {
      Arrays.fill(mins[i], Integer.MAX_VALUE);
    }
    mins[si][sj] = 0;
    PriorityQueue<Integer> queue = new PriorityQueue<>((Integer a, Integer b) -> {
      int ai = a / w;
      int aj = a % w;
      int bi = b / w;
      int bj = b % w;
      return mins[ai][aj] - mins[bi][bj];
    });
    queue.add(si * w + sj);
    while (!queue.isEmpty()) {
      int id = queue.poll();
      int ci = id / w, cj = id % w;
      for (int ai = -2 + ci; ai <= 2 + ci; ai++) {
        for (int aj = -2 + cj; aj <= 2 + cj; aj++) {
          if (ai == ci && aj == cj) continue;
          if (ai < 0 || aj < 0 || ai >= h || aj >= w) continue;
          if (cells[ai][aj].equals("#")) continue;
          int cost = 0;
          if (Math.abs(ai - ci) + Math.abs(aj - cj) > 1) cost = 1;
          if (mins[ai][aj] <= mins[ci][cj] + cost) continue;
          mins[ai][aj] = mins[ci][cj] + cost;
          int aid = ai * w + aj;
          queue.add(aid);
        }
      }
    }
    if (mins[di][dj] < Integer.MAX_VALUE) System.out.println(mins[di][dj]);
    else System.out.println(-1);
  }
}