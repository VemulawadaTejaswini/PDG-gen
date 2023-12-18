import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean result = true;
    for (int i = 0; i < S.length(); i++) {
      if (i % 2 == 0) {
        if (S.charAt(i) == 'L') {
          result = false;
          break;
        }
      } else {
        if (S.charAt(i) == 'R') {
          result = false;
          break;
        }
      }
    }
    System.out.println(result ? "Yes" : "No");
  }
}