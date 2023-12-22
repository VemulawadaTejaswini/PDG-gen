
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long v1 = 0;
    long v2 = Long.MAX_VALUE;
    long w1 = (-1) * Long.MAX_VALUE;
    long w2 = Long.MAX_VALUE;
    for(int i = 0; i < n; i++) {
      long x = sc.nextLong();
      long y = sc.nextLong();
      long v = x + y;
      long w = x - y;
      v1 = Math.max(v1, v);
      v2 = Math.min(v2, v);
      w1 = Math.max(w1, w);
      w2 = Math.min(w2, w);
    }
    long ans = Math.max(v1 - v2, w1 - w2);
    System.out.println(ans);
  }
}