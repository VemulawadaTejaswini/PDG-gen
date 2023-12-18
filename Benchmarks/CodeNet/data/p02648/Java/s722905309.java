import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  static final BigInteger TWO = new BigInteger("2");
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(sc.next());
    Map<BigInteger, Item> map = new HashMap<>();
    for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
      int v = sc.nextInt();
      int w = sc.nextInt();
      map.put(i, new Item(v, w));
    }
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      BigInteger v = new BigInteger(sc.next());
      int l = sc.nextInt();
      System.out.println(culc(map, v, l).one());
    }
  }

  static Map<BigInteger, Map<Integer, Tuple<Integer, Integer>>> acc = new HashMap<>();

  static Tuple<Integer, Integer> culc(Map<BigInteger, Item> map, BigInteger v, int l) {
    Map<Integer, Tuple<Integer, Integer>> integerTupleMap = acc.computeIfAbsent(v, k -> new HashMap<>());
    return integerTupleMap.computeIfAbsent(l, k -> {
          Item item = map.get(v);
          if (v.compareTo(BigInteger.ONE) == 0) {
            return item.w() <= l ? new Tuple<>(item.v(), item.w()) : new Tuple<>(0, 0);
          }
          BigInteger parent = v.divide(TWO);
          Tuple<Integer, Integer> tmp = culc(map, parent, l);
          if (item.w() <= l) {
            Tuple<Integer, Integer> t = culc(map, parent, l - item.w());
            t = new Tuple<>(t.one() + item.v(), t.two() + item.w());
            if (t.one() > tmp.one()) {
              tmp = t;
            }
          }
          for (int i = tmp.two(), len = l - 1; i < len; i++) {
            integerTupleMap.put(i, tmp);
          }
          return tmp;
        });
  }
}

class Item {
  int _v;
  int _w;
  Item(int v, int w) {
    _v = v;
    _w = w;
  }
  public int v() {
    return _v;
  }
  public int w() {
    return _w;
  }
}
class Tuple<V, W> {
  V _v;
  W _w;
  Tuple(V v, W w) {
    _v = v;
    _w = w;
  }
  public V one() {
    return _v;
  }
  public W two() {
    return _w;
  }
}
