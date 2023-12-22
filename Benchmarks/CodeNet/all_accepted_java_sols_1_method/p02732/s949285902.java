import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 0;
    HashMap<Integer, Long> map = new HashMap<Integer, Long>();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      if(map.containsKey(a[i])) {
        ans += map.get(a[i]);
        map.put(a[i], map.get(a[i]) + 1);
      } else {
        map.put(a[i], (long)1);
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.println(ans - (map.get(a[i]) - 1));
    }
  }
}