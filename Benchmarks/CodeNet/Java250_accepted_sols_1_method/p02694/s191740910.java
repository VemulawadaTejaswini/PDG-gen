import java.math.BigInteger;
import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger x = new BigInteger(sc.next());
    BigInteger c = new BigInteger("100");
    BigInteger r = new BigInteger("100");
    long count = 0L;
    while(c.compareTo(x) < 0) {
      BigInteger tmp = c.divide(r);
      c = c.add(tmp);
      count++;
    }
    System.out.println(count);
  }
}
