import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      boolean[] seen = new boolean[1000000];
      int n = sc.nextInt();
      int i = 1;
      seen[n] = true;

      while(true) {
        if (n % 2 == 0) {
          n /= 2;
        } else {
          n = 3 * n + 1;
        }
        i++;
        if (seen[n]) {
          System.out.println(i);
          return;
        }
        seen[n] = true;
      }
    } finally {
      sc.close();
    }
  }
}
