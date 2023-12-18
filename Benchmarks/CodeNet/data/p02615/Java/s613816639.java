import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    long ans = a[n - 1];
    for(int i = 4; i < n + 2; i++) {
      int d = n - (i / 2);
      ans += a[d];
    }
    System.out.println(ans);
  }
}