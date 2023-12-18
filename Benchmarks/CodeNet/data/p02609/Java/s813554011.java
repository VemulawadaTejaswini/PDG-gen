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
    int count1 = baseCount - 1;
    int count2 = baseCount + 1;
    int rem1 = count1 == 0 ? 0 : xB.remainder(BigInteger.valueOf(count1)).intValue();
    int rem2 = xB.remainder(BigInteger.valueOf(count2)).intValue();
    initMod(n, count1, count2);
    for (int i = 1; i <= n; i++) {
      char tmp = xc[i - 1];
      int count = tmp == '1' ? count1 : count2;
      int r = tmp == '1' ? rem1 : rem2;
      if (count == 0) {
        System.out.println(0);
        continue;
      }
      int rem;
      if (tmp == '1') {
        rem = count1 - modMap1.get(n - i);
      } else {
        rem = modMap2.get(n - i);
      }
      System.out.println(map.get(
          (rem + r) % count
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
  private static Map<Integer, Integer> modMap1 = new HashMap<>();
  private static Map<Integer, Integer> modMap2 = new HashMap<>();
  private static void initMod(int n, int count1, int count2) {
    int i1 = 1;
    int i2 = 1;
    for (int i = 0; i <= n; i++) {
      modMap1.put(i, i1);
      modMap2.put(i, i2);
      i1 = count1 == 0 ? 0 : (i1 * 2) % count1;
      i2 = (i2 * 2) % count2;
    }
  }
}
