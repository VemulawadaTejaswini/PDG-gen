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
    int[] v = new int[n];
    int[] w = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
      w[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    int[] vi = new int[q];
    int[] l = new int[q];
    for (int  i = 0; i < q; i++) {
      vi[i] = sc.nextInt() - 1;
      l[i] = sc.nextInt();
    }
    List<Map<Integer, Integer>> nodes = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      nodes.add(new HashMap<>());
    }
    nodes.get(0).put(0, 0);
    nodes.get(0).put(w[0], v[0]);
    for (int i = 1; i < n; i++) {
      Map<Integer, Integer> parent = nodes.get((i - 1) / 2);
      Map<Integer, Integer> node = nodes.get(i);
      for (int weight: parent.keySet()) {
        if (node.containsKey(weight)) {
          int max = Math.max(node.get(weight), parent.get(weight));
          node.put(weight,max);
        } else {
          node.put(weight, parent.get(weight));
        }
        if (node.containsKey(weight + w[i])) {
          int max = Math.max(node.get(weight + w[i]), parent.get(weight) + v[i]);
          node.put(weight + w[i], max);
        } else {
          node.put(weight + w[i], parent.get(weight) + v[i]);
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < q; i++) {
      if (sb.length() > 0) sb.append("\n");
      Integer[] weights = nodes.get(vi[i]).keySet().toArray(new Integer[0]);
      Arrays.sort(weights);
      if (l[i] < weights[0]) {
        sb.append(0);
        continue;
      }
      int left = 0;
      int right = weights.length;
      while (right - left > 1) {
        int m = left + (right - left) / 2;
        if (weights[m] <= l[i]) left = m;
        else right = m;
      }
      int max = 0;
      for (int j = 0; j <= left; j++) max = Math.max(max, nodes.get(vi[i]).get(weights[j]));
      sb.append(max);
    }
    System.out.println(sb.toString());
  }
}