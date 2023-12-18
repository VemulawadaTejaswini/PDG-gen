import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for (int cnt = 0; cnt < n; cnt++) {
      a[cnt] = sc.nextInt();
    }
    long sum = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        // System.out.println(a[i] * a[j]);
        sum += a[i] * a[j];
      }
    }
    long ans = sum % ((int) Math.pow(10, 9) + 7);
    System.out.println(ans);
    sc.close();
  }
}