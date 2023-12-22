import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      int sum = 0;
      try {
         Scanner scanner = new Scanner(System.in);
         x = scanner.nextInt();
         scanner.close();
      } catch (InputMismatchException e) {
         System.out.println("error");
      }
      y = x/100;
      int z = x - y*100;
      if ((y<1 || y>12) && (z<1 || z>12)) {
         System.out.println("NA");
      } else if (y>0 && y<13 && z>0 && z<13) {
         System.out.println("AMBIGUOUS");
      } else if (y>0 && y<13) {
         System.out.println("MMYY");
      } else if (z>0 && z<13) {
         System.out.println("YYMM");
      }
   }
}
