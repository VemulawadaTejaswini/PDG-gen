import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    long ans = 0;
    if((r - l) <= 2019) {
      long t = 2019;
      for(long i = l; i < r; i++) {
        for(long j = i + 1; j <= r; j++) {
          long i2 = (i % 2019);
          long j2 = (j % 2019);
          t = Math.min(t, (i2 * j2) % 2019);
        }
      }
      ans = t;
    }
    System.out.println(ans);
  }
}
