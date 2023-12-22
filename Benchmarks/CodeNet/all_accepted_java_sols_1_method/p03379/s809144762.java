import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] rx = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      rx[i] = x[i];
    }
    Arrays.sort(rx);
    int h = rx[n / 2];
    int l = rx[(n - 1) / 2];
    int r = rx[(n - 1) / 2 + 1];
    for (int i = 0; i < n; i++) {
      if (x[i] >= h) {
        System.out.println(l);
      } else {
        System.out.println(r);
      }
    }
  }
}
