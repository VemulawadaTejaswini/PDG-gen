
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    String str = "";
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '0':
          str = str + "0";
          break;
        case '1':
          str = str + "1";
          break;
        case 'B':
          if (str.length() > 0) {
            str = str.substring(0, (str.length() - 1));
          }
          break;
      }
    }

    System.out.println(str);
  }
}
