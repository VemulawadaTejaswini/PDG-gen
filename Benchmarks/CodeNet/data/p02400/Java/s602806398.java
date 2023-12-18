import java.util.*;
import java.lang.Math.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double r = Double.parseDouble(sc.next());
      System.out.printf("%f %f\n", (Math.pow(r, r) * Math.PI), (2 * r * Math.PI));
   }
}