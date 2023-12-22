import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();

    int count = 0;
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;

    // 500円利用する
    for (int i = 0; i <= a; i++) {
      sum1 = i * 500;
      for (int j = 0; j <= b; j++) {
        sum2 = j * 100;
        for (int k = 0; k <= c; k++) {
          sum3 = k * 50;
          if ((sum1 + sum2+ sum3) == x) {
            count++;
          }
        }
      }
    }

    System.out.println(count);

  }

}