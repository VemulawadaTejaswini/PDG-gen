import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x[] = new int[6];
      try {
         Scanner scanner = new Scanner(System.in);
         for (int i=0; i<6; i++) {
            x[i] = scanner.nextInt();
         }
         scanner.close();
      } catch (InputMismatchException e) {
         System.out.println("error");
      }
      if (x[4]-x[0]>x[5]) {
         System.out.println(":(");
      } else {
         System.out.println("Yay!");
      }
   }
}
