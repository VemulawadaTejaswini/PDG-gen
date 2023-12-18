import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    List<Long> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextLong());
    }
    Map<Long, List<Long>> collect = a.stream().collect(Collectors.groupingBy(Function.identity()));
    List<Long> list = collect.keySet().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    SortedSet<Long> less = new TreeSet<>();
    long count = 0;
    for (int i = 0, len = list.size(); i < len; i++) {
      Long aLong = list.get(i);
      if (collect.get(aLong).size() > 1) {
        less.add(aLong);
        continue;
      }
      boolean boo = true;
      long jlen = (long) Math.floor(Math.sqrt(aLong));
      SortedSet<Long> lll = less.tailSet(jlen);
      SortedSet<Long> ll1 = less.headSet(jlen);
      for (long j = 1; j <= jlen; j++) {
        if (aLong % j == 0) {
          if (ll1.contains(j) || lll.contains(aLong / j)) {
            boo = false;
            break;
          }
        }
      }
      if (boo) {
        count++;
      }
      less.add(aLong);
    }

    System.out.println(count);
  }
}
