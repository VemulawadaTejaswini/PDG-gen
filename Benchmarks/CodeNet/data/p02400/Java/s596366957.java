import java.util.*;
import java.lang.Math.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int r = Integer.parseInt(sc.next());
      System.out.printf("%8.6f %8.6f", (Math.pow(r, r) * Math.PI), (2 * r * Math.PI));
   }
}