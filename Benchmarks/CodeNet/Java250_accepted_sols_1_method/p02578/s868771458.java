import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger sum = BigInteger.ZERO;

    long a1 = sc.nextInt();
    for (int i = 1; i < n; i++) {
      long a2 = sc.nextLong();
      if (a1 > a2) {
        long x = a1 - a2;
        sum = sum.add(BigInteger.valueOf(x));
        a1 = a2 + x;
      } else {
        a1 = a2;
      }
    }
    System.out.println(sum);
  }
}