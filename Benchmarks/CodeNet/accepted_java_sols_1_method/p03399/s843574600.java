import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();

      int train;
      int bus;

      if (a <= b) {
         train = a;
      } 
      else {
         train = b;
      }

      if (c <= d) {
         bus = c;
      } 
      else {
         bus = d;
      }
      System.out.println(train + bus);
   }
}