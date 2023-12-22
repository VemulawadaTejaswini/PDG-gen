import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    final long mod = 1000000007;
    long Ai[] = new long[n];
    long sum = 0, ans = 0;
    for(int i = 0; i < n; i++){
      Ai[i] = sc.nextInt();
      sum += Ai[i];
      sum %= mod;
    }

    for(int i = 0; i < n; i++){
      sum -= Ai[i];
      if(sum < 0){
        sum += mod;
      }
      ans += Ai[i] * sum;
      ans = ans % mod;
    }
    System.out.println(ans);
  }
}
