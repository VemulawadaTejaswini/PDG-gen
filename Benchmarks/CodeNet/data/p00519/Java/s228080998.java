import java.util.*;

public class Main {
  // constant
  static final int MAX_INT = 1 << 30;

  // global variables
  static int[] dists;

  // inner classes

  static class QComp implements Comparator<Integer> {
    public int compare(Integer i0, Integer i1) {
      int cmpd = dists[i0] - dists[i1];
      return  (cmpd != 0) ? cmpd : i0 - i1;
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[][] taxis = new int[n][2];
    for (int i = 0; i < n; i++) {
      taxis[i][0] = sc.nextInt();
      taxis[i][1] = sc.nextInt();
    }

    ArrayList[] nbrs = new ArrayList[n];
    for (int i = 0; i < n; i++)
      nbrs[i] = new ArrayList<Integer>();

    for (int i = 0; i < k; i++) {
      int ai = sc.nextInt() - 1;
      int bi = sc.nextInt() - 1;
      nbrs[ai].add(bi);
      nbrs[bi].add(ai);
    }

    ArrayList[] tnbrs = new ArrayList[n];
    for (int i = 0; i < n; i++)
      tnbrs[i] = new ArrayList<Integer>();

    dists = new int[n];

    for (int st = 0; st < n; st++) {
      Arrays.fill(dists, MAX_INT);
      dists[st] = 0;

      ArrayList<Integer> q = new ArrayList<Integer>();
      q.add(st);

      int max_dist = taxis[st][1];

      while (! q.isEmpty()) {
        int u = q.remove(0);

        int du = dists[u];
        if (du >= max_dist) continue;

        for (int v: (ArrayList<Integer>)nbrs[u])
          if (dists[v] >= MAX_INT) {
            dists[v] = du + 1;
            q.add(v);
            tnbrs[st].add(v);
          }
      }
    }

    Arrays.fill(dists, MAX_INT);
    dists[0] = 0;

    PriorityQueue<Integer> q = new PriorityQueue<Integer>(n, new QComp());
    q.add(0);

    while (! q.isEmpty()) {
      int u = q.poll();
      if (u == n - 1) break;

      int duv = dists[u] + taxis[u][0];

      for (int v: (ArrayList<Integer>)tnbrs[u]) {
        int dv = dists[v];
        if (dv > duv) {
          dists[v] = duv;
          Integer vi = new Integer(v);
          if (dv < MAX_INT) q.remove(vi);
          q.add(vi);
        }
      }
    }

    System.out.println(dists[n - 1]);
  }
}