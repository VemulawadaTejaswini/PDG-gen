import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    String ans = "";
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < alpha.length(); j++) {
        if (alpha.charAt(j) == s.charAt(i)) {
          if (j + n > 25) {
            ans = ans + String.valueOf(alpha.charAt(j + n - 26));
          } else {
            ans = ans + String.valueOf(alpha.charAt(j + n));
          }
        }
      }
    }

    System.out.println(ans);

  }
}