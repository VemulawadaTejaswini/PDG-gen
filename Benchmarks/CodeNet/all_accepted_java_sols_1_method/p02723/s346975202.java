import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final String s = scanner.nextLine();

    System.out.println(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5) ? "Yes" : "No");
  }
}