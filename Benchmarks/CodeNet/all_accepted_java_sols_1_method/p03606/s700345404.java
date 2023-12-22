import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int seats = 0;

    for (int i = 0; i < n; i++) {
      int s = scanner.nextInt();
      int e = scanner.nextInt();
      seats = seats + e + 1 - s;
    }

    System.out.println(seats);

  }

}
