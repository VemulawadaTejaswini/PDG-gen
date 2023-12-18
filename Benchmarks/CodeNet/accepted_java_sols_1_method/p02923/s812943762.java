import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      if (n == 1) {
        System.out.println(0);
        return;
      }

      int[] h = new int[n];
      for (int i = 0; i < n; i++) h[i] = scanner.nextInt();

      int cnt = 0;
      int ans = 0;
      for (int i = 0; i < n - 1; i++) {
        if (h[i] >= h[i+1]) {
          cnt++;
          if (ans < cnt) ans = cnt;
        } else {
          cnt = 0;
        }
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}