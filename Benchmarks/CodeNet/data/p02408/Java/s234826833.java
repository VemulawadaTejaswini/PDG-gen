package Array;

import java.util.Scanner;

public class Finding_Missing2 {

	public static void main(String[] args) {

		//
		int taro_card_number = 0;
		Finding_Missing_Card fmc = new Finding_Missing_Card();

		String[] tramp = { "S", "H", "C", "D" };

		for (String val : tramp) {
			int[] val;
			val = new int[13];
		}

		// トランプの各図柄の配列を作る
		int[] S;
		S = new int[13];
		int[] D;
		D = new int[13];
		int[] H;
		H = new int[13];
		int[] C;
		C = new int[13];
		
		int[] [] array_tramp = {S,H,C,D};

		// テキスト入力
		Scanner sc = new Scanner(System.in);
		// タローが持っているカードの数
		while (sc.hasNext()) {
			taro_card_number = sc.nextInt();
			System.out.print(sc.hasNext());

			// ループ処理(カードの数だけ回す)
			for (int i = 0; i < taro_card_number; i++) {

				// 図柄
				String design = sc.next();
				// 数
				int number = sc.nextInt();

				for (int[] val : array_tramp) {

					// 図柄の指定に従い、数字を配列に格納
					if (design.equals(val)) {
						//
						fmc.set_property(val, number);
					}
				}

			}
			// //配列に入力情報が格納されたので、入力情報にないものをピックアップして出力

			// スペードから順にないものを出力
			for (int i = 0; i < 13; i++) {

				for(int[] val: array_tramp)
				// ないものをピックアップ
				if (val[i] == 0) {
					System.out.println("S" + (i + 1));
				}
			}
			
		}
	}

	// 図柄の属性と数を取ってきて、配列に格納する
	public void set_property(int[] design, int number) {
		design[number - 1] = 1;
	}

}

//それぞれの図柄について扱う
class mark{
	
	//
	int all_number =13;
	
	//カードを作る
	public int[] 
	
	
	
	
}