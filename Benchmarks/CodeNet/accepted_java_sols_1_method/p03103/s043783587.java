import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    // long[] a = new long[n];
    // long[] b = new long[n];

    // for (long i = 0; i < n; i++) {
    //   a[i] = sc.nextLong();
    //   b[i] = sc.nextLong();
    // }

    Map<Long,Long> map = new TreeMap<>();

    for (long i = 0; i < n; i++) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      if (map.containsKey(a)) {
        map.put(a,map.get(a)+b);
      } else {
        map.put(a,b);
      }
    }

    long count = 0;
    long sum = 0;

    for (long i : map.keySet()) {
      if (count > m) {
        break;
      }

      if (count+map.get(i) <= m) {
        sum += i*map.get(i);
      } else {
        sum += (m-count)*i;
      }

      count += map.get(i);

    }

    System.out.println(sum);

  }
}
