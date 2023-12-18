import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger a = new BigInteger(sc.next());
    BigInteger b = new BigInteger(sc.next());
    BigInteger c = new BigInteger(sc.next());
    BigInteger d = new BigInteger(sc.next());
    BigInteger r1 = a.multiply(c);
    BigInteger r2 = a.multiply(d);
    BigInteger r3 = b.multiply(c);
    BigInteger r4 = b.multiply(d);
    BigInteger result = r1.max(r2).max(r3).max(r4);
    System.out.println((a.compareTo(BigInteger.ZERO) <= 0 && b.compareTo(BigInteger.ZERO) >= 0) || (c.compareTo(BigInteger.ZERO) <= 0 && d.compareTo(BigInteger.ZERO) >= 0) ? result.max(BigInteger.ZERO) : result);
  }
}
