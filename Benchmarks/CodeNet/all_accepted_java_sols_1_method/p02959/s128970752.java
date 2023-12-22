import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n + 1];
    int[] b = new int[n];
    long ans = 0;

    for (int i = 0; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (a[i] > b[i]) {
        a[i] -= b[i];
        ans += b[i];
        b[i] = 0;
      } else {
        b[i] -= a[i];
        ans += a[i];
        a[i] = 0;
        if (a[i + 1] > b[i]) {
          a[i + 1] -= b[i];
          ans += b[i];
          b[i] = 0;
        } else {
          b[i] -= a[i + 1];
          ans += a[i + 1];
          a[i + 1] = 0;
        }
      }
    }

    System.out.println(ans);

  }
}