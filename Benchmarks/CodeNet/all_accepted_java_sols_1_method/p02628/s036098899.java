import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      
      int k = sc.nextInt();
      
      int a[] = new int[n];
      
      for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
      }
      
      Arrays.sort(a);
      
      int ans = 0;
      
      for (int j = 0; j < k; j++) {
         int x = a[j];
         ans += x;
      }
      
      System.out.println(ans);
   }
}