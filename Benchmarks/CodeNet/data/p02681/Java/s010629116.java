
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final String S = scanner.nextLine();
    final String T = scanner.nextLine();

    final String a = T.substring(0, T.length() - 1);

    if (a.equals(S)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
