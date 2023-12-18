import java.util.Scanner;

public class Main {
	public static int cnt = 0;
	public static int m = 0;
	public static int[] sortedArray = new int[100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = scan.nextInt();
		}
		shellSort(array, num);

		// output
		System.out.println(m);
		//shellsortでm-1から入力しているのでm-1から出力していく
		System.out.print(sortedArray[m - 1]);
		for (int i = m - 2; i >= 0; i--) {
			System.out.print(" " + sortedArray[i]);
		}
		System.out.println();
		System.out.println(cnt);
		for (int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		scan.close();

	}

	/**
	 * 挿入ソート
	 * 
	 * @param sortArray：オリジンの配列
	 * @param num：要素の個数
	 * @param g: スタート位置
	 */
	public static void insertionSort(int[] sortArray, int num, int initialStatePoint) {

		for (int i = initialStatePoint; i < num; i++) {
			int v = sortArray[i]; // 1枚取り出す
			int j = i - initialStatePoint;
			while (j >= 0 && sortArray[j] > v) {// 取り出した一枚より前の方に持っていたカードと比較
				sortArray[j + initialStatePoint] = sortArray[j];
				j = j - initialStatePoint;
				cnt++;
			}
			sortArray[j + initialStatePoint] = v;

		}

	}

	/**
	 * シェルソート
	 * @param sortArray オリジンの配列
	 * @param num：要素の個数
	 */
	public static void shellSort(int[] sortArray, int num) {
		for (int i = 1;; i = i * 3 + 1) {
			if (i > num) {
				break;
			}
			sortedArray[m] = i;		
			m++;
		}
		for (int i = m - 1; i >= 0; i--) {
			insertionSort(sortArray, num, sortedArray[i]);
		}
	}

}

