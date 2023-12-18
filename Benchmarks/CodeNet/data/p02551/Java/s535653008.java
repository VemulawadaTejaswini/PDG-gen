import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int q = sc.nextInt();

    long result = (n - 2) * (n - 2);

    Map<Integer, TreeMap<Long, Long>> mapMap = new HashMap<>();
    Map<Integer, TreeSet<Long>> setMap = new HashMap<>();
    mapMap.put(1, new TreeMap<>());
    mapMap.put(2, new TreeMap<>());
    mapMap.get(1).put(n, n);
    mapMap.get(2).put(n, n);
    setMap.put(1, new TreeSet<>());
    setMap.put(2, new TreeSet<>());
    setMap.get(1).add(n);
    setMap.get(2).add(n);
    for (int i = 0; i < q; i++) {
      int b = sc.nextInt();
      int bb = b == 1 ? 2 : 1;
      long x = sc.nextLong();
      TreeMap<Long, Long> map = mapMap.get(b);
      TreeSet<Long> set = setMap.get(b);
      Long first = set.tailSet(x).first();
      Long value = map.get(first);
      result -= (value - 2);

      Long min = set.first();
      if (x < min) {
        TreeMap<Long, Long> mapb = mapMap.get(bb);
        TreeSet<Long> setb = setMap.get(bb);
        Long minb = setb.first();
        if (value == minb) {
          mapb.put(minb, x);
        } else {
          setb.add(value);
          mapb.put(value, x);
        }
      }
    }
    System.out.println(result);
  }
}
