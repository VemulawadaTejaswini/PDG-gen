import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    boolean isEasy = true;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (i % 2 == 0) {
        if (c == 'R' || c == 'U' || c == 'D') {
          // no-op
        } else {
          isEasy = false;
          break;
        }
      } else {
        if (c == 'L' || c == 'U' || c == 'D') {
          // no-op
        } else {
          isEasy = false;
          break;
        }
      }
    }

    System.out.println(isEasy ? "Yes" : "No");
  }
}
