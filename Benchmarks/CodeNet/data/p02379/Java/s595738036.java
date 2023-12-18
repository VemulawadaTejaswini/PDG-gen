import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = ""; // Pの入力を受け取る変数
		String[] S_DATA = new String[4]; // 入力されたPのデータ(input)を配列に格納したもの
		Double[][] P = new Double[2][2];// S_DATAをDouble型に変換したもの
		int index = 0;// 二次元配列Pの１番目の配列番号を示す変数
		Double X_sa = 0.0; // 2点 P1(x1, y1), P2(x2, y2)におけるx1とx2の差
		Double Y_sa = 0.0;// 2点 P1(x1, y1), P2(x2, y2)におけるy1とy2の差
		Double distance = 0.0; //

		input = sc.nextLine();
		S_DATA = input.split(" ");
		for (int i = 0; i < S_DATA.length; i++) {
			index = i / 2; // i=0～1をP[0][]に i=1～2をP[1][]に格納する
							// P[0][]=P1,P[1][]=P2を表す
			if (i % 2 == 0) { // P[][0]にはx座標、P[][1]にはy座標を格納する
				P[index][0] = Double.parseDouble(S_DATA[i]);
			} else {
				P[index][1] = Double.parseDouble(S_DATA[i]);
			}
		}
		X_sa = Math.abs(P[0][0] - P[1][0]);
		Y_sa = Math.abs(P[0][1] - P[1][1]);
		distance = Math.sqrt(X_sa * X_sa + Y_sa * Y_sa);

		System.out.printf("%.5f", distance);

	}
}

