import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  final static int INF = 1 << 28;
  final static long MOD = 1_000_000_007;
  final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }


  static class Dice implements Comparable<Dice> {
    int val;
    int[] tonari;
    int offset;

    Dice() {
    }

    static Dice valueOf(int top, int front) {
      if (!LUT.containsKey(top)) {
        return null;
      }
      Dice me = new Dice();
      Dice atom = LUT.get(top);
      me.val = atom.val;
      me.tonari = atom.tonari;
      for (int i = 0; i < 4; ++i) {
        if (me.tonari[i] == front) {
          me.offset = i;
        }
      }
      return me;
    }

    Pair<Integer, Dice> roll(Point now, Set<Point> done) {
      int idx = -1;
      int max = 0;
      for (int i = 0; i < 4; ++i) {
        int n = tonari[(i + offset) % 4];
        if (n < 4) {
          continue;
        }
        int[] d = ofs[i];
        Point next = new Point(now);
        next.x += d[0];
        next.y += d[1];
        next.z--;
        if (done.contains(next) || next.z < 0) {
          continue;
        }
        if (max < n) {
          max = n;
          idx = i;
        }
      }
      int front = 0;
      switch (idx) {
        case 1:
        case 3:
          front = tonari[offset];
          break;
        case 0:
          front = val;
          break;
        case 2:
          front = 7 - val;
          break;
      }
      return new Pair<>(idx, Dice.valueOf(7 - max, front));
    }

    final static Map<Integer, Dice> LUT;

    final static int[][] ofs = {
        {0, 1},
        {1, 0},
        {0, -1},
        {-1, 0}
    };

    static {
      HashMap<Integer, Dice> map = new HashMap<>();
      Dice one = new Dice();
      one.val = 1;
      one.tonari = new int[]{
          3, 5, 4, 2
      };
      map.put(1, one);
      Dice two = new Dice();
      two.val = 2;
      two.tonari = new int[]{
          3, 1, 4, 6
      };
      map.put(2, two);
      Dice three = new Dice();
      three.val = 3;
      three.tonari = new int[]{
          6, 5, 1, 2
      };
      map.put(3, three);
      Dice four = new Dice();
      four.val = 4;
      four.tonari = new int[]{
          1, 5, 6, 2
      };
      map.put(4, four);
      Dice five = new Dice();
      five.val = 5;
      five.tonari = new int[]{
          3, 6, 4, 1
      };
      map.put(5, five);
      Dice six = new Dice();
      six.val = 6;
      six.tonari = new int[]{
          4, 5, 3, 2
      };
      map.put(6, six);
      LUT = Collections.unmodifiableMap(map);
    }

    @Override
    public int compareTo(Dice dice) {
      return this.val - dice.val;
    }

    @Override
    public String toString() {
      return "{top = " + val + " front = " + tonari[offset] + "}";
    }
  }

  static class Point implements Comparable<Point> {
    int x, y, z;

    Point(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    Point(Point p) {
      x = p.x;
      y = p.y;
      z = p.z;
    }

    @Override
    public int compareTo(Point p) {
      if (x != p.x) {
        return x - p.x;
      }
      if (y != p.y) {
        return y - p.y;
      }
      return z - p.z;
    }

    @Override
    public String toString() {
      return "(" + x + ", " + y + ", " + z + ")";
    }
  }

  void run() {
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }
      TreeMap<Point, Dice> map = new TreeMap<>();
      Point atom = new Point(0, 0, INF);
      for (int i = 0; i < n; ++i) {
        int t = ni();
        int f = ni();
        Dice dice = Dice.valueOf(t, f);
        Point top = map.floorKey(atom);
        Point now = new Point(0, 0, 0);
        if (top != null) {
          now.z = top.z + 1;
        }
//        debug(i, now, map);
        for (; ; ) {
          Pair<Integer, Dice> ret = dice.roll(now, map.keySet());
          if (ret.s == null) {
            break;
          }
          int idx = ret.f;
          int[] d = Dice.ofs[idx];
          now.x += d[0];
          now.y += d[1];
          dice = ret.s;
          for (; ; ) {
            Point next = new Point(now);
            next.z--;
            if (next.z < 0) {
              break;
            }
            if (map.containsKey(next)) {
              break;
            }
            now = next;
//            debug("\t\t", now);
          }
//          debug("\t", idx, d, now, dice);
        }
//        debug(i, now);
        map.put(now, dice);
      }
      int[] cnt = new int[6];
      for (Point p : map.keySet()) {
        Point ue = new Point(p);
        ue.z++;
        if (map.containsKey(ue)) {
          continue;
        }
        Dice dice = map.get(p);
        cnt[dice.val - 1]++;
      }
      String ans = IntStream.of(cnt).mapToObj(Integer::toString).collect(Collectors.joining(" "));
      System.out.println(ans);
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

  /**
   * ??????????????????????????????
   *
   * @return a ??¨ b ????????§??¬?´???°
   */
  long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  /**
   * ????????????????????????????????????
   *
   * @return mx + ny = gcd(m, n)??¨???????????????(x, y)?????????
   */
  Pair<Long, Long> gcd_ex(long m, long n) {
    long[][] mat = _gcd_ex(m, n);
    return new Pair<>(mat[0][0], mat[0][1]);
  }

  long[][] _gcd_ex(long m, long n) {
    if (n == 0) {
      return new long[][]{{1, 0}, {0, 1}};
    }
    long k = m / n;
    long[][] K = new long[][]{{0, 1}, {1, -k}};
    long[][] r = _gcd_ex(n, m % n);
    long[][] dst = new long[2][2];
    for (int y = 0; y < 2; ++y)
      for (int x = 0; x < 2; ++x)
        for (int i = 0; i < 2; ++i)
          dst[y][x] += r[y][i] * K[i][x];
    return dst;
  }

  /**
   * ??°?????????2???????????¨??????????????????????£?
   *
   * @return a^r (mod 1,000,000,007)
   */
  long pow(long a, long r) {
    long sum = 1;
    while (r > 0) {
      if ((r & 1) == 1) {
        sum *= a;
        sum %= MOD;
      }
      a *= a;
      a %= MOD;
      r >>= 1;
    }
    return sum;
  }

  /**
   * ???????????????
   * O(n)
   *
   * @return {}_nC_r
   */
  long C(int n, int r) {
    long sum = 1;
    for (int i = n; 0 < i; --i) {
      sum *= i;
      sum %= MOD;
    }
    long s = 1;
    for (int i = r; 0 < i; --i) {
      s *= i;
      s %= MOD;
    }
    sum *= pow(s, MOD - 2);
    sum %= MOD;

    long t = 1;
    for (int i = n - r; 0 < i; --i) {
      t *= i;
      t %= MOD;
    }
    sum *= pow(t, MOD - 2);
    sum %= MOD;

    return sum;
  }

  /**
   * ??????????????¢?´¢
   *
   * @param left  ??????
   * @param right ??????
   * @param f     ??¢?´¢????????¢??°
   * @param comp  ??????????????¢??°?????¢?´¢????????¨?????????Comparator.comparingDouble(Double::doubleValue)
   *              ??????????????¢??°?????¢?´¢????????¨?????????Comparator.comparingDouble(Double::doubleValue).reversed()
   * @return ?\?????????§?¨?x
   */
  double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
    double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
    double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
    double d1 = f.apply(c1);
    double d2 = f.apply(c2);
    while (right - left > 1e-9) {
      if (comp.compare(d1, d2) > 0) {
        right = c2;
        c2 = c1;
        d2 = d1;
        c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
        d1 = f.apply(c1);
      } else {
        left = c1;
        c1 = c2;
        d1 = d2;
        c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
        d2 = f.apply(c2);
      }
    }
    return right;
  }

  /**
   * [a,b]???m:n???????????????????????????
   */
  double divideInternally(double a, double b, double m, double n) {
    return (n * a + m * b) / (m + n);
  }

  /**
   * http://alexbowe.com/popcount-permutations/
   * bit????????£???????????°????°?????????????????????????????????¨???????????????
   * ex)
   * <pre>
   * for (int i = 0; i < 25; ++i) {
   *   int bits = (1 << i) - 1;
   *   long m = C(25, num);
   *   for (j = 0; j < m; ++j) {
   *     ...(25???????????????i???bit????????£?????????)
   *     if (bits != 0)
   *       bits = next_perm(bits);
   *   }
   * }
   * </pre>
   *
   * @param v ?????¨???bit???
   * @return ?¬????bit???
   */
  int next_perm(int v) {
    int t = (v | (v - 1)) + 1;
    return t | ((((t & -t) / (v & -v)) >> 1) - 1);
  }

  /**
   * http://qiita.com/p_shiki37/items/65c18f88f4d24b2c528b
   */
  static class FastScanner {
    private final InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(InputStream in) {
      this.in = in;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }
  }

  class BIT<T> {
    int n;
    ArrayList<T> bit;
    BiFunction<T, T, T> bif;

    /**
     * 1-indexed ???Binary Indexed Tree????§??????????
     *
     * @param n   ??????
     * @param bif ?????¨???????????¢??°
     * @param sup ?????????
     */
    BIT(int n, BiFunction<T, T, T> bif, Supplier<T> sup) {
      this.n = n;
      bit = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; ++i) {
        bit.add(sup.get());
      }
      this.bif = bif;
    }

    /**
     * i??????????????????v??§??´??°??????
     *
     * @param i index
     * @param v ??°?????????
     */
    void set(int i, T v) {
      for (int x = i; x <= n; x += x & -x) {
        bit.set(x, bif.apply(bit.get(x), v));
      }
    }

    /**
     * ?????¨??????
     *
     * @param defaultValue ?????????
     * @param i            index
     * @return [1, i]?????§f????????¨????????????
     */
    T reduce(T defaultValue, int i) {
      T ret = defaultValue;
      for (int x = i; x > 0; x -= x & -x) {
        ret = bif.apply(ret, bit.get(x));
      }
      return ret;
    }
  }

  class SegmentTree<T> {
    int n;
    ArrayList<T> dat;
    BiFunction<T, T, T> bif;
    Supplier<T> sup;

    /**
     * 0-indexed ???Segment Tree????§??????????
     *
     * @param n_  ????±???????
     * @param bif ?????¨???????????¢??°
     * @param sup ?????????
     */
    SegmentTree(int n_, BiFunction<T, T, T> bif, Supplier<T> sup) {
      n = 1;
      while (n < n_) n *= 2;

      dat = new ArrayList<>(2 * n - 1);
      for (int i = 0; i < 2 * n - 1; ++i) {
        dat.add(sup.get());
      }
      this.bif = bif;
      this.sup = sup;
    }

    /**
     * k??????????????????v??§??´??°??????
     *
     * @param k index
     * @param v ??°?????????
     */
    void set(int k, T v) {
      k += n - 1;
      dat.set(k, v);
      while (k > 0) {
        k = (k - 1) / 2;
        dat.set(k, bif.apply(dat.get(k * 2 + 1), dat.get(k * 2 + 2)));
      }
    }

    /**
     * ?????¨??????
     *
     * @param l ?????????
     * @param r ?????????
     * @return [l, r)??§?????????bif????????¨?????????????????????
     */
    T reduce(int l, int r) {
      return _reduce(l, r, 0, 0, n);
    }

    T _reduce(int a, int b, int k, int l, int r) {
      if (r <= a || b <= l) return sup.get();
      if (a <= l && r <= b) return dat.get(k);
      T vl = _reduce(a, b, k * 2 + 1, l, (l + r) / 2);
      T vr = _reduce(a, b, k * 2 + 2, (l + r) / 2, r);
      return bif.apply(vl, vr);
    }
  }

  static class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
    F f;
    S s;

    Pair() {
    }

    Pair(F f, S s) {
      this.f = f;
      this.s = s;
    }

    Pair(Pair<F, S> p) {
      f = p.f;
      s = p.s;
    }

    @Override
    public int compareTo(Pair<F, S> p) {
      if (f.compareTo(p.f) != 0) {
        return f.compareTo(p.f);
      }
      return s.compareTo(p.s);
    }

    @Override
    public int hashCode() {
      return f.hashCode() ^ s.hashCode();
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || this.f == null || this.s == null) {
        return false;
      }
      if (this.getClass() != o.getClass()) {
        return false;
      }
      Pair p = (Pair) o;
      return this.f.equals(p.f) && this.s.equals(p.s);
    }

    @Override
    public String toString() {
      return "{" + f.toString() + ", " + s.toString() + "}";
    }
  }
}