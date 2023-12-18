import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    int n = sc.nextInt();

    BigInteger fact = BigInteger.ONE;
    for(long i = 1; i <= n; i++) {
      fact = fact.multiply(BigInteger.valueOf(i));
    }

    System.out.println(fact);
  }

  private final Scanner sc = new Scanner(System.in);
}