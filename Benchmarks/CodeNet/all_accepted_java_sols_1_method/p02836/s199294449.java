import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    // 準備
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int i_r = s.length();
    int hug = 0;

    // 文字列の両側から比較していって、一致しなかったらハグ
    for(int i_l=0; i_l<i_r/2; ++i_l) {
      if(s.charAt(i_l) != s.charAt(i_r-(1+i_l))) {
        ++hug;
      }
    }
    System.out.println(hug);
  }
}