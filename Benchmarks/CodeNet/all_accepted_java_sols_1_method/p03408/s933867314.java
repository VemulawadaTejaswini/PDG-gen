import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      if (map.get(s) != null) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }
    int M = sc.nextInt();
    for (int i = 0; i < M; i++) {
      String s = sc.next();
      if (map.get(s) != null) {
        map.put(s, map.get(s) - 1);
      }
    }
    int max = 0;
    Object[] keys = map.keySet().toArray();
    for (Object key : keys) {
      int tmp = map.get(key);
      if (max < tmp) {
        max = tmp;
      }
    }
    System.out.println(max);
  }
}