/**


文字列 str  に対して、与えられた命令の列を実行するプログラムを作成してください。命令は以下の操作のいずれかです：
?print a b: str  の a 文字目から b 文字目までを出力する。
?reverse a b: str  の a 文字目から b 文字目までを逆順にする。
?replace a b p: str  の a 文字目から b 文字目までを p に置き換える。

ここでは、文字列 str  の最初の文字を 0 文字目とします。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);

		// 文字列str,命令の数を受け取る
		String str = sc.nextLine();
		int intMeirei = sc.nextInt();
		String strMeirei;
		int intSaisyo;
		int intSaigo;
		String strKekka ;
		//intMeireiの数だけ処理を繰り返す
		for (int i = 0; i < intMeirei; i++) {
			//命令の内容を受け取る
			strMeirei = sc.next();
			//命令の最初の文字と最後の文字設定
			intSaisyo = sc.nextInt();
			intSaigo = sc.nextInt();
			//受け取った文字がreplace
			if (strMeirei.equals("replace")) {
				//指定された場所の文字と受け取った文字列を入れ替え
				String strOkikae = sc.next();
				//文字列０?最初の数字、最後の数字と文字列の長さまでの文字列をa,bに保持
				String a = str.substring(0,intSaisyo);
				String b =  str.substring(intSaigo+1,str.length());
				str = a + strOkikae + b ;

				//System.out.println(str);
			//受け取った文字がreverse
			} else if (strMeirei.equals("reverse")) {

				//指定された場所の文字列を変換、reverseで逆順にする。
				StringBuffer b = new StringBuffer(str.substring(intSaisyo,intSaigo + 1));
		        String strGyaku = b.reverse().toString();
		        //文字列０?最初の数字、最後の数字と文字列の長さまでの文字列をｃ、ｄに保持
		        String c = str.substring(0,intSaisyo);
		        String d = str.substring(intSaigo+1,str.length());
		        //保持した文字列と逆順にした文字列の結合
		        str =  c + strGyaku + d;


		        //System.out.println(str);

			//受け取った文字がprint
			} else if (strMeirei.equals("print")) {
				//最初の数字と最後の数字の位置の文字列表示
				strKekka= str.substring(intSaisyo,intSaigo+1);
				System.out.println(strKekka);

			}

		}
	}
}