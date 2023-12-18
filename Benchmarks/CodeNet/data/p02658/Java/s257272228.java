import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long ans = 1;
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      long next = sc.nextLong();

      if (ans != -1) {
        if (1000000000000000000L / next < ans) {
          ans = -1;
        } else {
          ans *= next;
        }
      } else {
        if (next == 0) {
          ans = 0;
          break;
        }
      }
    }

    System.out.println(ans);
  }
}
