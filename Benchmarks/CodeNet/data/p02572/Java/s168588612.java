import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;
    long mod = 1000000007;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        sum = (sum + (a[i]% mod) * (a[j]% mod)) % mod;
      }
    }
    System.out.println(sum);
  }
}