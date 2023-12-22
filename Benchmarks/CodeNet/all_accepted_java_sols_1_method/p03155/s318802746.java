import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int H = scanner.nextInt();
    int W = scanner.nextInt();

    System.out.println((N - H + 1) * (N - W + 1));
  }
}
