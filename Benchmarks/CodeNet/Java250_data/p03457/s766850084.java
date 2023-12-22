import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Boolean result = false;
    int t = 0;
    int x = 0;
    int y = 0;

    for (int i = 0; i < n; i++) {
      t = sc.nextInt() - t;
      x = sc.nextInt() - x;
      y = sc.nextInt() - y;

      if (x + y > t || (t % 2 == 0 && (x + y) % 2 != 0) || (t % 2 != 0 && (x + y) % 2 == 0)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
