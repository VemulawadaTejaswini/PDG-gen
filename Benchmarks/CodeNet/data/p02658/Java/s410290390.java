import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long ans = 1, n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      long next = sc.nextLong();

      if (1000000000000000000L / next < ans) {
        ans = -1;
        break;
      } else {
        ans *= next;
      }
    }

    System.out.println(ans);
  }
}
