import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Long, Long> map = new HashMap<>();
    long result = 0L;
    for (int i = 0; i < n; i++) {
      long a = sc.nextLong();
      result += a;
      Long aLong = map.get(a);
      if (aLong == null) {
        aLong = 0L;
      }
      map.put(a, aLong + 1);
    }
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      long b = sc.nextLong();
      long c = sc.nextLong();
      Long aCount = map.get(b);
      if (aCount != null) {
        Long cCount = map.get(c);
        if (cCount == null) {
          cCount = 0L;
        }
        map.put(c, cCount + aCount);
        map.put(b, 0L);
        
        result += (c - b) * aCount;
      }
      System.out.println(result);
    }
  }
}
