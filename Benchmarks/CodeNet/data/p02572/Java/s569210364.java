import java.util.*;
public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    long MOD = 1_000_000_007;
    
    int n = input.nextInt();
    long sqSum = 0;
    long sum = 0;
    for (int i = 0; i < n; i++) {
      long x = input.nextInt();
      sum += x;
      sum %= MOD;
	  sqSum += ((x * x) % MOD);
      sqSum %= MOD;
    }
    
    sum *= sum;
    sum %= MOD;
    
    System.out.println(((sum - sqSum + MOD) * 500000004) % MOD);
  }
}
