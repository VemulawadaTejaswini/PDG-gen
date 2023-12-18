
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a == b + c) {
      System.out.println("Yes");
      return;
    }

    if (a + b == c) {
      System.out.println("Yes");
      return;
    }

    if (a + c == b) {
      System.out.println("Yes");
      return;
    }

    System.out.println("No");
  }
}
