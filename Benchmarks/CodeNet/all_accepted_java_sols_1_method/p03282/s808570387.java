import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] s = scanner.next().toCharArray();
    long k = scanner.nextLong();

    for (char ch : s) {
      if (ch == '1') {
        k--;
        if (k == 0) {
          System.out.println('1');
          return;
        }
      } else {
        System.out.println(ch);
        return;
      }
    }
  }
}
