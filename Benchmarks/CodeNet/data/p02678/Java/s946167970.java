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
    Map<Integer, List<Integer>> rooms = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      rooms.put(i, new ArrayList<>());
    }
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      rooms.get(a).add(b);
      rooms.get(b).add(a);
    }
    Map<Integer, Integer> mins = new HashMap<>();
    Map<Integer, Integer> parent = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      mins.put(i, Integer.MAX_VALUE);
    }
    mins.put(1, 0);
    Deque<Integer> queue = new ArrayDeque<>();
    queue.add(1);
    while (!queue.isEmpty()) {
      int room = queue.poll();
      for (int next : rooms.get(room)) {
        if (mins.get(next) > mins.get(room) + 1) {
          mins.put(next, mins.get(room) + 1);
          parent.put(next, room);
          queue.add(next);
        }
      }
    }
    int[] result = new int[n + 1];
    for (int i = 2; i <= n; i++) {
      int to = i;
      if (!parent.containsKey(to)) {
        System.out.println("No");
        return;
      }
      int from = parent.get(to);
      result[to] = from;
    }
    StringBuilder sb = new StringBuilder();
    sb.append("Yes");
    for (int i = 2; i <= n; i++) {
      sb.append("\n");
      sb.append(result[i]);
    }
    System.out.println(sb.toString());
  }
}