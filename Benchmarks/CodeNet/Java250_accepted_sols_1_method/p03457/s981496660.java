import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    boolean isFalse = false;
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      int t = scanner.nextInt();
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (t < (x + y)) {
        isFalse = true;
        break;
      }

      if ((t % 2) == 0) {
        if ((x + y) % 2 != 0) {
          isFalse = true;
          break;
        }
      }

      if ((t % 2) != 0) {
        if ((x + y) % 2 == 0) {
          isFalse = true;
          break;
        }
      }
    }

    if (!isFalse) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
