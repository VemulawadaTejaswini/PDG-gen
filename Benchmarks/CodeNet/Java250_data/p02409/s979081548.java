import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson6C Ａ大学は１フロア１０部屋、３階建ての公舎４棟を管理しています。
 * 公舎の入居・退去の情報を読み込み、各部屋の入居者数を出力するプログラム
 * n件の情報が与えられます。各情報では、４つの整数b, f, r, vが与えられます。
 * これは、b棟f階のr番目の部屋にv人が追加で入居したことを示します。
 * vが負の値の場合、v人退去したことを示します。
 * 最初、全ての部屋には誰も入居していないものとします。
 *
 * @author Internship
 *
 */
public class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		//棟が4個　階が3個　部屋が10個でそれぞれに最大9人は入れるので　
		//4x3x10の配列に最大9が入る配列を初期化
		int[][][] intRoom = new int[4][3][10];

		//1列目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine1 = insBR.readLine();

			int intLine1 = Integer.parseInt(strLine1);


			//3
			//1 1 3 8
			//3 2 2 7
			//4 3 8 1

			//2列目以降を取得
			for(int i = 0; i < intLine1; i++) {

				String strLineAll = insBR.readLine();

				//入力値を分解
				String[] strAry = strLineAll.split(" ");

				//棟
				int intBuilding = Integer.parseInt(strAry[0]);

				//階
				int intFloor = Integer.parseInt(strAry[1]);

				//部屋
				int intRoomFirst = Integer.parseInt(strAry[2]);

				//人数
				int intPeople = Integer.parseInt(strAry[3]);

				//入力値を配列に格納
				intRoom[intBuilding -1][intFloor -1][intRoomFirst -1] += intPeople;




			}

			//出力

			for(int l = 0; l < 4; l++) {
				for(int j = 0; j < 3; j++) {
					for(int k = 0; k < 10; k++) {
						System.out.print(" " + intRoom[l][j][k]);
					}
					System.out.println("");						//改行
				}
				if(l != 3) {
					System.out.println("####################");
				}
			}


		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}