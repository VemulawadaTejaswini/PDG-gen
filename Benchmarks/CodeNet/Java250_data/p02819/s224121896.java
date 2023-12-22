
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int minimumNumber = scanner.nextInt();
    boolean primeNumberFlag = true;
    while (true) {
      primeNumberFlag = true;
      for (int i = minimumNumber - 1; i > 1; i--) {
        if (minimumNumber % i == 0) {
          primeNumberFlag = false;
          break;
        }
      }
      if (primeNumberFlag) {
        break;
      }
      minimumNumber++;
    }
    System.out.println(minimumNumber);
  }

}
