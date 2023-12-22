import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    for (int i = 0; i < s.length; i++) {
      if (i % 2 == 0 && s[i] == 'L') {
        System.out.println("No");
        return;
      } else if (i % 2 != 0 && s[i] == 'R') {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
