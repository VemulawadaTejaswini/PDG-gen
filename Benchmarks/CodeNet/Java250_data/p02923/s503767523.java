import java.util.Scanner;

public class Main {

	/*
	 * 移動できる最大値を求める。
	 */
	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int[] heights = new int[number];
		for (int i = 0; i < number; i++) {
			heights[i] = s.nextInt();
		}
		s.close();

		/*
		 * 右隣の数が同じか以下が続く回数を数える。
		 * →iごとに行う。
		 * →最大値更新ごとに最大値を更新。
		 */
		int max = 0;
		int count = 0;
		//max:最大回数、count:iごとに数える変数。

		for (int i = 0; i < number; i++) {
			count = 0;
			int j = 0;
			for (j = 0; (i + j + 1) < number; j++) {
				//i+j+1がnumberを越えるとエラーになる。
				if (heights[i + j] >= heights[i + j + 1]) {
					count++;
				} else {
					break;
				}
				if (max < count) {
					max = count;
				}
			}
			i = i + j;
			//試行回数を減らすため、iを飛ばす。

		}

		System.out.println(max);

	}

}
