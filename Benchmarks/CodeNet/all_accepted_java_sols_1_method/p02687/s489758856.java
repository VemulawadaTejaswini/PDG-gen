
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 整数の入力
    String s = sc.next();

    if (s.equals("ABC")) {
      // 出力
      System.out.println("ARC");
    } else {
      System.out.println("ABC");
    }
  }
}