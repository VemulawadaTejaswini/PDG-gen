import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    //変数xを宣言
    int x;
    //変数Xに値を入力する
    x = sc.nextInt();
    //変数Xの3乗を値を出力する
    System.out.println(x * x * x);
    
    }
}


/*覚えよう！！

・変数の宣言は｢型｣と｢変数名｣の２つ必要
　例：型＿変数名　→　int x;
　
・キーボードから入力するときは・・・｢ import java.util.Scanner; ｣ と ｢  Scanner sc = new Scanner(System.in) ; ｣が必要

・入力するとき・・・変数名 = sc.nextInt(); nextの後は型を書く、頭文字は大文字　
　※  scは変更しても大丈夫しかし全て変更後の文字に統一　例：nyuryoku

*/


/*前回の内容！！

・println・・・画面に出力するときに使用
・文字列の表示・・・"〇〇〇の間に入力"ことが約束

*/
