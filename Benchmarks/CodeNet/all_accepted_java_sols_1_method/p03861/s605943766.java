import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long x = scanner.nextLong();
    System.out.println(b / x - (a == 0L ? -1L : (a - 1L) / x));
  }
}
