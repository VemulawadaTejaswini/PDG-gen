import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		//配列array
		ArrayList<Long> array = new ArrayList<Long>();

		//nに入力された数だけ繰り返し、配列に要素を代入
		for(int i = 0; i < 3; i++) {
			long x  = src.nextLong();
			array.add(x);
		}

		//最小値と最大値の変数を宣言
		long min, max = 0;
		max	=	array.get(0);		//最小、最大をインデックスの0で初期化
		min = max;

		//最小値と最大値を算出
		for(int i = 0; i < 3; i++)
            min = Math.min(min,array.get(i));

		for(int i = 0; i < 3; i++)
            max = Math.max(max,array.get(i));


		//出力
		System.out.println(String.format("%d %d",min, max));

	}
}
