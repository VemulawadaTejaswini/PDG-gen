import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long l = sc.nextInt();
    long r = sc.nextInt();
    
    long ans = 2019;
    LABEL:for (long i = l; i < r; i++) {
      for (long j = l + 1; j <= r; j++) {
        ans = Math.min(ans, (i * j) % 2019);
        if (ans == 0) break LABEL;
      }
    }
    
    System.out.println(ans);
  }
}
