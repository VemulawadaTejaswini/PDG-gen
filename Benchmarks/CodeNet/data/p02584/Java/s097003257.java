import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger x = new BigInteger(sc.next()).abs();
    BigInteger k = new BigInteger(sc.next());
    BigInteger d = new BigInteger(sc.next());

    BigInteger[] bigIntegers = x.divideAndRemainder(d);
    BigInteger q = bigIntegers[0];
    BigInteger r = bigIntegers[1];
    if (q.compareTo(k) >= 0) {
      System.out.println(x.subtract(d.multiply(k)));
      return;
    }

    BigInteger remain = q.subtract(k);
    System.out.println(remain.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0 ? r : d.subtract(r));
  }
}
