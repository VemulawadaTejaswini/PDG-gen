import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int m = sc.nextInt();
    Map<Integer, Integer> hMap = new HashMap<>();
    Map<Integer, Integer> cMap = new HashMap<>();
    Map<Integer, Set<Integer>> g = new HashMap<>();
    for (int i = 0; i < m; i++) {
      int h = sc.nextInt();
      int w = sc.nextInt();
      Integer integer1 = hMap.computeIfAbsent(h, key -> 0);
      Integer integer2 = cMap.computeIfAbsent(w, key -> 0);
      hMap.put(h, integer1 + 1);
      cMap.put(w, integer2 + 1);
      g.computeIfAbsent(h, key -> new HashSet<>()).add(w);
    }
    Map<Integer, List<Integer>> hMap2 = new HashMap<>();
    Map<Integer, List<Integer>> cMap2 = new HashMap<>();
    int hMax = 0;
    for (Map.Entry<Integer, Integer> integerIntegerEntry : hMap.entrySet()) {
      int integer = integerIntegerEntry.getKey();
      int integer2 = integerIntegerEntry.getValue();
      if (integer2 > hMax) {
        hMax = integer2;
      }
      hMap2.computeIfAbsent(integer2, key -> new ArrayList<>()).add(integer);
    }
    int cMax = 0;
    for (Map.Entry<Integer, Integer> integerIntegerEntry : cMap.entrySet()) {
      int integer = integerIntegerEntry.getKey();
      int integer2 = integerIntegerEntry.getValue();
      if (integer2 > cMax) {
        cMax = integer2;
      }
      cMap2.computeIfAbsent(integer2, key -> new ArrayList<>()).add(integer);
    }
    List<Integer> hList = hMap2.get(hMax);
    List<Integer> cList = cMap2.get(cMax);
    for (int h: hList) {
      Set<Integer> cSet = g.get(h);
      for (int c: cList) {
        if (!cSet.contains(c)) {
          System.out.println(hMax + cMax);
          return;
        }
      }
    }
    System.out.println(hMax + cMax - 1);
  }
}
