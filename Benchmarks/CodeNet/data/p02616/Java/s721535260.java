import java.math.BigInteger;
import java.util.*;

public class Main {

  private static final int MOD = 1_000_000_007;

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = scanner.nextInt();
    }
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();
    int zero = 0;
    for (int i : A) {
      if (i > 0) {
        pos.add(i);
      } else if (i < 0) {
        neg.add(i);
      } else {
        zero++;
      }
    }
    if (pos.size() + neg.size() < k || (n == k && zero > 0)) {
      System.out.println(0);
      return;
    }
    if (n == k) {
      long res = 1;
      for (int i : A) {
        res = (res * i) % MOD;
      }
      System.out.println(Math.floorMod(res, MOD));
      return;
    }
    pos.sort(Comparator.reverseOrder());
    neg.sort(Comparator.reverseOrder());
    BigInteger[] posMulLft = new BigInteger[pos.size() + 1];
    BigInteger[] negMulLft = new BigInteger[neg.size() + 1];
    BigInteger[] negMulRgt = new BigInteger[neg.size() + 1];
    posMulLft[0] = BigInteger.ONE;
    negMulLft[0] = BigInteger.ONE;
    negMulRgt[negMulRgt.length - 1] = BigInteger.ONE;
    for (int i = 1; i < Math.min(k + 1, posMulLft.length); i++) {
      posMulLft[i] = posMulLft[i - 1].multiply(BigInteger.valueOf(pos.get(i - 1)));
    }
    for (int i = 1; i < Math.min(k + 1, negMulLft.length); i++) {
      negMulLft[i] = negMulLft[i - 1].multiply(BigInteger.valueOf(neg.get(i - 1)));
    }
    for (int i = negMulRgt.length - 2, j = k; i >= 0 && j > 0; i--, j--) {
      negMulRgt[i] = negMulRgt[i + 1].multiply(BigInteger.valueOf(neg.get(i)));
    }
    BigInteger res = BigInteger.valueOf(Long.MIN_VALUE);
    for (int i = 0; i < Math.min(k + 1, posMulLft.length); i++) {
      if (k - i < negMulLft.length) {
        res = posMulLft[i].multiply(negMulLft[k - i]).max(res);
      }
    }
    for (int i = 0; i < Math.min(k + 1, negMulRgt.length); i++) {
      if (k - i < posMulLft.length) {
        res = negMulRgt[negMulRgt.length - 1 - i].multiply(posMulLft[k - i]).max(res);
      }
    }
    System.out.println(res.mod(BigInteger.valueOf(MOD)));
  }

  private static final Scanner scanner = new Scanner(System.in);
}
