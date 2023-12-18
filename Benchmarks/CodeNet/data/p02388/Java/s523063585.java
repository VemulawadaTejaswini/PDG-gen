import java.util.Scanner;
import java.lang.Math;

class Main{
   public static void main(String args[]) {
      Scanner stdIn = new Scanner(System.in);
      double db = stdIn.nextDouble();
      System.out.println(Math.pow(db,3.0));
   }
}