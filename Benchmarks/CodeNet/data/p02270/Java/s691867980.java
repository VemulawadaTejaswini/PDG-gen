import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

  static final int N = 100000;
  static final int K = 100000;
  static int n, k;
  static int w[], c[];

  public static boolean check(int lmt) {
    int i, j;

    for (i=0; i<n; i++)
      if (lmt < w[i]) return false;

    Arrays.fill(c, 0);
    int full = -1;
    for (i=0; i<n; i++) {
      boolean is_put = false;
      for (j=full+1; j<k; j++) {
        if (lmt < c[j] + w[i])
          full++; 
        else {
          c[j] += w[i];
          if (c[j] == lmt) full++;
          is_put = true;
          break;
        }
      }
      if (!is_put) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    int i;
    Scanner sc = new Scanner(System.in); 
    n = Integer.parseInt(sc.next());
    w = new int[n];
    k = Integer.parseInt(sc.next());
    c = new int[k];
    for (i=0; i<n; i++)
      w[i] = Integer.parseInt(sc.next());

    Arrays.fill(c, 0);

    //?±?????????????(l, u]????????????????????¨??????????????¢?´¢
    int l = 0, u = 0;
    for (i=0; i<n; i++) u += w[i];
    while (u-l > 1) {
      int m = (l + u)/2;
      if (check(m))
        u = m;
      else
        l = m;
    }

    System.out.println(u);
  }
}