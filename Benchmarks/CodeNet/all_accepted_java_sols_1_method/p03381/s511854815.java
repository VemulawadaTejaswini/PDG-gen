import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int[] a = new int[n];
    int[] sorted = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
      sorted[i] = a[i];
    }
    Arrays.sort(sorted);
    for (int i = 0; i < n; i++) {
      if (a[i] < sorted[n/2]) {
        System.out.println(sorted[n/2]);
      } else {
        System.out.println(sorted[n/2 - 1]);
      }
    }
  }
}
