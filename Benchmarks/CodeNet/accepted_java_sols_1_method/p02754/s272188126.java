
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long quot = n / (a + b);
    long surplus = n - (a + b) * quot;
    if (surplus > a) {
      System.out.println(a * quot + a);
    } else {
      System.out.println(a * quot + surplus);
    }
  }
}
