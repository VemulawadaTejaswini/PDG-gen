import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    BigInteger total = new BigInteger(String.format("%d", n));
    BigInteger sum = new BigInteger("0");
    scanner.nextLine();
    for (int ii = 0; ii < n; ii++) {
      BigInteger pr = new BigInteger(scanner.nextLine());
      sum = sum.add(pr);
    }
    System.out.println(sum.divide(total));
  }
}