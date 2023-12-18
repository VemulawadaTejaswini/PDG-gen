import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int d = a / b;
      int r = a % b;
      double f = (double)a / b;
      System.out.printf("%d %d %.5f\n", d, r, f);
   }
}