import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static final long MOD = 998244353;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    long ans = 0;
    for(int i = 0; i < n; i++){
      ans += myPow(10l, i);
      ans %= MOD;
    }
    int[] aa = new int[n];
    Arrays.fill(aa, 1);
    for(int i = 0; i < q; i++){
      int l = sc.nextInt() - 1;
      int r = sc.nextInt() - 1;
      int d = sc.nextInt();
      for(int j = l; j <= r; j++){
        long diff = myPow(10l, n - 1 - j) * Math.abs(aa[n - 1 - j] - d);
        diff %= MOD;
        if(aa[n - 1 - j] > d){
          ans = ans + MOD - diff;
          ans %= MOD;
        } else if(aa[n - 1 - j] < d){
          ans = ans + MOD + diff;
          ans %= MOD;
        }
        aa[n - 1 - j] = d;
      }
      System.out.println(ans);
    }
    sc.close();
  }

  static long myPow(long x, long n) {
    long answer = 1l;
    while (n > 0) {
      if((n & 1) == 1){
        answer = answer * x % MOD;
      }
      x = x * x % MOD;
      n >>= 1;
    }
    return answer;
  }
}