import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final int c = scanner.nextInt();

    if((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
