import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long t1 = 0;
    long t2 = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      t1 = (t1 + a) % MOD;
      t2 = (t2 + ((a * a) % MOD)) % MOD;
    }
    t1 = (t1 * t1) % MOD;
    long ans = (t1 - t2 + MOD) % MOD;
    long c = (MOD + 1) / (long)2;
    ans = (ans * c) % MOD;
    System.out.println(ans);
  }
}