import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    long M = scanner.nextLong();

    long res;
    if (N < M / 2) {
      res = N;
      M -= N * 2;
      res += M / 4;
    } else {
      res = M / 2;
    }
    System.out.println(res);
  }
}