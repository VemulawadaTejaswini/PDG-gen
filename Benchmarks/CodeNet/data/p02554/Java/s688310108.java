import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long r1 = 1;
    long r2 = 1;
    long r3 = 1;
    for(int i = 0; i < n; i++) {
      r1 = (r1 * 10) % MOD;
    }
    for(int i = 0; i < n; i++) {
      r2 = (r2 * 9) % MOD;
    }
    for(int i = 0; i < n; i++) {
      r3 = (r3 * 8) % MOD;
    }
    long r4 = (r2 + r2 + MOD - r3) % MOD;
    long ans = (r1 + MOD - r4) % MOD;
    System.out.println(ans);
  }
}
