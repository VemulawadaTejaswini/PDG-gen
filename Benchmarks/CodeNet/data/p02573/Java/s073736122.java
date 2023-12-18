import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    if (m == 0) {
      System.out.println(1);
      return;
    }
    Map<Integer, Set<Integer>> friendMap = new HashMap<>();
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a > b) {
        int tmp = a;
        a = b;
        b = tmp;
      }
      Set<Integer> integerSet = friendMap.computeIfAbsent(a, k -> new HashSet<>());
      integerSet.add(b);
    }
    Map<Integer, List<Integer>> friendMap2 = new HashMap<>();
    for (Map.Entry<Integer, Set<Integer>> entry : friendMap.entrySet()) {
      friendMap2.put(entry.getKey(), entry.getValue().stream().sorted().collect(Collectors.toList()));
    }

    List<Set<Integer>> friendSetList = new ArrayList<>();
    Map<Integer, Set<Integer>> friendSetMap = new HashMap<>();
    for (Integer key : friendMap2.keySet().stream().sorted().collect(Collectors.toList())) {
      if (!friendSetMap.containsKey(key)) {
        friendSetList.add(analyze(key, friendMap2, friendSetMap));
      }
    }
    System.out.println(friendSetList.stream().map(Set::size).max(Comparator.naturalOrder()).get());
  }

  static Set<Integer> analyze(Integer key, Map<Integer, List<Integer>> friendMap, Map<Integer, Set<Integer>> friendSetMap) {
    List<Integer> integers = friendMap.get(key);
    if (integers == null) {
      return null;
    }
    Set<Integer> friendSet = friendSetMap.computeIfAbsent(key, k -> {
      Set<Integer> s = new HashSet<>();
      s.add(key);
      return s;
    });
    for (Integer i : integers) {
      Set<Integer> iFriendSet = friendSetMap.get(i);
      if (iFriendSet == null) {
        friendSetMap.put(i, friendSet);
        friendSet.add(i);
        analyze(i, friendMap, friendSetMap);
      }
    }
    return friendSet;
  }
}
