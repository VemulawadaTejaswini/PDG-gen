import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    long min = 1_000_000_000_000_000L;
    for (int i = 0; i < 5; i++) {
      long a = scanner.nextLong();
      min = Math.min(a, min);
    }
    System.out.println((N - 1) / min + 5);
  }
}
