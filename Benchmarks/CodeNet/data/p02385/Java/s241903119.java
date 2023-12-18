

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 * Lesson11C Dice I と同様の方法で、入力された数字から２つのサイコロをつくる
 * これらが同一のものか判定するプログラム
 * Dice I の方法でサイコロを回転させ、
 * ２つのサイコロのそれぞれの６方向から見た数字が全て一致するとき、
 * 同一のサイコロとみなす。
 *
 * @author Internship
 *
 */
public class Main{
	public static void main(String[] args) {

		//1行目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			//1つサイコロを作成
			Dice insDice1 = new Dice(strLine);

			//2こ目のサイコロを作成
			strLine = insBR.readLine();
			Dice insDice2 = new Dice(strLine);

			//2つのサイコロを比較
			boolean booSame = CompareDice(insDice1, insDice2);

			//出力
			if(booSame) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}catch(IOException e) {
			System.out.println(e);
		}




		//出力
	}

	/**
	 * 2つのサイコロが向きが違うにせよ、同じものか判断する
	 * @param insDice1 1つ目のサイコロ
	 * @param insDice2 2つ目のサイコロ
	 * @return booSame 同じならTrue 違うならfalse
	 */
	public static boolean CompareDice(Dice insDice1, Dice insDice2) {

		//戻り値　２つのサイコロが同じならTrue 違うならfalse
		boolean booSame = false;

		//1つ目のサイコロの上面の数字と２つ目のサイコロの上面の数字を
		//一緒になるように２つ目のサイコロを転がす

		//1つ目のサイコロの目を取得
		int[] intDice1 = insDice1.getIntDice();

		//2つ目のサイコロをintDice1[0](サイコロ1の上面)の数字になるように転がす
		insDice2.upMatch(intDice1[0]);

		//1つ目のサイコロの前面の数字と２つ目のサイコロの前面の数字を
		//上面が変わらないように前面が一緒になるように２つ目のサイコロを転がす
		insDice2.frontMatchUpSame(intDice1[1]);

		//転がした後の2つ目のサイコロの目を取得
		int[] intDice2 = insDice2.getIntDice();

		//2つのサイコロが同じ目か判断
		int intCount = 0;

		for(int i = 0; i < intDice1.length; i++) {
			if(intDice1[i] == intDice2[i]) {

				//6面一緒ならintCountが6になるはず
				intCount++;
			}

		}
		// intCount==6なら
		if(intCount == intDice1.length) {
			booSame = true;
		}

		return booSame;
	}


	/**
	 * サイコロ
	 * @author Internship
	 *
	 */
	public static class Dice {

		//サイコロの目の数字
		private int[] intDice = new int[6];

		public Dice(String strLine) {

			//分解
			String[] strAry = strLine.split(" ");

			//サイコロの目に格納
			for(int i = 0; i < intDice.length; i++) {
				this.intDice[i] = Integer.parseInt(strAry[i]);
			}

		}

		/**
		 * サイコロの目を配列で取得
		 * @return
		 */
		int[] getIntDice() {
			return intDice;
		}

		/**
		 * サイコロの上面が引数の数字通りなるように転がす
		 * 上面以外はどのような向きでも良い
		 *
		 * @param intFront 上面の数字がなってほしい数字
		 */
		void upMatch(int intUp) {

			//前面にきているのでN(北)へ転がす
			if(intUp == intDice[1]) {
				goNorth();

			//右面にきているのでW(西)へ転がす
			} else if(intUp == intDice[2]) {
				goWest();

			//左面にきているのでE(東)へ転がす
			} else if(intUp == intDice[3]) {
				goEast();

			//後面にきているのでS(南)へ転がす
			} else if(intUp == intDice[4]) {
				goSouth();

			//底面にきているのでSS(南南)へ転がす
			} else if(intUp == intDice[5]) {
				goSouth();
				goSouth();

			}
		}

		/**
		 * サイコロの前面の数字を引数と同じ数字になるように転がす
		 * 上面は最終的に変わらないように転がす
		 */
		void frontMatchUpSame(int intFront) {

			//右面にきているのでNWS(北西南)へ転がす
			if(intFront == intDice[2]) {
				goNorth();
				goWest();
				goSouth();

			//左面にきているのでNES(北東南)へ転がす
			} else if(intFront == intDice[3]) {
				goNorth();
				goEast();
				goSouth();

			//後面にきているのでNNEE(北北東東)へ転がす
			} else if(intFront == intDice[4]) {
				goNorth();
				goNorth();
				goEast();
				goEast();
			}


		}

		/**
		 * N(北)の方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
		 *
		 */
		void goNorth() {

			//1→2 2→6 6→5 5→1に変える
			int intNum =0;
			intNum = intDice[0];
			intDice[0] = intDice[1];
			intDice[1] = intDice[5];
			intDice[5] = intDice[4];
			intDice[4] = intNum;
		}

		/**
		 * E(東)の方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
		 *
		 */
		void goEast() {

			//1→4 4→6 6→3 3→1に変える
			int intNum =0;
			intNum = intDice[0];
			intDice[0] = intDice[3];
			intDice[3] = intDice[5];
			intDice[5] = intDice[2];
			intDice[2] = intNum;

		}

		/**
		 * W(西)の方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
		 *
		 */
		void goWest() {

			//1→3 3→6 6→4 4→1に変える
			int intNum =0;
			intNum = intDice[0];
			intDice[0] = intDice[2];
			intDice[2] = intDice[5];
			intDice[5] = intDice[3];
			intDice[3] = intNum;

		}

		/**
		 * S(南)の方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
		 *
		 */
		void goSouth() {

			//1→5 5→6 6→2 2→1に変える
			int intNum =0;
			intNum = intDice[0];
			intDice[0] = intDice[4];
			intDice[4] = intDice[5];
			intDice[5] = intDice[1];
			intDice[1] = intNum;

		}

	}
}