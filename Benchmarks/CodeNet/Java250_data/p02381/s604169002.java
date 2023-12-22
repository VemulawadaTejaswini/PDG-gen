

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);
		//
		int roop = 0;
		// 答えの配列
		double[] double_array = new double[100];
		// 何個入力があるか
		while (sc.hasNext()) {
			
			//値を初期化
			int input_number = 0;
			int points = 0;
			int all_points = 0;
			// 入力数の配列
			ArrayList<Integer> input_array = new ArrayList<Integer>();
			
			input_number = sc.nextInt();

			// 入力値が0だった場合、結果を出力
			if (input_number == 0) 
				break;
			

			// 入力個数分まわす
			for (int i = 0; i < input_number; i++) {

				//
				while (sc.hasNext()) {
					//
					points = sc.nextInt();
					input_array.add(points);
					break;
				}
				// 合計値
				all_points += points;
			}
			// インスタンスを作る
			Sta_Math obj = new Sta_Math(all_points, input_number, input_array);
			obj.cast_standard();
			//
			double_array[roop] = obj.getStandard();
			roop++;
		}
		for (int i = 0; i < roop; i++) {
			System.out.println(double_array[i]);
		}
	}
}

class Sta_Math {

	// 合計値
	private int all = 0;
	// 入力個数
	private int input_number = 0;
	// 平均
	private double average = 0;
	// 標準偏差
	private double standard = 0;
	// 入力数字列
	ArrayList<Integer> input_arr = null;

	// コンストラクタ
	Sta_Math(int a, int i, ArrayList<Integer> b) {
		all = a;
		input_number = i;
		input_arr = b;
		average = (double)a / i;
	}

	// 標準偏差を計算
	public void cast_standard() {
		double hoge = 0;
		// 分子に使う数
		double namerator = 0;
		// 入っている数列分まわす
		for (int val : input_arr) {
			hoge = (val - average) * (val - average);
			namerator += hoge;
		}

		standard = Math.sqrt(namerator / input_number);
	}

	// ゲッター
	public double getStandard() {
		return standard;
	}

}