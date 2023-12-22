import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int pt = 0;
    int px = 0;
    int py = 0;
    for (int i = 0; i < N; i++) {
      int t = scanner.nextInt();
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int dist = Math.abs(x - px) + Math.abs(y - py);
      int dt = t - pt;
      if (dist > dt || (dt - dist) % 2 != 0) {
        System.out.println("No");
        return;
      }
      pt = t;
      px = x;
      py = y;
    }
    System.out.println("Yes");
  }
}
