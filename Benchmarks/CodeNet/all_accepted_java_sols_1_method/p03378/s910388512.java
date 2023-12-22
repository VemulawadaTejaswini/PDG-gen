import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int x = sc.nextInt();
 
      int[] a;
      a = new int[m];
      for (int i = 0; i < m ; i++) {
         int s = sc.nextInt();
         a[i] = s;
      }
 
      int costl = 0;
      int i = 0;
 
      while (a[i] < x) {
         costl ++;
         i ++;
      }
 
      int costr = m - i;
 
      if (costl <= costr) {
          System.out.println(costl);
      }
      else {
          System.out.println(costr);
      }
   }
}