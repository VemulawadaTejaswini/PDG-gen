
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i <= 1000000; i++) {
      int amari_count = 0;
      boolean isFound = true;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          amari_count++;
        }
        if (amari_count > 2) {
          isFound = false;
          break;
        }
      }
      if (isFound) {
        System.out.println(i);
        break;
      }
    }
  }
}
