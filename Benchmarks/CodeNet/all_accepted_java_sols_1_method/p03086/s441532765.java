import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next(); //入力された文字列
    char st; //文字を入れる場所;
    char ch[] = {'A','C','G','T'}; //比較対象の文字列
    int count = 0; //カウント
    int count_max = 0; //カウントの最大地
    boolean con; //ループを中断させる為の論理型変数
    
    for(int i = 0; i < s.length();i++){ //全ての文字を参照するようにループ
    	st = s.charAt(i); //文字列
      	con = true; //続行条件を正に
      	count++; //カウント加算
      	for(int j = 0; j < 4 && con;j++){ //conがtrueもしくは比較対象の文字列全てを比較しおえるまでループ
          if(st == ch[j]) con = false; //比較対象の文字列と一致していればconをfalseにしてループ終了
        }
      	if(con) count = 0; //conがtrueのまま終了した場合カウントを0に
      	if(count > count_max) count_max = count; //カウントが最大値を上回っていれば更新
    }
    
    System.out.println(count_max); //最大値を出力
  }
}
