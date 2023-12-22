import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Boolean bool = true;

    for (int i = 0; i < S.length(); i++) {

      // 奇数
      if (i % 2 == 0) {
        if (!((S.charAt(i) == 'R') || (S.charAt(i) == 'U') || (S.charAt(i) == 'D'))) {
          bool = false;
        }
      }

      // 偶数
      if (i % 2 == 1) {
        if (!((S.charAt(i) == 'L') || (S.charAt(i) == 'U') || (S.charAt(i) == 'D'))) {
          bool = false;
        }
      }
    }

    if (bool == true) {
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }

    sc.close();
  }
}
