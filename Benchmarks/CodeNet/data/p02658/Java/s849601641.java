import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    b();
  }

  public static void b() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = Integer.parseInt(sc.next());
      long[] a = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = Long.parseLong(sc.next());
      }
      Arrays.sort(a);
      if (a[0] == 0) {
        System.out.println(0);
        System.exit(0);
      }
      Long total = 1L;
      for (Long input : a) {
        total *= input;
        if (1000000000000000000L < total) {
          System.out.println(-1);
          System.exit(0);
        }
      }
      System.out.println(total);
    }
  }
}