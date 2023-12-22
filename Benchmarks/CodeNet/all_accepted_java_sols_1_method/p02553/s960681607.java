import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long a = sc.nextInt();
      long b = sc.nextInt();
      long c = sc.nextInt();
      long d = sc.nextInt();
      
      long currentMax = -9223372036854775807L;

      if (a*c > currentMax) {
        currentMax = a*c;
      }

      if (a*d > currentMax) {
        currentMax = a*d;
      }

      if (b*c > currentMax) {
        currentMax = b*c;
      }

      if (b*d > currentMax) {
        currentMax = b*d;
      }

      System.out.println(currentMax);
    }
}