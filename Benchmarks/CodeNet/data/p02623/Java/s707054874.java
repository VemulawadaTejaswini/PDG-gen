import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long ans = 0;
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n + 1];
    long[] b = new long[m + 1];
    a[0] = 0;
    for (int cnt = 1; cnt <= n; cnt++) {
      a[cnt] = a[cnt - 1];
      a[cnt] += sc.nextInt();
    }
    b[0] = 0;
    for (int cnt = 1; cnt <= m; cnt++) {
      b[cnt] = b[cnt - 1];
      b[cnt] += sc.nextInt();
    }

    for (int i = 0; i <= n; i++) {
      int tmpAns = 0;
      for (int j = 0; j <= m; j++) {
        if (a[i] + b[j] <= k) {
          tmpAns = i + j;
        }
      }
      ans = Math.max(ans, tmpAns);
    }
    System.out.println(ans);
    sc.close();
  }
}
