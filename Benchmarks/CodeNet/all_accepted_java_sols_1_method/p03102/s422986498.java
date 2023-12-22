import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int c = sc.nextInt();
      
      int[] b = new int[m];
      for(int i = 0; i < m; i++) {
         b[i] = sc.nextInt();
      }
      
      int count = 0;
      for(int i = 0; i < n; i++) {
         int val = c;
         for(int j = 0; j < m; j++) {
            val += b[j] * sc.nextInt();
         }
         if(val > 0)
            count++;
      }
      System.out.println(count);
   }
}