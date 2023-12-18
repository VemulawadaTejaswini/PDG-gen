import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {

  static int n;
  static int a[];

  public static boolean check(int i, int k, int m) {
    if (k==m) return true;
    if (m<k || i==n) return false;

    if (check(i+1, k, m)) return true;
    if (check(i+1, k + a[i], m)) return true;

    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.next());
    a = new int[n];
    for (int i=0; i<n; i++)
      a[i] = Integer.parseInt(sc.next());

    int q = Integer.parseInt(sc.next());
    for (int i=0; i<q; i++) {
      int m = Integer.parseInt(sc.next());
      if (check(0, 0, m)) 
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }
}