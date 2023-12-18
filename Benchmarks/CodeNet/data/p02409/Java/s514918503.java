

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//
		int input_low = 0;
		int house_number = 0;
		int floar_number = 0;
		int room_number = 0;
		int person = 0;

		// テキスト入力
		Scanner sc = new Scanner(System.in);

		// A大学の公舎を作る
		int school_house[][][];
		school_house = new int[4][3][10];

		// 入力の数だけ回す
		while (sc.hasNext()) {

			// 入力行数
			input_low = sc.nextInt();
			break;
		}

		// 入力行数分回す
		for (int i = 0; i < input_low; i++) {

			while(sc.hasNext()){
			// 部屋の指定
			house_number = sc.nextInt();
			floar_number = sc.nextInt();
			room_number = sc.nextInt();
			person = sc.nextInt();
			break;
			}

			// 部屋に人を放り込む
			school_house[house_number][floar_number][room_number] = person;
			

		}

		// 出力
		for (int hi = 0; hi < 4; hi++) {
			for (int fi = 0; fi < 3; fi++) {
				for (int ri = 0; ri < 10; ri++) {
					System.out.print(school_house[hi][fi][ri]);
				}
				System.out.print("\n");
			}
			//最後の行を表示
			while (hi < 3) {
				System.out.println("####################");
			}
		}

	}

}