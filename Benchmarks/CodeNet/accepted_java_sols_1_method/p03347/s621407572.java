import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int prevA = -10;
    long cost = 0;
    for (int i = 0; i < n; i++) {
      int a = s.nextInt();
      if (a <= prevA) {
        cost += a;
      } else if (a == prevA + 1) {
        cost++;
      } else if (a == 0) {
        // Do nothing.
      } else {
        System.out.println(-1);
        return;
      }
      prevA = a;
    }

    System.out.println(cost);
  }
}
