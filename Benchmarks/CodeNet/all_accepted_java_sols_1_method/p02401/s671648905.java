import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */


		/*while(true)で無限ループをセット
		 *int a = scan.nextInt(); 数値を入力
		 *String op = scan.next(); 算術演算子（今回は+,-,*,/の4種類）を入力してもらうことで計算を行ってる。
		 */
		while(true){
		int a		= scan.nextInt();
		String op	= scan.next();
		int b		= scan.nextInt();

		if (op.equals("?"))break;

		int result = 0;
		if(op.equals("+")){result = a+b;}
		if(op.equals("-")){result = a-b;}
		if(op.equals("*")){result = a*b;}
		if(op.equals("/")){result = a/b;}


		//最後は表示させる。
		System.out.println(result);
		}
    }
}