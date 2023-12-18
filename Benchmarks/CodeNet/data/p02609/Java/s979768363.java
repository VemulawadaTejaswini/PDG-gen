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
    for (int i = 1; i <= n; i++) {
      char tmp = xc[i - 1];
      BigInteger t = tmp == '1' ? count1 : count2;
      BigInteger newB;
      if (tmp == '1') {
        newB = xB.clearBit(n - i);
      } else {
        newB = xB.setBit(n - i);
      }
      System.out.println(newB.compareTo(BigInteger.ZERO) == 0 ? 0 : map.get(newB.remainder(t).intValue()) + 1);
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
}
