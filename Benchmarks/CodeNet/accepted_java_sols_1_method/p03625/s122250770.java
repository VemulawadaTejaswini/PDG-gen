import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    TreeMap<Long, Integer> map = new TreeMap<>();
    for (int i = 0; i < N; i++) {
      long tmp = sc.nextLong();
      if (map.containsKey(tmp)) {
        map.put(tmp, map.get(tmp) + 1);
      } else {
        map.put(tmp, 1);
      }
    }
    ArrayList<Long> r = new ArrayList<>();
    ArrayList<Long> s = new ArrayList<>();
    Set<Long> keySet = map.keySet();
    for (Long key : keySet) {
      if (map.get(key) >= 2) {
        r.add(key);
      }
      if (map.get(key) >= 4) {
        s.add(key);
      }
    }
    long max1 = 0;
    if (r.size() >= 2) {
      max1 = r.get(r.size() - 1) * r.get(r.size() - 2);
    }
    long max2 = 0;
    if (s.size() >= 1) {
      max2 = s.get(s.size() - 1) * s.get(s.size() - 1);
    }
    System.out.println(Long.max(max1, max2));
  }
}