import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int number = 0;
      while(scan.hasNext()) {
         if(scan.hasNextInt()) {
            number = scan.nextInt();
            System.out.println(number * number * number);
         }
      }
   }
}
