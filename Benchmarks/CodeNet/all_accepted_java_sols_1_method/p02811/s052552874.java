import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String s = scanner.nextLine();
    final String[] s1 = s.split(" ");

    final int i = 500 * Integer.parseInt(s1[0]);

    if (i >= (Integer.parseInt(s1[1]))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}