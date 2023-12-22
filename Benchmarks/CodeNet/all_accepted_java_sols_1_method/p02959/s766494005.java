import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    long[] a = new long[n + 1];
    long[] b = new long[n];

    long res = 0;

    for (int i = 0; i <= n; i++)
      a[i] = sc.nextLong();
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextLong();
      if (b[i] > a[i]) {
        res += a[i];
        long carry = Math.min(a[i + 1], b[i] - a[i]);
        a[i + 1] -= carry;
        res += carry;
      } else
        res += b[i];
    }

    System.out.println(res);
  }
}