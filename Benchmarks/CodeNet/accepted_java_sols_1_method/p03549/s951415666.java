import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    System.out.println((1900 * M + 100 * (N - M)) * (1 << M));
  }
}
