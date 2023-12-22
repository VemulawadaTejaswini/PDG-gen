import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    for (int c = M / N; c > 0; c--) {
      if (M % c != 0) continue;
      int d = M / c;
      if (d >= N) {
        System.out.println(c);
        return;
      }
    }
  }
}
