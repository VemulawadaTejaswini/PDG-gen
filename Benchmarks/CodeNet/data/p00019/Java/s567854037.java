import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextInt();
    System.out.println(fact(n));
  }

  private static long fact (long n) {
    if (n == 1) {
      return 1;
    }
    return n * fact (n - 1);
  }
}