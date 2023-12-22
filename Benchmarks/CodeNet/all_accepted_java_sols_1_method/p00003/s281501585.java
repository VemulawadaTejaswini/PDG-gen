import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      if ((a * a + b * b == c * c) ||
          (a * a + c * c == b * b) ||
          (c * c + b * b == a * a)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

}

