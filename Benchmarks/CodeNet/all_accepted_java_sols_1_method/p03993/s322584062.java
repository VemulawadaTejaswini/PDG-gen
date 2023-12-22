import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      a[i] = sc.nextInt();
    }
    TreeMap<String, Integer> map = new TreeMap<>();
    for (int k = 1; k <= N; k++) {
      int i = Math.min(k, a[k]);
      int j = Math.max(k, a[k]);
      String key = i + ":" + j;
      if (map.containsKey(key)) {
        map.put(key, map.get(key) + 1);
      } else {
        map.put(key, 1);
      }
    }
    int ans = 0;
    for (Integer value : map.values()) {
      ans += (value / 2);
    }
    System.out.println(ans);
  }
}