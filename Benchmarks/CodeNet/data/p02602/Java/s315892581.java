import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n];
    long tmp = 1;
    int mod = (int) Math.pow(10, 9) + 7;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong() % mod;
      if (i < k) {
        tmp = (tmp * a[i]) % mod;
      } else {
        if (tmp < (((tmp / a[i - k]) * a[i]) % mod)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
        tmp = ((tmp / a[i - k]) * a[i]) % mod;
      }
    }

  }
}