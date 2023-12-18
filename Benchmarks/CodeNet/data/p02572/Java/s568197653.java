import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger[] numbers = new BigInteger[n];
    BigInteger max = new BigInteger("1000000007");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextBigInteger();
    }
    BigInteger ans = BigInteger.ZERO;
    for (int i = 0; i < n-1; i++) {
      BigInteger tmp = BigInteger.ZERO;
      for (int j = i+1; j < n; j++) {
        tmp = tmp.add(numbers[j]);
      }
      tmp = tmp.mod(max);
      ans = ans.add(numbers[i].multiply(tmp).mod(max));
    }
    System.out.println(ans.mod(max));
  }
}
