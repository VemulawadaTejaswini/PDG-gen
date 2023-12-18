import java.util.Scanner;

public class Main {
   public int gcd(int a, int b)
   {
      if (a == 0) {
         return b;
      }
      if (b == 0) {
         return a;
      }
      if (a == b) {
         return a;
      }
      if (a > b) {
         return gcd(a - b, b);
      }
      return gcd(a, b-a);
   }
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      Main main = new Main();
      System.out.println(main.gcd(a,b));

   }
}
