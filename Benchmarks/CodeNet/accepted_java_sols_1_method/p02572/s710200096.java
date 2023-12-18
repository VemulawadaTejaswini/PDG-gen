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
    BigInteger tmp = BigInteger.ZERO;
    for (int i = 0; i < n-1; i++) {
      tmp = tmp.add(numbers[i]);
      ans = ans.add(numbers[i+1].multiply(tmp));
      tmp = tmp.mod(max);
    }
    System.out.println(ans.mod(max));
  }
}
