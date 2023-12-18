import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double  a    = Double.parseDouble(scan.next());
      double  b    = Double.parseDouble(scan.next());

      int sum = (int)(a + b);

      if(sum % 2 == 1){
         System.out.println((sum / 2) + 1);
         }
      else{
          System.out.println(sum / 2);
          }
   }
}
