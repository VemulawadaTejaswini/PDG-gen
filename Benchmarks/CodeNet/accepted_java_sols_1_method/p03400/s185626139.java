import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    long x = sc.nextLong();
    long ans = x;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      for(long j = 1; j <= d; j += a) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}