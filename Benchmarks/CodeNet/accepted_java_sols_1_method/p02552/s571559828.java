import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var ans = Integer.parseInt(str_scan);

    if (ans == 1){
      ans = 0;
    } else {
      ans = 1;
    }

    System.out.println(ans);
    scan.close();
  }
}