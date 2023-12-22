import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    String T = sc.next();

    int cnt = 0;
    for(int i = 0; i < S.length(); i++) {

      char s = S.charAt(i);
      char t = T.charAt(i);
      cnt += s == t ? 1 : 0;
    }

    System.out.println(cnt);
  }
}
