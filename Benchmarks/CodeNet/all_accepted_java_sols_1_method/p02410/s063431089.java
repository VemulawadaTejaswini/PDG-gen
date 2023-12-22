import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson6D n×m  の行列 A  と、m×1  の列ベクトルb  を読み込み、A  と b  の積を出力するプログラム
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



		//行列A および列ｂの各数字の一時保管場所
		int intVector = 0;

		//入力値の各行の文字列の一時保管場所
		String strLine = "";



		//一行目を読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine1 = insBR.readLine();

			//ばらけさせる
			String[] strAryLine1 = strLine1.split(" ");

			//行列Aの行の数
			int intLine = Integer.parseInt(strAryLine1[0]);

			//行列Aの列の数
			int intColumn = Integer.parseInt(strAryLine1[1]);

			//行と列が決まったところでベクトルAの大きさが決まる
			int[][] intVectorA = new int[intLine][intColumn];

			//行と列が決まったところで列bの大きさが決まる
			int[] intColumnB = new int[intColumn];

			//同じく答えの長さもわかるので答えの配列を初期化
			int[] intAnswer = new int[intLine];


			//行列Aを読み込む
			//i行目
			for(int i = 0; i < intLine; i++) {
				strLine = insBR.readLine();

			//ばらけさせる
				String[] strAryLine = strLine.split(" ");

				//int型にキャスト
				//j列目
				for(int j = 0; j < intColumn; j++) {
					intVector = Integer.parseInt(strAryLine[j]);

					//配列に格納
					//i行のj列
					intVectorA[i][j] = intVector;
				}
			}


			//列bを読み込む
			//ベクトルAの列の分、列bがある　=intColumn
			for(int i = 0; i < intColumn; i++) {

				//列bの値を1行づつ値が入っているので1行読み込み
				strLine = insBR.readLine();

				//int型にキャスト
				intVector = Integer.parseInt(strLine);

				//配列に格納
				intColumnB[i] = intVector;
			}

			//計算して出力
			for(int i = 0; i < intLine; i++) {
				for(int j = 0; j < intColumn; j++) {
					intAnswer[i] += intVectorA[i][j] * intColumnB[j];
				}

				System.out.println(intAnswer[i]);
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}


/*

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
			*/