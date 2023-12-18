package abc177.c;

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
    long A[] = new long[N];
    for(int i = 0; i < N; i++) {
      A[i] = scan.nextInt();
    }
    long S[] = new long[N];
    long sum = 0;
    for(int i = N-1 ; i > 0; i--) {
      sum += A[i];
      sum %= MOD;
      S[i-1] = sum;
    }

    long ans = 0;

    for(int i = 0; i < N-1; i++) {
      ans += A[i]*S[i]%MOD;
      ans %= MOD;
    }

    os.println(ans);
  }
}
