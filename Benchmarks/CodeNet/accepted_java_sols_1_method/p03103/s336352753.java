import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    long[] a = new long[(int)n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      long b = sc.nextLong();
      if(map.containsKey(a[i])) {
        map.put(a[i], map.get(a[i]) + b);
      } else {
        map.put(a[i], b);
      }
    }
    Arrays.sort(a);
    long ans = 0;
    for(int i = 0; i < n; i++) {
      long kosuu = map.get(a[i]);
      if(m > kosuu) {
        ans += (a[i] * kosuu);
        m -= kosuu;
        map.put(a[i], (long)0);
      } else {
        ans += (a[i] * m);
        break;
      }
    }
    System.out.println(ans);
  }
}