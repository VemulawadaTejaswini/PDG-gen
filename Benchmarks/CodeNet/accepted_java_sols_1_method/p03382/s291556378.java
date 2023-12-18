import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    Arrays.sort(a);
    int minDiff = a[0];
    if (a[n-1] % 2 == 0) {
      for (int i = 0; i < n-1; i++) {
        if (Math.abs(a[n-1] / 2 - minDiff) > Math.abs(a[n-1] / 2 - a[i])) {
          minDiff = a[i];
        }
      }
    } else {
      for (int i = 0; i < n-1; i++) {
        if (Math.abs(a[n-1] - 2*minDiff) > Math.abs(a[n-1] - 2*a[i])) {
          minDiff = a[i];
        }
      }
    }
    System.out.printf("%d %d\n", a[n-1], minDiff);
  }
}
