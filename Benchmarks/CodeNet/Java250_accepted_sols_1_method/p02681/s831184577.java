import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

//    2つの文字列を入力してもらう
    String s = scanner.next();
    String t = scanner.next();

//    tから最後の１文字を切り離した文字列を抽出
    int tLength = t.length();
    String T = t.substring( 0 , tLength - 1);

//    最初に入力してもらった文字列と先ほど抽出した文字列を比較する
    if( s.equals(T)) {
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }

    scanner.close();
  }
}