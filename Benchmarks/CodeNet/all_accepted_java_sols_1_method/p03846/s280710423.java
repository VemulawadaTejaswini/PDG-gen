
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[sc.nextInt()]++;
    }
    int p = 0;
    if((n % 2) == 0) {
      for(int i = 1; i < n; i += 2) {
        if(a[i] != 2) p++;
      }
    } else {
      if(a[0] != 1) p++;
      for(int i = 2; i < n; i += 2) {
        if(a[i] != 2) p++;
      }
    }
    long ans = 0;
    if(p == 0) {
      ans = 1;
      for(int i = 0; i < (n / 2); i++) {
        ans = (ans * 2) % MOD;
      }
    }
    System.out.println(ans);
  }
}