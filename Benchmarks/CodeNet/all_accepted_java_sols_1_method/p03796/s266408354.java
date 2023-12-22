import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long MOD = (long)Math.pow(10, 9) + 7;
    long ans = 1;
    for(long i = n; i >= 1; i--) {
      ans = (ans * i) % MOD;
    }
    System.out.println(ans);
  }
}