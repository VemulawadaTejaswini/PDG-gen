import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    long sum = 0;
    for (int i = 0; i < M; i++) {
      int A = scanner.nextInt();
      sum += A;
    }
    System.out.println(Math.max(N - sum, -1));
  }
}
