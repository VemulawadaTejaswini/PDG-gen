import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.next();
    if (s.length() > 2) {
      for (int i = 0; i < s.length(); i++) {
        System.out.print(s.charAt(s.length() - i - 1));
      }
      System.out.println();
    } else {
      System.out.println(s);
    }
  }
}
