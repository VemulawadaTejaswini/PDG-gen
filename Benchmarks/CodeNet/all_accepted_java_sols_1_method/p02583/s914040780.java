import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}

		Arrays.sort(array);

		//演算
		int result = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (array[i] + array[j] > array[k] && array[i] != array[j] && array[j] != array[k]) {
						result++;
					}
				}
			}
		}

		//結果出力
			System.out.println(result);
	}
}
