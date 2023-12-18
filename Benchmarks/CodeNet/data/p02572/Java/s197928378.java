import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long sum = 0;
    long mod = 1000000007;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        sum = (sum + a[i] * a[j]) % mod;
      }
    }
    System.out.println(sum);
  }
}