import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger x = new BigInteger(sc.next());
    BigInteger n = new BigInteger("360");
    BigInteger gcd = x.gcd(n);
    System.out.println(n.divide(gcd));
  }
}
