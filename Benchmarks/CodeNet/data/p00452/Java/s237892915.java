import java.util.*;

public class Main {
  // constant
  static final int MAX_N = 1000;

  // subroutines
  static int lower_bound(int[] arr, int key, int i0, int i1) {
    int lb = i0 - 1;
    int ub = i1;

    while (lb + 1 < ub) {
      int m = (lb + ub) / 2;
      if (arr[m] <= key)
        lb = m;
      else
        ub = m;
    }

    return lb;
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      if ((n | m) == 0) break;

      int[] ps = new int[n + 1];
      ps[0] = 0;

      for (int i = 1; i <= n; i++)
        ps[i] = sc.nextInt();

      int[] p2s = new int[(n + 1) * (n + 2) / 2];
      int np2s = 0;

      for (int i = 0; i <= n; i++) {
        int pi = ps[i];
        for (int j = i; j <= n; j++)
          p2s[np2s++] = pi + ps[j];
      }

      Arrays.sort(p2s);

      int max_s = 0;

      for (int p2: p2s) {
        if (m < p2) break;
        int rem = p2s[lower_bound(p2s, m - p2, 0, np2s)];
        int s = p2 + rem;
        if (max_s < s) max_s = s;
      }

      System.out.println(max_s);
    }
  }
}