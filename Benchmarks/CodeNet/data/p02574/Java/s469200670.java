import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(sc.next());
    List<BigInteger> a = new ArrayList<>();
    for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
      a.add(new BigInteger(sc.next()));
    }
    IntUtil.preProcessPrimeFactorization(a.stream().max(Comparator.naturalOrder()).get());
    boolean isPairwiseCoprime = true;
    Set<BigInteger> allPrimeFactor = new HashSet<>();
    BigInteger gcd = a.get(0);
    for (BigInteger ai : a) {
      if (isPairwiseCoprime) {
        Set<BigInteger> longs = IntUtil.primeFactorization(ai).keySet();
        if (longs.stream().anyMatch(allPrimeFactor::contains)) {
          isPairwiseCoprime = false;
        } else {
          allPrimeFactor.addAll(longs);
        }
      }
      gcd = gcd.gcd(ai);
    }
    System.out.println(
        isPairwiseCoprime ? "pairwise coprime" :
            gcd.compareTo(BigInteger.ONE) == 0 ? "setwise coprime" : "not coprime"
    );
  }
}

/**
 * 整数ユーティリティー
 */
class IntUtil {
  /**
   * 拡張ユークリッドの互除法
   * @param x 数値1
   * @param y 数値2
   * @return [xとyの最大公約数r, a, b] (ただしa, bは ax + by = r となる整数)
   */
  static BigInteger[] gcd(BigInteger x, BigInteger y) {
    BigInteger r0 = x;
    BigInteger r1 = y;
    BigInteger a0 = BigInteger.ONE;
    BigInteger a1 = BigInteger.ZERO;
    BigInteger b0 = BigInteger.ZERO;
    BigInteger b1 = BigInteger.ONE;
    while(r1.compareTo(BigInteger.ZERO) > 0) {
      BigInteger[] tmp = r0.divideAndRemainder(r1);
      BigInteger q = tmp[0];
      BigInteger r = tmp[1];
      BigInteger a = a0.subtract(q.multiply(a1));
      BigInteger b = b0.subtract(q.multiply(b1));
      r0 = r1;
      r1 = r;
      a0 = a1;
      a1 = a;
      b0 = b1;
      b1 = b;
    }
    return new BigInteger[]{r0, a0, b0};
  }

  /**
   * 最小公倍数を求める。
   * @param x 数値1
   * @param y 数値2
   * @return 最小公倍数
   */
  public static BigInteger lcm(BigInteger x, BigInteger y) {
    BigInteger gcd = x.gcd(y);
    return x.multiply(y).subtract(gcd);
  }

  private static final Map<BigInteger, BigInteger> SQRT_FLOOR_MAP = new HashMap<>();

  /**
   * nの平方根以下の最大の整数を返す
   * @param n 整数
   * @return nの平方根以下の最大の整数
   */
  public static BigInteger sqrtFloor(BigInteger n) {
    return SQRT_FLOOR_MAP.computeIfAbsent(n, key -> {
      try {
        return BigDecimal.valueOf(Math.sqrt(n.longValueExact())).toBigInteger();
      } catch (ArithmeticException e) {
        BigDecimal nq = new BigDecimal(n);
        BigDecimal x = BigDecimal.ONE;
        BigDecimal d2 = BigDecimal.ONE.add(BigDecimal.ONE);
        BigInteger r = new BigInteger("1000000000");
        BigInteger r1 = r.add(BigInteger.ONE);
        while (!(r.multiply(r).compareTo(n) <= 0 && r1.multiply(r1).compareTo(n) > 0)) {
          for (int i = 0; i < 10; i++) {
            x = x.add(nq.divide(x, BigDecimal.ROUND_HALF_DOWN)).divide(d2);
          }
          r = x.toBigInteger();
          r1 = r.add(BigInteger.ONE);
        }
        return r;
      }
    });
  }

  /** 最小の素因数へのマップ */
  private static final Map<Long, Long> MIN_PRIME_FACTOR_MAP = new HashMap<>();

  /** 最小の素因数へのマップ */
  private static final Map<BigInteger, BigInteger> MIN_PRIME_FACTOR_MAP_BIG_INTEGER = new HashMap<>();

  public static void preProcessPrimeFactorization(long max) {
    for (long i = 2, limit = (long) Math.floor(Math.sqrt(max)); i <= max; i++) {
      if (MIN_PRIME_FACTOR_MAP.containsKey(i)) {
        continue;
      }
      if (i > limit) {
        MIN_PRIME_FACTOR_MAP.put(i, i);
        continue;
      }
      for (long j = 1, len = max / i; j <= len; j++) {
        long m = i * j;
        if (!MIN_PRIME_FACTOR_MAP.containsKey(m)) {
          MIN_PRIME_FACTOR_MAP.put(m, i);
        }
        if (m > max) {
          break;
        }
      }
    }
  }

  public static void preProcessPrimeFactorization(BigInteger max) {
    for (BigInteger i = BigInteger.valueOf(2), limit = sqrtFloor(max); i.compareTo(max) <= 0; i = i.add(BigInteger.ONE)) {
      if (MIN_PRIME_FACTOR_MAP_BIG_INTEGER.containsKey(i)) {
        continue;
      }
      if (i.compareTo(limit) > 0) {
        MIN_PRIME_FACTOR_MAP_BIG_INTEGER.put(i, i);
        continue;
      }
      for (BigInteger j = BigInteger.ONE, len = max.divide(i); j.compareTo(len) <= 0; j = j.add(BigInteger.ONE)) {
        BigInteger m = i.multiply(j);
        if (!MIN_PRIME_FACTOR_MAP_BIG_INTEGER.containsKey(m)) {
          MIN_PRIME_FACTOR_MAP_BIG_INTEGER.put(m, i);
        }
        if (m.compareTo(max) > 0) {
          break;
        }
      }
    }
  }

  public static long getMinPrimeFactor(long n) {
    return MIN_PRIME_FACTOR_MAP.get(n);
  }

  public static BigInteger getMinPrimeFactor(BigInteger n) {
    return MIN_PRIME_FACTOR_MAP_BIG_INTEGER.get(n);
  }

  /**
   * 素因数分解
   * @param x 整数
   * @return 素因数分解の結果。[[素数1, 次数1], [素数2, 次数2], ...] (素数1 < 素数2 < ...)
   */
  public static Map<Long, Long> primeFactorization(long x) {
    Map<Long, Long> result = new HashMap<>();
    if (MIN_PRIME_FACTOR_MAP.containsKey(x)) {
      while (x > 1) {
        Long prime = MIN_PRIME_FACTOR_MAP.get(x);
        Long aLong = result.get(prime);
        if (aLong == null) {
          aLong = 0L;
        }
        result.put(prime, aLong + 1);
        x = x / prime;
      }
    } else {
      for (long i = 2, len = (long) Math.floor(Math.sqrt(x)); i <= len; i++) {
        if (x % i == 0) {
          long count = 0;
          while (x % i == 0) {
            count++;
            x = x / i;
          }
          result.put(i, count);
        }
      }
      if (x > 1) {
        result.put(x, 1L);
      }
    }
    return result;
  }

  /**
   * 素因数分解
   * @param x 整数
   * @return 素因数分解の結果。[[素数1, 次数1], [素数2, 次数2], ...] (素数1 < 素数2 < ...)
   */
  public static Map<BigInteger, BigInteger> primeFactorization(BigInteger x) {
    Map<BigInteger, BigInteger> result = new HashMap<>();
    if (MIN_PRIME_FACTOR_MAP_BIG_INTEGER.containsKey(x)) {
      while (x.compareTo(BigInteger.ONE) > 0) {
        BigInteger prime = MIN_PRIME_FACTOR_MAP_BIG_INTEGER.get(x);
        BigInteger aLong = result.get(prime);
        if (aLong == null) {
          aLong = BigInteger.ZERO;
        }
        result.put(prime, aLong.add(BigInteger.ONE));
        x = x.divide(prime);
      }
    } else {
      for (BigInteger i = new BigInteger("2"), len = sqrtFloor(x); i.compareTo(len) <= 0; i = i.add(BigInteger.ONE)) {
        if (x.remainder(i).compareTo(BigInteger.ZERO) == 0) {
          BigInteger count = BigInteger.ZERO;
          while (x.remainder(i).compareTo(BigInteger.ZERO) == 0) {
            count = count.add(BigInteger.ONE);
            x = x.divide(i);
          }
          result.put(i, count);
        }
      }
      if (x.compareTo(BigInteger.ONE) > 0) {
        result.put(x, BigInteger.ONE);
      }
    }
    return result;
  }

  private static final Map<BigInteger, Map<BigInteger, BigInteger>> MOD_MAP = new HashMap<>();

  /**
   * modを法とするnの逆元を求める。(キャッシュ付き)
   * @param n 整数
   * @param mod 法
   * @return modを法とするnの逆元
   */
  public static BigInteger modInverse(BigInteger n, BigInteger mod) {
    return MOD_MAP.computeIfAbsent(mod, k -> new HashMap<>()).computeIfAbsent(n, k -> n.modInverse(mod));
  }

  private static final Map<BigInteger, Map<BigInteger, Map<BigInteger, BigInteger>>> P_MAP = new HashMap<>();

  /**
   * n P k を計算する。
   * @param n 整数
   * @param k 整数
   * @return n P k
   */
  public static BigInteger p(BigInteger n, BigInteger k) {
    return pInner(n, k, P_MAP.computeIfAbsent(BigInteger.ONE, key -> new HashMap<>()));
  }
  /**
   * modを法としたn P k を計算する。
   * @param n 整数
   * @param k 整数
   * @param mod 法
   * @return modを法としたn P k
   */
  public static BigInteger p(BigInteger n, BigInteger k, BigInteger mod) {
    return pInner(n, k, mod, P_MAP.computeIfAbsent(mod, key -> new HashMap<>()));
  }

  public static BigInteger pInner(BigInteger n, BigInteger k, Map<BigInteger, Map<BigInteger, BigInteger>> map) {
    return map.computeIfAbsent(n, key -> new HashMap<>())
        .computeIfAbsent(k, key -> k.compareTo(BigInteger.ZERO) <= 0 ? BigInteger.ONE : n.multiply(pInner(n.subtract(BigInteger.ONE), k.subtract(BigInteger.ONE), map)));
  }

  public static BigInteger pInner(BigInteger n, BigInteger k, BigInteger mod, Map<BigInteger, Map<BigInteger, BigInteger>> map) {
    return map.computeIfAbsent(n, key -> new HashMap<>())
        .computeIfAbsent(k, key -> k.compareTo(BigInteger.ZERO) <= 0 ? BigInteger.ONE : n.multiply(pInner(n.subtract(BigInteger.ONE), k.subtract(BigInteger.ONE), map)).remainder(mod));
  }

  private static final Map<BigInteger, Map<BigInteger, Map<BigInteger, BigInteger>>> C_MAP = new HashMap<>();

  /**
   * n C k を計算する。
   * 計算量： O(k log(k))
   * @param n 整数
   * @param k 整数
   * @return n C k
   */
  public static BigInteger c(BigInteger n, BigInteger k) {
    return cInner(n, n.compareTo(k.add(k)) < 0 ? k : n.subtract(k), C_MAP.computeIfAbsent(BigInteger.ONE, key -> new HashMap<>()));
  }

  /**
   * modを法としたn C k を計算する。
   * 計算量： O(k log(k))
   * @param n 整数
   * @param k 整数
   * @param mod 法
   * @return modを法としたn C k
   */
  public static BigInteger c(BigInteger n, BigInteger k, BigInteger mod) {
    return cInner(n, n.compareTo(k.add(k)) < 0 ? k : n.subtract(k), mod, C_MAP.computeIfAbsent(mod, key -> new HashMap<>()));
  }

  private static BigInteger cInner(BigInteger n, BigInteger k, Map<BigInteger, Map<BigInteger, BigInteger>> map) {
    return map.computeIfAbsent(n, key -> new HashMap<>()).computeIfAbsent(k, key -> p(n, k).divide(p(k, k)));
  }

  private static BigInteger cInner(BigInteger n, BigInteger k, BigInteger mod, Map<BigInteger, Map<BigInteger, BigInteger>> map) {
    return map.computeIfAbsent(n, key -> new HashMap<>()).computeIfAbsent(k, key -> p(n, k, mod).multiply(modInverse(p(k, k), mod)).remainder(mod));
  }

  /**
   * n C k を計算する。同時に(n, k)以下の全ての(i, j)に対して i C j をキャッシュする。
   * 計算量： O(n k)
   * @param n 整数
   * @param k 整数
   * @return n C k
   */
  public static BigInteger cCache(BigInteger n, BigInteger k) {
    return cInner(n, n.compareTo(k.add(k)) < 0 ? k : n.subtract(k), C_MAP.computeIfAbsent(BigInteger.ONE, key -> new HashMap<>()));
  }

  /**
   * modを法とした n C k を計算する。同時に(n, k)以下の全ての(i, j)に対して i C j をキャッシュする。
   * 計算量： O(n k)
   * @param n 整数
   * @param k 整数
   * @param mod 法
   * @return modを法としたn C k
   */
  public static BigInteger cCache(BigInteger n, BigInteger k, BigInteger mod) {
    return cInner(n, k.min(n.subtract(k)), mod, C_MAP.computeIfAbsent(mod, key -> new HashMap<>()));
  }

  private static BigInteger cCacheInner(BigInteger n, BigInteger k, Map<BigInteger, Map<BigInteger, BigInteger>> map) {
    return map.computeIfAbsent(n, key -> new HashMap<>()).computeIfAbsent(k, key -> {
      if (k.compareTo(BigInteger.ONE) == 0) {
        return n;
      } else if (k.compareTo(BigInteger.ZERO) <= 0) {
        return BigInteger.ONE;
      }
      BigInteger n1 = n.subtract(BigInteger.ONE);
      BigInteger k1 = k.subtract(BigInteger.ONE);
      return cCacheInner(n1, k.min(n1.subtract(k)), map).add(cCacheInner(n1, k1.min(n1.subtract(k1)), map));
    });
  }

  private static BigInteger cCacheInner(BigInteger n, BigInteger k, BigInteger mod, Map<BigInteger, Map<BigInteger, BigInteger>> map) {
    return map.computeIfAbsent(n, key -> new HashMap<>()).computeIfAbsent(k, key -> {
      if (k.compareTo(BigInteger.ONE) == 0) {
        return n;
      } else if (k.compareTo(BigInteger.ZERO) <= 0) {
        return BigInteger.ONE;
      }
      BigInteger n1 = n.subtract(BigInteger.ONE);
      BigInteger k1 = k.subtract(BigInteger.ONE);
      return cCacheInner(n1, k.min(n1.subtract(k)), map).add(cCacheInner(n1, k1.min(n1.subtract(k1)), map)).remainder(mod);
    });
  }
}
