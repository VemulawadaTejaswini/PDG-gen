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
    a.sort(Comparator.naturalOrder());
    Map<Long, Integer> collect = new HashMap<>();
    List<Long> list = new ArrayList<>();
    for (int i = 0, len = a.size(); i < len; i++) {
      Long aLong = a.get(i);
      Integer integer = collect.get(aLong);
      if (integer == null) {
        integer = 1;
        collect.put(aLong, integer);
        list.add(aLong);
      } else {
        collect.put(aLong, integer + 1);
      }
    }
    Set<Long> less = new TreeSet<>();
    long count = 0;
    for (int i = 0, len = list.size(); i < len; i++) {
      Long aLong = list.get(i);
      if (collect.get(aLong) > 2) {
        continue;
      }
      boolean boo = true;
      for (long j = 1, jlen = (long) Math.floor(Math.sqrt(aLong)); j <= jlen; j++) {
        if (aLong % j == 0) {
          if (less.contains(j) || less.contains(aLong / j)) {
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
