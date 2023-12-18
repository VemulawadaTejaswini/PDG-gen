
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    solve(System.in, System.out);
  }

  static final int MOD = (int)Math.pow(10,9)+7;

  static void solve(InputStream is, PrintStream os) {
    // Your code here!
    Scanner scan = new Scanner(is);
    int N = scan.nextInt();
    long all = 1;
    for(int i = 0; i < N; i++) {
      all *= 10;
      all %= MOD;
    }

    long not0 = 1;
    for(int i = 0; i < N; i++) {
      not0 *= 9;
      not0 %= MOD;
    }

    long not9 = 1;
    for(int i = 0; i < N; i++) {
      not9 *= 9;
      not9 %= MOD;
    }

    long not09 = 1;
    for(int i = 0; i < N; i++) {
      not09 *= 8;
      not09 %= MOD;
    }

    long ans = all-not0;
    ans %= MOD;
    if(ans < 0)
      ans += MOD;
    ans -= not9;
    ans %= MOD;
    if(ans < 0)
      ans += MOD;
    ans += not09;
    ans %= MOD;

    os.println(ans);
  }
}
