import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    ArrayList<Integer> listA = new ArrayList<>();
    ArrayList<Integer> listB = new ArrayList<>();
    ArrayList<Integer> listC = new ArrayList<>();
    Set<Integer> set = new HashSet<Integer>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      listA.add(sc.nextInt());
    }
    int q = sc.nextInt();
    for (int i = 0; i < q; i ++) {
      listB.add(sc.nextInt());
      listC.add(sc.nextInt());
    }
    for (int e: listB) {
      set.add(e);
    }
    for (int e: set) {
      map.put(e,0);
    }
    for (int e: listA) {
      if (map.containsKey(e)) {
        map.put(e, map.get(e)+1);
      }
      sum += e;
    }
    for (int i = 0; i < q; i++) {
      int prevKey = listB.get(i);
      int nextKey = listC.get(i);
      sum += (nextKey - prevKey)*map.get(prevKey);
      if (map.containsKey(nextKey)) {
        map.put(nextKey, map.get(nextKey) + map.get(prevKey));
      }
      map.put(prevKey, 0);
      System.out.println(sum);
    }
    sc.close();
  }
}