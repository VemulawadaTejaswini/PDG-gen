import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String s = scanner.next();
    final String t = scanner.next();
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final String u = scanner.next();

    if(u.equals(s)) {
      System.out.println((a-1) + " " + b);
    } else {
      System.out.println(a + " " + (b-1));
    }

  }
}
