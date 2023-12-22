import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int L = scanner.nextInt();
    int sum = N * (N + 1) / 2 + N * (L - 1);
    if (L >= 0) sum -= L;
    else if (L + N - 1 <= 0) sum -= L + N - 1;
    System.out.println(sum);
  }
}
