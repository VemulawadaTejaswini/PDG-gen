import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long x = scanner.nextLong();
    long count = x / 11 * 2;
    x -= x / 11 * 11;
    if (x > 6) count += 2;
    else if (x > 0) count++;
    System.out.println(count);
  }
}
