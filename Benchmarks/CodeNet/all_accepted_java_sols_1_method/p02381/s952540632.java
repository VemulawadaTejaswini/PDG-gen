import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int score[] = new int[1000];

    while (true) {
      int n = scanner.nextInt();
      if (n == 0) break;
      double m = 0.0, d = 0.0;

      for (int i = 0; i < n; ++i) {
        score[i] = scanner.nextInt();
        m += score[i];
      }

      m /= n;

      for (int i = 0; i < n; ++i) {
        d += Math.pow(((double)score[i] - m), 2);
      }

      d /= n;

      System.out.println(Math.sqrt(d));
    }
  }
}
