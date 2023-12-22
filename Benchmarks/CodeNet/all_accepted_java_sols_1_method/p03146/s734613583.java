import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      HashSet<Integer> hs = new HashSet<Integer>();
      while(!hs.contains(a)) {
         hs.add(a);
         if(a % 2 == 1) {
            a = 3 * a + 1;
         }
         else {
            a /= 2;
         }
      }
      System.out.println(hs.size() + 1);
   }
}