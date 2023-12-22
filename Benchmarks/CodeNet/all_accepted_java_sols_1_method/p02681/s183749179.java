import java.util.Scanner;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner cin = new Scanner(System.in);
    String  S   = cin.next();
    String  T   = cin.next();
    if ((T.length() - S.length()) != 1){
      System.out.println("No");
    }
    else{
      if (T.indexOf(S) == 0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }

}
