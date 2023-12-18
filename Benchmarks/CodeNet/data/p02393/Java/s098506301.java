// 2-C ３つの整数を読み込み、それらを値が小さい順に並べて出力するプログラムを作成して下さい。 

import java.util.*;


class Main{
	////プログラムのエントリポイント
	public static void main(String[] args){
		//入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//数字３つ受け取り
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//数字を入れ替えるための変数ｘ
		int x;
		
		//数字の入れ替え
		if(a > b){
			x = b;
			b = a;
			a = x;
		}
		if(b > c){
			x = c;
			c = b;
			b = x;
		}
		if(a > b){
			x = b;
			b = a;
			a = x;
		}
		//入れ替え後の結果表示
		System.out.println( a + " " + b + " " + c );
	}
}