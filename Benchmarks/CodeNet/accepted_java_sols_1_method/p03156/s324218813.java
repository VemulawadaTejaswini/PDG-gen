import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int[] cnt = new int[3];

      for (int i = 0; i < n; i++) {
        int p = scanner.nextInt();
        if (p <= a) {
          cnt[0]++;
        } else if (a < p && p <= b) {
          cnt[1]++;
        } else {
          cnt[2]++;
        }
      }

      int ans = cnt[0];
      for (int i = 1; i < 3; i++) {
        if (ans > cnt[i]) ans = cnt[i];
      }
      System.out.print(ans);
    } finally {
      scanner.close();
    }
  }
}
