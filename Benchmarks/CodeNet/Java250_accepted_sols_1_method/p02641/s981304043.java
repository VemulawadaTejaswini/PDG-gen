import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      int n = sc.nextInt();
      
      if (n == 0) {
         System.out.println(x);
      } else {
         int a[] = new int[n];

         for (int i = 0; i < n; i++) {
            int aa = sc.nextInt();
            a[i] = aa;
         }
            
         int b[] = new int[102];
      
         for (int j = 0; j < 102; j++) {
            b[j] = 0;
         }
      
         for (int k = 0; k < n; k++) {
            int aaa = a[k];
            b[aaa] = 1;
         }
      
         if (b[x] == 0) {
            System.out.println(x);
         } else {
            int fin = 0;
            int count = 1;
            while (fin == 0) {
               if (b[x-count] == 0) {
                  System.out.println(x-count);
                  fin++;
               } else if (fin == 0 && 101 >= x + count &&  b[x + count] == 0) {
                  System.out.println(x+count);
                  fin++;
               }
               count++;
            }
         }
      }
   }
}