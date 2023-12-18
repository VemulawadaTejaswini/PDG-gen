import java.util.*;

public class Main {
  // subroutines

  static boolean complete(Integer[] nodes, boolean[][] edges) {
    boolean[] reached = new boolean[26];
    Arrays.fill(reached, false);
    reached[nodes[0]] = true;

    ArrayList<Integer> q = new ArrayList<Integer>();
    q.add(nodes[0]);

    while (! q.isEmpty()) {
      int i0 = q.remove(0);

      for (int i1: nodes) {
        if (! reached[i1] && edges[i0][i1]) {
          reached[i1] = true;
          q.add(i1);
        }
      }
    }

    for (int i0: nodes)
      if (! reached[i0]) return false;

    return true;
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      HashSet<Integer> nhash = new HashSet<Integer>();
      boolean[][] edges = new boolean[26][26];

      for (int i0 = 0; i0 < 26; i0++)
        for (int i1 = 0; i1 < 26; i1++)
          edges[i0][i1] = false;

      int[] nout = new int[26];
      int[] nin  = new int[26];
      Arrays.fill(nout, 0);
      Arrays.fill(nin, 0);

      for (int k = 0; k < n; k++) {
        String w = sc.next();

        int i0 = w.charAt(0) - 'a';
        int i1 = w.charAt(w.length() - 1) - 'a';

        edges[i0][i1] = true;
        nout[i0]++;
        nin[i1]++;

        nhash.add(i0);
        nhash.add(i1);
      }

      boolean euler = true;

      for (int i = 0; i < 26; i++) {
        if (nin[i] != nout[i]) {
          euler = false;
          break;
        }
      }

      if (euler) {
        Integer[] nodes = new Integer[nhash.size()];
        nhash.toArray(nodes);
        euler = complete(nodes, edges);
      }

      System.out.println(euler ? "OK" : "NG");
    }
  }
}