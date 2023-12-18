// ALDS1_12_A - MST (Kruskal's)

import java.util.*;

class UF {
  int[] A;

  UF(int n) {
    A = new int[n];
    Arrays.fill(A, -1);
  }

  int find(int k) {
    if (A[k] < 0) {
      return k;
    } else {
      A[k] = find(A[k]);
      return A[k];
    }
  }

  void union(int k, int j) {
    int rk = find(k);
    int rj = find(j);
    if (A[rk] < A[rj]) { // rk has more elements
      A[rk] += A[rj]; // update rk's size
      A[rj] = rk; // point the set rk to rj
    } else {
      A[rj] += A[rk];
      A[rk] = rj;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    UF uf = new UF(n);
    List<int[]> edges = new ArrayList<int[]>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int weight = sc.nextInt();
        if (weight != -1) {
          edges.add(new int[] {i, j, weight});
        }
      }
    }
    Collections.sort(
        edges,
        new Comparator<int[]>() {
          public int compare(int[] e1, int[] e2) {
            return Integer.compare(e1[2], e2[2]);
          }
        });
    int w = 0;
    for (int[] e : edges) {
      int f1 = uf.find(e[0]);
      int f2 = uf.find(e[1]);
      if (f1 != f2) {
        w += e[2];
        uf.union(f1, f2);
      }
    }
    System.out.println(w);
  }
}
