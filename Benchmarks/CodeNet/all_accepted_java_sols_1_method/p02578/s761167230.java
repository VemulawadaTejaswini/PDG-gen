import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger result = BigInteger.ZERO;
    BigInteger max = BigInteger.ZERO;
    for (int i = 0; i < n; i++) {
      BigInteger a = new BigInteger(sc.next());
      if (max.compareTo(a) < 0) {
        max = a;
      } else {
        result = result.add(max.subtract(a));
      }
    }
    System.out.println(result);
  }
}
