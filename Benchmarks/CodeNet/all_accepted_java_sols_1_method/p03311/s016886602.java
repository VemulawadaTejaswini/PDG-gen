import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong() - (long)(i + 1);
    }
    Arrays.sort(a);
    long m = a[n / 2];
    long ans = 0;
    for(int i = 0; i < n; i++) {
      ans += Math.abs(a[i] - m);
    }
    System.out.println(ans);
  }
}