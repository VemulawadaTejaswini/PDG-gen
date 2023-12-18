import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int n = sc.nextInt();
      int a[] = new int[n]; int do_a[] = new int[n];
      int b[] = new int[n]; int do_b[] = new int[n];
      int c[] = new int[n]; int do_c[] = new int[n];
      
      for(int i = 0; i < n; i++)
      {
          a[i] = sc.nextInt();
          b[i] = sc.nextInt();
          c[i] = sc.nextInt();
      }
      do_a[0] = a[0];
      do_b[0] = b[0];
      do_c[0] = c[0];
      for(int i = 1; i < n; i++)
      {
          do_a[i] = a[i] + Math.max( do_b[i-1], do_c[i-1]);
          do_b[i] = b[i] + Math.max( do_a[i-1], do_c[i-1]);
          do_c[i] = c[i] + Math.max( do_a[i-1], do_b[i-1]);
      }
      w.println( Math.max( do_a[n-1], Math.max( do_b[n-1], do_c[n-1])));
      w.close();
    }
}