import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    //変数time, hour, minute, secondを宣言
    int time, hour, minute, second;
    
    //変数timeに値を入力する
    time = sc.nextInt();    
    
    //hour(時間) minute(分) second(秒)の計算
    hour = time / 3600;
    minute = (time % 3600) / 60;
    second = (time % 3600) % 60 ;
    
    //hour(時間) minute(分) second(秒)を出力する
    System.out.println(hour + ":" + minute + ":" + second);
    
    }
}


/*覚えよう！！

・変数に計算結果を代入する：面積　＝　縦　×　横
　※計算は変数名でも数値でもいける

・四則演算：足し算｢＋｣、引き算｢－｣、掛け算｢＊｣、割り算｢／｣
　1 + 2 = 3;
　4 - 3 = 1;
　2 * 5 = 10;
　8 / 2 = 4;

・余りの計算：割り算の余り｢％｣
  5 % 3 = 2;
  
  
・printlnの複数表示：｢＋｣を使用
　例：println("Kobe" + "Kagikou"); = KobeKajikou
　　　println("明治 + 20 + "年"); = 明治20年　数値が入ってもOK！


*/


/*前回の内容！！

・変数の宣言は｢型｣と｢変数名｣の２つ必要
　例：型＿変数名　→　int x;
　
・キーボードから入力するときは・・・｢ import java.util.Scanner; ｣ と ｢  Scanner sc = new Scanner(System.in) ; ｣が必要

・入力するとき・・・変数名 = sc.nextInt(); nextの後は型を書く、頭文字は大文字　
　※  scは変更しても大丈夫しかし全て変更後の文字に統一　例：nyuryoku

・println・・・画面に出力するときに使用

・文字列の表示・・・"〇〇〇の間に入力"ことが約束

*/
