import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int maxX = scanner.nextInt();
    int minY = scanner.nextInt();

    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      if (x > maxX) maxX = x;
    }
    for (int i = 0; i < M; i++) {
      int y = scanner.nextInt();
      if (y < minY) minY = y;
    }

    if (minY - maxX > 0) {
      System.out.println("No War");
    } else {
      System.out.println("War");
    }
  }
}
