import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //stの入力
    String s = sc.next();
    String t = sc.next();
    int point;//参照位置
    //続行条件の論理型変数
    boolean con1 = true;
    boolean con2 = true;
    
    for(int i = 0; i < s.length() && con1;i++) {
      con2 = true;
      //iからi-1までを参照し、一致するかどうかをチェック
      for(int j = i; j < (s.length()+i) && con2;j++) {
      	if(j >= s.length()) point = j - s.length(); //jが文字列の長さを超えた場合、0から参照していくようにする
        else point = j; 
        
        if(s.charAt(j - i) != t.charAt(point)) con2 = false; //不一致であればループ終了
      }
      if(con2) con1 = false;//一致していればループ終了
    }
    
    //出力
    if(!con1) System.out.println("Yes");
    else System.out.println("No");
  }
}
