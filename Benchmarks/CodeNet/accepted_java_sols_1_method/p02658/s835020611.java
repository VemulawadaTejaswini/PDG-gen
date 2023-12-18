import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger limit = new BigInteger("10").pow(18);
    BigInteger error = new BigInteger("-1");
    int n = sc.nextInt();
    BigInteger result = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      BigInteger a = new BigInteger(sc.next());
      if (a.compareTo(BigInteger.ZERO) == 0) {
        System.out.println(0);
        return;
      }
      if (result != error) {
        result = result.multiply(a);
        if (result.compareTo(limit) > 0) {
          result = error;
        }        
      }
    }
    System.out.println(result);
  }
}
