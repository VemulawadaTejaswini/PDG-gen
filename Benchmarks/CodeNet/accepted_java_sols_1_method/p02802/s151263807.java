import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] p = new int[m];
      String[] s = new String[m];
      for (int i = 0; i < p.length; i++) {
         p[i] = sc.nextInt();
         s[i] = sc.next();
      }

      int w = 0;
      int a = 0;

      
      int[] c = new int[n+1];
      int[] count = new int[n+1];
      int[] acount = new int[n+1];
      for (int i = 0; i < c.length; i++) {
         c[i] = 0;
         count[i] = 0;
         acount[i] = 0;
      }

      for (int i = 0; i < m; i++) {
         int pc = p[i];
         count[pc] = count[pc] + 1;
         if("AC".equals(s[i])){
            acount[pc] = acount[pc] + 1;
         }
         else{
            if(acount[pc]<1){
               c[pc] = c[pc] + 1;
            } 
         }
      }
      for (int i = 1; i <= n; i++) {
         if(c[i] < count[i]){
            w = w + c[i];
         }
         if(acount[i]>= 1){
            a = a + 1;
         }
      } 

      System.out.print(a);
      System.out.print(' ');
      System.out.println(w);
   }
}