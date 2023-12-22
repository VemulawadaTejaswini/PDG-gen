import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//整数の合計入力数
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int in = Integer.parseInt(line1);

		//半角空白区切りで数値がStringで入力→int配列yを作成
		String line2 = sc.nextLine();
		String[] x = line2.split(" ");
		int[] y = new int [in];

		//String配列xの文字を数値にしてint配列ｙに入れる
		for (int i = 0; i < in; i++) {
			y[i] = Integer.parseInt(x[i]);
		}

		//long変数ｚを初期化し、配列ｙの値を合計していく
		long z = 0;
		for (int i = 0; i < in; i++) {
			z += y[i];
		}

		//配列ｙを昇順にて並べ替える
		Arrays.sort(y);

		//最小値、最大値、合計値の順で出力する
		System.out.println(y[0] + " " + y[in-1] + " " + z);

	}

}

