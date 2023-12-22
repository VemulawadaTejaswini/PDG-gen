import java.util.*;

public class Main {
   public static void main(final String[] args) {
      final Scanner sc = new Scanner(System.in);

      final int n = sc.nextInt();

      if (n % 10 == 7) {
         System.out.println("Yes");
      }
      else if ((n / 10) % 10 == 7) {
         System.out.println("Yes");
      }
      else if (n / 100 == 07){
         System.out.println("Yes");
      }
      else {
         System.out.println("No");
      }
   }
}