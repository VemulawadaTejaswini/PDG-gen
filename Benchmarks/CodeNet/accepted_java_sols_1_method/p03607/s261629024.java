import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int tmp = sc.nextInt();
      if (map.containsKey(tmp)) {
        map.put(tmp, map.get(tmp) + 1);
      } else {
        map.put(tmp, 1);
      }
    }
    int count = 0;
    Set keySet = map.keySet();
    for (Object key : keySet) {
      if (map.get(key) % 2 == 1) {
        count++;
      }
    }
    System.out.println(count);
  }
}