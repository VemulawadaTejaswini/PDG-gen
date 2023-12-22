import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    String strings = scanner.next();
    int sumOfNotMatch = 0;
    if (strings.length() % 2 == 1) {
      // 奇数パターン
      for (int i = 0; i <= strings.length() / 2; i++) {
        if (!strings.substring(strings.length() / 2 - i, strings.length() / 2 - i + 1)
            .equals(strings.substring(strings.length() / 2 + i, strings.length() / 2 + i + 1))) {
          sumOfNotMatch++;
        }
      }
    } else {
      // 偶数パターン
      for (int i = 0; i < strings.length() / 2; i++) {
        if (!strings.substring(strings.length() / 2 - i - 1, strings.length() / 2 - i)
            .equals(strings.substring(strings.length() / 2 + i, strings.length() / 2 + i + 1))) {
          sumOfNotMatch++;
        }
      }
    }
    System.out.println(sumOfNotMatch);
  }

}
