import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger ans = BigInteger.ONE;
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      BigInteger next = sc.nextBigInteger();

      if (ans.multiply(next).compareTo(BigInteger.valueOf(1000000000000000000L)) > 0 ) {
        ans = BigInteger.valueOf(-1);
        break;
      } else {
        ans = ans.multiply(next);
      }
    }

    System.out.println(ans);
  }
}
