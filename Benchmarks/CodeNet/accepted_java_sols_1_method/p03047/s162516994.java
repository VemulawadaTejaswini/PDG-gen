import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      int sum = 0;
      try {
         Scanner scanner = new Scanner(System.in);
         x = scanner.nextInt();
         y = scanner.nextInt();
         scanner.close();
      } catch (InputMismatchException e) {
         System.out.println("error");
      }
      sum = x-y+1;
      System.out.println(sum);
   }
}
