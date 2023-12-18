import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    long[] a = new long[n + 1];
    long[] b = new long[n];

    for (int i = 0; i <= n; i++)
      a[i] = sc.nextLong();

    b[0] = sc.nextLong();
    long res = Math.min(a[0], b[0]);
    long carry = Math.min(a[1], b[0] - res);
    res += carry;

    for (int i = 1; i < n; i++) {
      b[i] = sc.nextLong();
      long fii = Math.min(a[i] - carry, b[i]);
      carry = Math.min(a[i + 1], b[i] - fii);
      res += fii + carry;
    }

    System.out.println(res);
  }
}