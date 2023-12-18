import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  private final static BigInteger MOD = new BigInteger("1000000007");

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<BigInteger> a = new ArrayList<>();
    int zeroCount = 0;
    for (int i = 0; i < n; i++) {
      BigInteger bigInteger = new BigInteger(sc.next());
      a.add(bigInteger);
      if (bigInteger.compareTo(BigInteger.ZERO) == 0) {
        zeroCount++;
      }
    }
    if (n - zeroCount < k) {
      System.out.println(0);
      return;
    } else if (n == k) {
      BigInteger result = BigInteger.ONE;
      for (int i = 0, len = k - 1; i < len; i++) {
        BigInteger bigInteger = a.get(i);
        result = mod(result.multiply(bigInteger));
      }
      System.out.println(result);
      return;
    }

    a.sort(Comparator.comparing(BigInteger::abs).reversed());
    BigInteger result = BigInteger.ONE;
    BigInteger minPos = null;
    BigInteger minNeg = null;
    int count = 0;
    for (int i = 0, len = k - 1; i < len; i++) {
      BigInteger bigInteger = a.get(i);
      result = mod(result.multiply(bigInteger));
      if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
        minNeg = bigInteger;
        count++;
      } else {
        minPos = bigInteger;
      }
    }
    if (count % 2 == 0) {
      BigInteger pos = null;
      BigInteger neg1 = null;
      BigInteger neg2 = null;
      for (int i = k - 1; i < n; i++) {
        BigInteger bigInteger = a.get(i);
        if (bigInteger.compareTo(BigInteger.ZERO) == 0) {
          break;
        }
        if (pos == null) {
          if (bigInteger.compareTo(BigInteger.ZERO) > 0) {
            pos = bigInteger;
          }
        }
        if (neg1 == null) {
          if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
            neg1 = bigInteger;
          }
        } else if (neg2 == null) {
          if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
            neg2 = bigInteger;
          }
        }
      }
      if (pos != null) {
        BigInteger tmp = mod(result.multiply(pos));
        if (minPos == null || neg1 == null || neg2 == null) {
          System.out.println(tmp);
          return;
        }
        BigInteger tmp2 = mod(mod(mod(result.multiply(minPos.modInverse(MOD))).multiply(neg1)).multiply(neg2));
        System.out.println(tmp.max(tmp2));
        return;
      }
      if (minPos == null) {
        result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
          BigInteger bigInteger = a.get(n - i - 1);
          result = mod(result.multiply(bigInteger));
        }
        System.out.println(result);
        return;
      }
      System.out.println(
          mod(mod(mod(result.multiply(minPos.modInverse(MOD)))
              .multiply(neg1))
              .multiply(neg2))
      );
    } else {
      BigInteger pos1 = null;
      BigInteger pos2 = null;
      BigInteger neg = null;
      for (int i = k - 1; i < n; i++) {
        BigInteger bigInteger = a.get(i);
        if (bigInteger.compareTo(BigInteger.ZERO) == 0) {
          break;
        }
        if (pos1 == null) {
          if (bigInteger.compareTo(BigInteger.ZERO) > 0) {
            pos1 = bigInteger;
          }
        } else if (pos2 == null) {
          if (bigInteger.compareTo(BigInteger.ZERO) > 0) {
            pos2 = bigInteger;
          }
        }
        if (neg == null) {
          if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
            neg = bigInteger;
          }
        }
      }
      if (neg != null) {
        BigInteger tmp = mod(result.multiply(neg));
        if (pos1 == null || pos2 == null) {
          System.out.println(tmp);
          return;
        }
        BigInteger tmp2 = mod(mod(mod(result.multiply(minNeg.modInverse(MOD))).multiply(pos1)).multiply(pos2));
        System.out.println(tmp.max(tmp2));
        return;
      }
      System.out.println(
          mod(mod(mod(result.multiply(minNeg.modInverse(MOD)))
              .multiply(pos1))
              .multiply(pos2)));
    }
  }

  static BigInteger mod(BigInteger a) {
    if (a.compareTo(BigInteger.ZERO) == 0) {
      return BigInteger.ZERO;
    }
    BigInteger tmp = a.remainder(MOD);
    return tmp.compareTo(BigInteger.ZERO) > 0 ? tmp : tmp.add(MOD);
  }
}
