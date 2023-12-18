import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

  static final int N = 100000;
  static final int Q = 50000;
  static int n, q;
  static int s[], t[];

  public static int binary_search(int x) {
    int l = 0;
    int r = n;
    int m;
    while (r-l > 0) {
      m = (l+r)/2;
      if (s[m] == x)
      return m;
      else if (s[m] < x) 
        l = m + 1;
      else
        r = m;
    }
    return -1;
  }

  public static void main(String[] args) {
    int i;
    Scanner sc = new Scanner(System.in); 
    n = Integer.parseInt(sc.next());
    s = new int[n];
    for (i=0; i<n; i++)
      s[i] = Integer.parseInt(sc.next());

    q = Integer.parseInt(sc.next());
    t = new int[q];
    for (i=0; i<q; i++)
      t[i] = Integer.parseInt(sc.next());

    int res = 0;
    for (i=0; i<q; i++)
      if (binary_search(t[i]) != -1)
        res++;

    System.out.println(res);
  }
}