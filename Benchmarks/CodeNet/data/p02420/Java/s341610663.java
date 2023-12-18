/**


１つのアルファベットが描かれた n 枚のカードの山をシャッフルします。

1回のシャッフルでは、下から h 枚のカードをまとめて取り出し、それを残ったカードの山の上に積み上げます。

カードの山は以下のように１つの文字列で与えられます。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);

		//受け取る文字列、回す数の数の変数宣言
		String strmoji ;
		int intSuuji ;
		//breakされるまで処理を繰り返す
		while(true ){
			//文字列を受け取る
			strmoji = sc.next();
			//受け取った文字列がーだった場合breakする
			if(strmoji.contains("-")){
                break;
			}
			//受け取る数字の数を受け取る
			intSuuji = sc.nextInt();
			//受け取った数の回数処理を繰り返す
			for (int i = 0; i < intSuuji ; i ++){
					//シャッフルする数を受け取る
				int intMawasu = sc.nextInt();
				//strmojiの０からintmawasuの数 , intmawasuの数から文字列の最大の長さを
				//入れ替え変数にいれる
				String strirekae1 = strmoji.substring(0,intMawasu);
                String strirekae2 = strmoji.substring(intMawasu,strmoji.length());
                //分けた文字列を逆にして、strmojiに入れなおす。
                strmoji= strirekae2+strirekae1;


			}
			//結果表示
			System.out.println(strmoji);
		}
	}
}