import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    int i, j;
    Scanner sc = new Scanner(System.in); 
    int n = Integer.parseInt(sc.next());
    int t[] = new int[n];

    for (i=0; i<n; i++)
      t[i] = Integer.parseInt(sc.next());

    int q = Integer.parseInt(sc.next());
    HashSet s = new HashSet();
    for (i=0; i<q; i++) {
      int a = Integer.parseInt(sc.next());
      if (s.contains(a)) s.add(a);
    }

    int res = 0;
    for (i=0; i<n; i++)
      if (s.contains(t[i])) res++;

    System.out.println(res);
  }
}