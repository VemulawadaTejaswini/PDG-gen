import java.util.Scanner;

public class Main {
	private static int count = 0;

	/**
	 * バブルソートをするプログラム
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] value = new int[num];
		for (int i = 0; i < num; i++) {
			value[i] = scan.nextInt();
		}

		int[] sort = bubbleSort(value, num);
		for (int j = 0; j < num; j++) {
			if (j == num - 1) {
				System.out.print(sort[j]);
			} else {
				System.out.print(sort[j] + " ");
			}
		}
		System.out.println("");
		System.out.println(count); // ソート回数

		scan.close();
	}

	/**
	 * バブルソート
	 * 
	 * @param sortArray
	 *            ソートする配列
	 * @param num
	 *            ソートする個数
	 * @return 昇順にソートされた配列
	 */
	public static int[] bubbleSort(int[] sortArray, int num) {
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = num - 1; j >= 1; j--) {
				if (sortArray[j] < sortArray[j - 1]) {
					int tmp;
					tmp = sortArray[j];
					sortArray[j] = sortArray[j - 1];
					sortArray[j - 1] = tmp;
					flag = true;
					counter();
				}
			}
		}
		return sortArray;
	}

	public static void counter() {

		count++;
	}
}

