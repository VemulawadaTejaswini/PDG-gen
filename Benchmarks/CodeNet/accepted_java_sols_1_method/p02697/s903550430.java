import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    StringBuilder sb = new StringBuilder();
    int l = N <= 4 ? 1 : N - 2;
    for (int i = 1; i <= M; i++) {
      sb.append(i).append(' ').append(i + l).append('\n');
      int m = l - 2;
      if (N % 2 == 0 && l >= N / 2 && m <= N / 2) m--;
      l = m;
    }
    System.out.println(sb.toString());
  }
}
