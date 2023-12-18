
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int a = n > 1 ? n * (n - 1) / 2 : 0;
    int b = m > 1 ? m * (m - 1) / 2 : 0;
    System.out.println(a + b);
  }
}
