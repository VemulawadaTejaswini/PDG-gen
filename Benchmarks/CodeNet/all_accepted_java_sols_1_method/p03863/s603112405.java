import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    if (s[0] == s[s.length - 1]) {
      System.out.println(s.length % 2 == 0 ? "First" : "Second");
    } else {
      System.out.println(s.length % 2 == 0 ? "Second" : "First");
    }
  }
}
