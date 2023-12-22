import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      for (int i = 0; i < n; i++) {
         a[i] = 0;
      }

      for (int j = 0; j < n - 1; j++) {
         int b = sc.nextInt();
         a[b-1] += 1;
      }
      
      for (int k = 0; k < n; k++) {
         System.out.println(a[k]);
      }
   }
}
