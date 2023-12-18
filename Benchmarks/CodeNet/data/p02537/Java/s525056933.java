import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    map.put(0, 1);
    lastSet.add(0);
    for (int i = 1; i < n; i++) {
      int v = list.get(i);
      int max = 0;
      int maxI = i;
      for (int j : lastSet) {
        int newV = map.get(j);
        boolean use = Math.abs(v - list.get(j)) <= k;
        if (use) {
          newV++;
        }
        if (max < newV) {
          max = newV;
          if (use) {
            maxI = j;
          }
        }
      }
      lastSet.remove(maxI);
      lastSet.add(i);
      map.put(i, max);
    }
    System.out.println(map.values().stream().max(Comparator.naturalOrder()).get());
  }

  static final Map<Integer, Integer> map = new HashMap<>();
  static final Set<Integer> lastSet = new HashSet<>();
//
//  static int culc(List<Integer> list, int i, int limit) {
//    return map.computeIfAbsent(i, k -> {
//      if (i == 0) {
//        lastSet.add(i);
//        return 1;
//      }
//      int v = list.get(i);
//      int max = 0;
//      int maxI = i;
//      for (int j : lastSet) {
//        int newV = culc(list, j, limit);
//        if (Math.abs(v - list.get(j)) <= limit) {
//          newV++;
//        }
//        if (max < newV) {
//          max = newV;
//          maxI = j;
//        }
//      }
//      lastSet.remove(maxI);
//      lastSet.add(i);
//      return max;
//    });
//  }
}
