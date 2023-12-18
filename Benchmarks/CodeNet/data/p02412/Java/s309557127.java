import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    while (true) {

      int n = scan.nextInt();
      int x = scan.nextInt();
      int cnt = 0;

      if ((n == 0) && (x == 0)) {
        break;
      }

      for (int i = 1; i <= n - 2; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
          for (int k = j + 1; k <= n; k++) {
            if (i + j + k == x) {
              cnt++;
            } else if (i + j + k > x) {
              break;
            }
          }
        }
      }

      System.out.println(cnt);

    }

  }

}
