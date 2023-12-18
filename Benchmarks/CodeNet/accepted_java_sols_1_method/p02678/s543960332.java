import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    Map<Long, Set<Long>> map = new TreeMap<>();
    Set<Long> all = new TreeSet<>();
    List<String> result = new ArrayList<>();
    for (long i = 0; i < n; i++) {
      map.put(i, new HashSet<>());
      all.add(i);
      if (i > 0) {
        result.add("0");
      }
    }
    for (long i = 0; i < m; i++) {
      long a = sc.nextLong() - 1;
      long b = sc.nextLong() - 1;
      map.get(a).add(b);
      map.get(b).add(a);
    }
    Set<Long> t = new TreeSet<>();
    t.add(0l);
    all.remove(0l);
    while (all.size() > 0) {
      Set<Long> newT = new TreeSet<>();
      t.forEach(a -> {
        Set<Long> s = map.get(a);
        s.forEach(b -> {
          if (all.contains(b)) {
            newT.add(b);
            all.remove(b);
            result.set((int) (b - 1), Long.toString(a + 1));
          }
        });
      });
      t = newT;
    }
    System.out.println("Yes\n" + result.stream().collect(Collectors.joining("\n")));
  }
}
