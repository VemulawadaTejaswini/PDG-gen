import java.util.*;
import java.lang.*;
class Main {
   public static void main(String[] args)
   {
      Scanner       scan = new Scanner(System.in);
      String        sca  = scan.next();
      StringBuilder str  = new StringBuilder(sca);
      String        sc   = scan.next();

      str.append(sc);
      Double n = Double.parseDouble(str.toString());
      int    N = (int)Math.sqrt(n);
      N = N * N;

      if(n != N){
         System.out.println("No");
         }
      else{
          System.out.println("Yes");
          }
   }
}
