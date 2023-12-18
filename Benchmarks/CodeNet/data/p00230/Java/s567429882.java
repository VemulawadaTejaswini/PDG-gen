import java.util.*;

public class Main {
  // constant

  static final int MAX_INT = (1 << 30);

  // inner classes

  static class Node {
    int b, f;

    Node(int b, int f) {
      this.b = b;
      this.f = f;
    }
  }

  // global variables

  static int[][] bldgs;
  static int[][] dists;
  static boolean[][] visit;

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    ArrayList<Node> q = new ArrayList<Node>();

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      bldgs = new int[2][n];
      dists = new int[2][n];
      visit = new boolean[2][n];

      for (int b = 0; b < 2; b++)
        for (int f = 0; f < n; f++)
          bldgs[b][f] = sc.nextInt();

      int min_j = MAX_INT;

      for (int bs = 0; bs < 2; bs++) {

        for (int b = 0; b < 2; b++)
          for (int f = 0; f < n; f++) {
            dists[b][f] = MAX_INT;
            visit[b][f] = false;
          }

        dists[bs][0] = 0;
        visit[bs][0] = true;

        q.clear();
        q.add(new Node(bs, 0));

        while (! q.isEmpty()) {
          Node min_qn = q.get(0);
          for (int i = 1; i < q.size(); i++) {
            Node qn = q.get(i);
            if (dists[min_qn.b][min_qn.f] > dists[qn.b][qn.f])
              min_qn = qn;
          }

          q.remove(min_qn);

          int b0 = min_qn.b;
          int f0 = min_qn.f;
          //System.out.printf("[%d,%d]\n", b0, f0);

          if (f0 >= n - 1) continue;

          int b1 = 1 - b0;

          for (int f2 = f0; f2 <= f0 + 2 && f2 < n; f2++) {
            int f1 = f2;

            switch (bldgs[b1][f1]) {
            case 1:
              while (f1 < n - 1 && bldgs[b1][f1 + 1] == 1)
                f1++;
              break;
            case 2:
              while (f1 > 0 && bldgs[b1][f1] == 2)
                f1--;
              break;
            }

            if (dists[b1][f1] > dists[b0][f0] + 1) {
              dists[b1][f1] = dists[b0][f0] + 1;
              if (! visit[b1][f1]) {
                visit[b1][f1] = true;
                q.add(new Node(b1, f1));
              }
            }
          }
        }

        int d0 = dists[0][n - 1];
        int d1 = dists[1][n - 1];

        int min_d = (d0 < d1) ? d0 : d1;
        if (min_j > min_d) min_j = min_d;
      }

      System.out.println(min_j >= MAX_INT ? "NA" : min_j);
    }
  }
}