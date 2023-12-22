import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    long K = scanner.nextLong();

    long r = N % K;
    System.out.println(Math.min(r, K - r));
  }
}
