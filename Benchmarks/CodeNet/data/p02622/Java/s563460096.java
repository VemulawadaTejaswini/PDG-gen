import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String T = scan.nextLine();
    int length = 0;
    int ans = 0;

    length = S.length();

    for (var i = 0; i < length; i++) {
      if (S.charAt(i) != T.charAt(i)){
        ans++;
      }
    }


    System.out.println(ans);
    scan.close();
  }
}