import java.util.Scanner;

public class Main {
  static public void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t;
    while ((t = s.nextInt()) != 0) {
      int[] sum = new int[2];
      for (int i = 0; i < t; i++) {
        int m = s.nextInt();
        int n = s.nextInt();
        if (m > n) {
          sum[0] += m + n;
        }
        if (m < n) {
          sum[1] += m + n;
        }
        if (m == n) {
          sum[0] += m;
          sum[1] += n;
        }
      }
      System.out.printf("%d %d\n", sum[0], sum[1]);
    }
  }
}