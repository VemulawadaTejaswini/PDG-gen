
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 文字列の入力
    String S = sc.next();

    String[] aList = S.split("");
    if(aList[2].equals(aList[3]) && aList[4].equals(aList[5])) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
