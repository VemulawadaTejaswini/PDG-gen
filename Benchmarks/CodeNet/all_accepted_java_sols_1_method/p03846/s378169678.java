import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long MOD = 1000000007;
    int[] diff = new int[N];
    for(int i = 0; i < diff.length; i++) {
      diff[i] = sc.nextInt();
    }
    Arrays.sort(diff);
    int[] a = new int[N];
    if(N % 2 == 0) {
      for(int i = 0; 2 * i + 1 < N; i++) {
        a[2 * i] = 2 * i + 1;
        a[2 * i + 1] = 2 * i + 1;
      }
    } else {
      a[0] = 0;
      for(int i = 0; 2 * i + 2 < N; i++) {
        a[2 * i + 1] = 2 * i + 2; 
        a[2 * i + 2] = 2 * i + 2;
      }
    }
    long ans = 0;
    if(Arrays.equals(diff, a)) {
      int time = N / 2;
      ans = 1;
      for(int i = 0; i < time; i++) {
        ans = (ans * 2) % MOD;
      }
    }
    System.out.println(ans);
  }
}