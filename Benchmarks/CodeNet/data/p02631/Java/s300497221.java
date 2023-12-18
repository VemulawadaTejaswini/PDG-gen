import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    Map<Long, BigInteger> a = new HashMap<>();
    BigInteger xor = BigInteger.ZERO;
    for (long i = 0; i < n; i++) {
      BigInteger ai = new BigInteger(sc.next());
      xor = xor.xor(ai);
      a.put(i, ai);
    }
    for (long i = 0; i < n; i++) {
      BigInteger bigInteger = a.get(i);
      System.out.print(bigInteger.xor(xor));
      if (i != n - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
