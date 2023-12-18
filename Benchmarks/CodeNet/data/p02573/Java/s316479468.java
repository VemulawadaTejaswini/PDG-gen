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
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<Set<Integer>> node = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      node.add(new HashSet<Integer>());
    }
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      node.get(a).add(b);
      node.get(b).add(a);
    }
    int[] groups = new int[n];
    int result = 0;
    int g = 1;
    for (int i = 0; i < n; i++) {
      if (groups[i] > 0) continue;
      int count = 1;
      groups[i] = g;
      Deque<Integer> queue = new ArrayDeque<>();
      queue.add(i);
      while (!queue.isEmpty()) {
        int id = queue.poll();
        for (int ai : node.get(id)) {
          if (groups[ai] > 0) continue;
          groups[ai] = g;
          count++;
          queue.add(ai);
        }
      }
      g++;
      result = Math.max(result, count);
    }
    System.out.println(result);
  }
}