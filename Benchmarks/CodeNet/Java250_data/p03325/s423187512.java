import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    int ans = 0;
    for(int i = 0; i < n; i++) {
      int p = 0;
      for(int j = 0; j < 50; j++) {
        if(a[i] % 2 != 0) {
          p = j;
          break;
        }
        a[i] /= 2;
      }
      ans += p;
    }
    System.out.println(ans);
  }
}