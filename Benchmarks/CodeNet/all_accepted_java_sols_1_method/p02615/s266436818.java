import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Arrays.sort(a); // 昇順
    long sum = a[n - 1];

    if (n == 2) {
      System.out.println(sum);
    } else {
      if (n % 2 == 1) {
        int num = n / 2;
        sum += a[n - num - 1];
        for (int i = n - num; i < n - 1; i++) {
          sum += 2 * a[i];
        }
        System.out.println(sum);
      } else {
        int num = n / 2;
        for (int i = n - num; i < n - 1; i++) {
          sum += 2 * a[i];
        }
        System.out.println(sum);
      }
    }

  }
}