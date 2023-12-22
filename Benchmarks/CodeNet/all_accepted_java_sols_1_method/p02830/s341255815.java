import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int numberOfString = scanner.nextInt();
    String strings1 = scanner.next();
    String strings2 = scanner.next();
    for (int i = 0; i < numberOfString; i++) {
      System.out.print(strings1.substring(i, i + 1) + strings2.substring(i, i + 1));
    }
  }

}
