import java.math.BigInteger;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    Map<Integer, List<BigInteger>> valueMap = new HashMap<>();
    for (int i = 0; i < k; i++) {
      List<BigInteger> bigIntegers = valueMap.computeIfAbsent(sc.nextInt() - 1, k1 -> {
        List<BigInteger> list = new ArrayList<>();
        for (int j = 0; j < c; j++) {
          list.add(BigInteger.ZERO);
        }
        return list;
      });
      bigIntegers.set(sc.nextInt() - 1, new BigInteger(sc.next()));
    }
    for (int i = 0; i < r; i++) {
      List<BigInteger> bigIntegers = valueMap.get(i);
      if (bigIntegers == null) {
        continue;
      }
      Map<Integer, Map<Integer, BigInteger>> integerMapMap = new HashMap<>();
      map2.put(i, integerMapMap);
      for (int j = 0; j < c; j++) {
        Map<Integer, BigInteger> integerMap = new HashMap<>();
        integerMapMap.put(j, integerMap);
        List<BigInteger> valueList = new ArrayList<>();
        valueList.add(BigInteger.ZERO);
        valueList.add(BigInteger.ZERO);
        valueList.add(BigInteger.ZERO);
        BigInteger value = BigInteger.ZERO;
        for (int jj = j; jj < c; jj++) {
          BigInteger bigInteger = bigIntegers.get(jj);
          if (!bigInteger.equals(BigInteger.ZERO)) {
            BigInteger bigInteger1 = valueList.get(0);
            if (bigInteger1.compareTo(bigInteger) < 0) {
              value = value.subtract(bigInteger1).add(bigInteger);
              valueList.set(0, bigInteger);
              valueList.sort(BigInteger::compareTo);
            }
          }
          integerMap.put(jj, value);
        }
      }
    }
    System.out.println(culc(r - 1 , c - 1));
  }

  private static Map<Integer, Map<Integer, BigInteger>> map = new HashMap<>();
  private static Map<Integer, Map<Integer, Map<Integer, BigInteger>>> map2 = new HashMap<>();
  private static BigInteger culc(int r, int c) {
    if (r < 0) {
      return BigInteger.ZERO;
    }
    Map<Integer, BigInteger> integerBigIntegerMap = map.computeIfAbsent(r, k -> new HashMap<>());
    return integerBigIntegerMap.computeIfAbsent(c, k -> {
      Map<Integer, Map<Integer, BigInteger>> integerMapMap = map2.get(r);
      Function<Integer, BigInteger> getter = c1 -> {
        if (integerMapMap == null) {
          return BigInteger.ZERO;
        }
        return integerMapMap.get(c1).get(c);
      };
      BigInteger max = BigInteger.ZERO;
      for (int i = 0; i <= c; i++) {
        BigInteger add = getter.apply(i).add(culc(r - 1, i));
        if (add.compareTo(max) > 0) {
          max = add;
        }
      }
      return max;
    });
  }
}
