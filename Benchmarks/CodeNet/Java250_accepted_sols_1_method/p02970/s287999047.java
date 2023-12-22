import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      y = scanner.nextInt();
      scanner.close();
      int kansi = y*2+1;
      if (x%kansi == 0) {
         System.out.println(x/kansi);
      } else {
         System.out.println(x/kansi + 1);
      }
   }
}
