import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();
    long ans = 0;
    if(x >= 0) {
      long t = (x + d - 1) / d;
      if(t <= k) {
        if((t % 2) == (k % 2)) {
          ans = Math.abs(x - (t * d));
        } else {
          ans = x - (t * d) + d;
        }
      } else {
        ans = x - (k * d);
      }
    } else {
      long t = (d - x - 1) / d;
      if(t <= k) {
        if((t % 2) == (k % 2)) {
          ans = Math.abs(x + (t * d));
        } else {
          ans = Math.abs(x + (t * d) - d);
        }
      } else {
        ans = Math.abs(x + (k * d));
      }
    }
    System.out.println(ans);
  }
}