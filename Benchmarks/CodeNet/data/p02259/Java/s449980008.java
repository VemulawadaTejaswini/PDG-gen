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
	 * @param A
	 *            ソートする配列
	 * @param N
	 *            ソートする個数
	 * @return 昇順にソートされた配列
	 */
	public static int[] bubbleSort(int[] A, int N) {
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = N - 1; j >= 1; j--) {
				if (A[j] < A[j - 1]) {
					int tmp;
					tmp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmp;
					flag = true;
					counter();
				}
			}
		}
		return A;
	}

	public static void counter() {

		count++;
	}
}

