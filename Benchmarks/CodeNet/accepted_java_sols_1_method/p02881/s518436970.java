import java.math.BigInteger;
import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(sc.next());
    BigInteger sqrt = BigInteger.ONE;
    for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
      if (i.multiply(i).compareTo(n) > 0) {
        sqrt = i.subtract(BigInteger.ONE);
        break;
      }
    }
    for (BigInteger i = sqrt; i.compareTo(BigInteger.ZERO) > 0; i = i.subtract(BigInteger.ONE)) {
      if (n.remainder(i).compareTo(BigInteger.ZERO) == 0) {
        System.out.println(i.subtract(BigInteger.ONE).add(n.divide(i).subtract(BigInteger.ONE)));
        break;
      }
    }
  }
}
