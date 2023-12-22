import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int sum = 0;
    int ans = 0;
    double mingap = Double.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }

    double ave = (1.0 * sum) / n;
    for (int i = 0; i < n; i++) {
      double gap = Math.abs(ave - a[i]);
      if (gap < mingap) {
        mingap = gap;
        ans = i;
      }
    }

    System.out.println(ans);

  }
}