import java.util.*;

public class Main {
  // constant

  static final int MAX_INT = 1 << 30;
  static final int MAX_N = 100;

  // inner classes

  static class QComp implements Comparator<Integer> {
    public int compare(Integer i0, Integer i1) {
      return dists[i0.intValue()] - dists[i1.intValue()];
    }
  }

  // global variables

  static int[] dists;

  // main

  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int pn = sc.nextInt();
      if ((n | m | pn) == 0) break;

      int[][] edges = new int[n][n];
      for (int i = 0; i < n; i++)
	for (int j = 0; j < n; j++) edges[i][j] = 0;

      ArrayList<ArrayList<Integer>> nbrs = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < n; i++)
	nbrs.add(new ArrayList<Integer>());

      for (int k = 0; k < m; k++) {
	int i = sc.nextInt();
	int j = sc.nextInt();
	int w = sc.nextInt();

	nbrs.get(i).add(j);
	nbrs.get(j).add(i);
	edges[i][j] = edges[j][i] = w;
      }

      int[] cis = new int[pn];
      for (int i = 0; i < pn; i++)
	cis[i] = sc.nextInt();

      dists = new int[n];
      Arrays.fill(dists, MAX_INT);
      dists[0] = 0;

      ArrayList<ArrayList<Integer>> prevs = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < n; i++)
	prevs.add(new ArrayList<Integer>());

      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n, new QComp());
      pq.add(0);

      while (! pq.isEmpty()) {
	Integer ui = pq.poll();
	int u = ui.intValue();
	if (u == n - 1) continue;

	int du = dists[u];

	for (Integer vi: nbrs.get(u)) {
	  int v = vi.intValue();
	  int dv = dists[v];
	  int ndv = du + edges[u][v];
	  ArrayList<Integer> prvv = prevs.get(v);
	  
	  if (dv > ndv) {
	    dists[v] = ndv;
	    prvv.clear();
	    prvv.add(u);

	    if (dv < MAX_INT) pq.remove(new Integer(v));
	    pq.add(v);
	  }
	  else if (dv == ndv)
	    prvv.add(u);
	}
      }
      if (1 == 0) {
	for (int i = 0; i < n; i++)
	  System.out.println(dists[i]);
	break;
      }
      if (1 == 0) {
	for (int i = 0; i < n; i++) {
	  System.out.print("[");
	  for (int j: prevs.get(i))
	    System.out.print(" " + j);
	  System.out.print("]");
	}
	System.out.println();
	break;
      }

      ArrayList<ArrayList<Integer>> nexts = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < n; i++)
	nexts.add(new ArrayList<Integer>());

      for (int i = 0; i < n; i++)
	for (int j: prevs.get(i))
	  nexts.get(j).add(i);

      if (1 == 0) {
	for (int i = 0; i < n; i++) {
	  System.out.print("[");
	  for (int j: nexts.get(i))
	    System.out.print(" " + j);
	  System.out.print("]");
	}
	System.out.println();
	break;
      }

      int[] counts = new int[n];
      Arrays.fill(counts, 0);
      counts[0] = 1;

      int[] ncounts = new int[n];
      Arrays.fill(ncounts, 0);

      ArrayList<Integer> q = new ArrayList<Integer>();
      q.add(0);

      while (! q.isEmpty()) {
	int u = q.remove(0);

	if (prevs.get(u).size() > ncounts[u]) {
	  q.add(u);
	  continue;
	}

	int cu = counts[u];

	for (int v: nexts.get(u)) {
	  int cv = counts[v];
	  counts[v] += cu;
	  ncounts[v]++;

	  if (cv == 0)
	    q.add(v);
	}
      }
      if (1 == 0) {
	for (int i = 0; i < n; i++)
	  System.out.println(counts[i]);
	break;
      }

      double[] pbs = new double[n];
      Arrays.fill(pbs, 0.0);
      pbs[n - 1] = 1.0;

      int[] npbs = new int[n];
      Arrays.fill(npbs, 0);

      q.add(n - 1);

      while (! q.isEmpty()) {
	int u = q.remove(0);

	if (nexts.get(u).size() > npbs[u]) {
	  q.add(u);
	  continue;
	}

	double pu = pbs[u];
	int cu = counts[u];

	for (int v: prevs.get(u)) {
	  double pv = pbs[v];
	  pbs[v] += pu * counts[v] / cu;
	  npbs[v]++;

	  if (pv == 0.0)
	    q.add(v);
	}
      }

      for (int i = 0; i < pn; i++)
	System.out.printf("%.8f\n", pbs[cis[i]]);
      System.out.println();
    }
  }
}