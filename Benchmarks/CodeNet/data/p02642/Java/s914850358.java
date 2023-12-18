import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      
      int a[] = new int[n];

      for (int i = 0; i < n; i++) {
         int aa = sc.nextInt();
         a[i] = aa;
      }
      
      int count = 0;
      int ans = 0;
      
      for (int j = 0; j < n; j++) {
         for (int k = 0; k < n; k++) {
            if (a[j] % a[k] == 0) {
               count++;
            }
         } 
         if (count <= 1) {
            ans++;
         }
         count = 0;
      }
      
      System.out.println(ans);
   }
}