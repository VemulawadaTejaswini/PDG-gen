import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var X = Integer.parseInt(str_scan);
    var ans = "No";

    if (X >= 30) {
      ans = "Yes";
    }

    System.out.println(ans);
    scan.close();
  }
}