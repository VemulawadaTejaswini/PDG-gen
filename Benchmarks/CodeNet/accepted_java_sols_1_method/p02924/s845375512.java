import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger N = new BigInteger(sc.next());
    System.out.println(N.multiply(N.subtract(BigInteger.ONE)).divide(new BigInteger("2")).toString());
  }
}
