import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var point = Integer.parseInt(str_scan);
    int ans = 8;

    // 初期
    point = point - 400;

    for (var i = 0;i < 7;i++) {
      if (point < 200) {
        break;
      }
      point = point - 200;
      ans--;
    }

    System.out.println(ans);
    scan.close();
  }
}