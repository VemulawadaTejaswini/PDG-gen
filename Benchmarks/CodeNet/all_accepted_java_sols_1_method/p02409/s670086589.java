// b棟f階のr番目の部屋にv人
// １フロア１０部屋、３階建ての公舎４棟

// Input情報
// 最初の行に情報の数 n が与えられます。
// 続いて n 件の情報が与えられます。各情報には４つの整数 b, f, r, v が空白区切りで１行に与えられます。

// アプローチは以下2つが浮かんだ
// ・1つのでかい2次元配列を用意して4棟分まとめた情報を格納するか
// ・4棟分の配列を用意してそれぞれに情報を格納するか
// 後者のほうがわかりやすいため後者を選択

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;	// 情報の数
		String str = null;
		String[] spl = new String[4];

		//入力受け取り用変数を定義
		String b;
		int f, r, v;

		// ループカウンタ変数
		int i, j;

		// 棟の数だけ2次元配列を用意（int）
		int [][] b1 = new int[3][10];
		int [][] b2 = new int[3][10];
		int [][] b3 = new int[3][10];
		int [][] b4 = new int[3][10];

		// 情報の数を取得
		str = scan.nextLine();
		n = Integer.parseInt(str);

		// 情報の数だけ繰り返し
		for(i=0; i<n; i++){
			// 入力受け取り
			str = scan.nextLine();
			spl = str.split(" ");
			b = spl[0];
			f = Integer.parseInt(spl[1]);
			r = Integer.parseInt(spl[2]);
			v = Integer.parseInt(spl[3]);

			switch(b){
				// b="1"のとき
				case "1":
					// 1棟の[f][r]要素にv人足す
					b1[f-1][r-1] = b1[f-1][r-1] + v;
					break;
				// b="2"〜"4"も同様
				case "2":
					b2[f-1][r-1] = b2[f-1][r-1] + v;
					break;
				case "3":
					b3[f-1][r-1] = b3[f-1][r-1] + v;
					break;
				case "4":
					b4[f-1][r-1] = b4[f-1][r-1] + v;
					break;
			}
		}
		// 二重ループで出力
		for(i=0 ;i<3; i++){
			for(j=0; j<10; j++){
				System.out.print(" " + b1[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");

		for(i=0 ;i<3; i++){
			for(j=0; j<10; j++){
				System.out.print(" " + b2[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");

		for(i=0 ;i<3; i++){
			for(j=0; j<10; j++){
				System.out.print(" " + b3[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");

		for(i=0 ;i<3; i++){
			for(j=0; j<10; j++){
				System.out.print(" " + b4[i][j]);
			}
			System.out.println();
		}
	}
}
