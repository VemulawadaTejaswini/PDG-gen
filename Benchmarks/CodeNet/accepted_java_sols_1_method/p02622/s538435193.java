import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String stra = scan.nextLine();
    String strb = scan.nextLine();
    char chara,charb;
    int ans = 0;

    for (var i = 0; i < stra.length(); i++) {
      chara = stra.charAt(i);
      charb = strb.charAt(i);
      if (chara != charb) {
        ans++;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}