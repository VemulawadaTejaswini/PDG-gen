import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    init();
    int n = sc.nextInt();
    String x = sc.next();
    char[] xc = x.toCharArray();
    int baseCount = 0;
    for (int j = 0, len = x.length(); j < len; j++) {
      if (xc[j] == '1') {
        baseCount++;
      }
    }
    BigInteger xB = new BigInteger(x, 2);
    BigInteger count1 = BigInteger.valueOf(baseCount - 1);
    BigInteger count2 = BigInteger.valueOf(baseCount + 1);
    BigInteger rem1 = count1.compareTo(BigInteger.ZERO) == 0 ? BigInteger.ZERO : xB.remainder(count1);
    BigInteger rem2 = xB.remainder(count2);
    initMod(n, count1, count2);
    for (int i = 1; i <= n; i++) {
      char tmp = xc[i - 1];
      BigInteger count = tmp == '1' ? count1 : count2;
      BigInteger r = tmp == '1' ? rem1 : rem2;
      if (count.compareTo(BigInteger.ZERO) == 0) {
        System.out.println(0);
        continue;
      }
      BigInteger rem;
      if (tmp == '1') {
        rem = modMap1.get(n - i).negate().add(count1);
      } else {
        rem = modMap2.get(n - i);
      }
      System.out.println(map.get(
          rem.add(r).remainder(count).intValue()
      ) + 1);
    }
  }

  private static Map<Integer, Integer> map = new HashMap<>();
  private static void init() {
    int limit = 200000;
    map.put(0, 0);
    map.put(1, 1);
    for (int i = 2; i <= limit; i++) {
      String b = Integer.toString(i, 2);
      int count = 0;
      for (int j = 0, len = b.length(); j < len; j++) {
        if (b.charAt(j) == '1') {
          count++;
        }
      }
      int t = map.get(i % count);
      map.put(i, t + 1);
    }
  }

  private static final BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);
  private static Map<Integer, BigInteger> modMap1 = new HashMap<>();
  private static Map<Integer, BigInteger> modMap2 = new HashMap<>();
  private static void initMod(int n, BigInteger count1, BigInteger count2) {
    BigInteger i1 = BigInteger.ONE;
    BigInteger i2 = BigInteger.ONE;
    for (int i = 0; i <= n; i++) {
      modMap1.put(i, i1);
      modMap2.put(i, i2);
      i1 = count1.compareTo(BigInteger.ZERO) == 0 ? BigInteger.ZERO : i1.multiply(TWO).remainder(count1);
      i2 = i2.multiply(TWO).remainder(count2);
    }
  }
}
