import java.util.Scanner;

public class Main {

	// private static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] sort_before = new int[num];

		for (int i = 0; i < num; i++) {
			sort_before[i] = scan.nextInt();
		}

		// selectionSortを実行した回数
		int count = selectionSort(sort_before, num);

		System.out.print(sort_before[0]);
		for (int i = 1; i < num; i++) {
			System.out.print(" " + sort_before[i]);
		}
		System.out.println();
		System.out.println(count);

		scan.close();

	}

	/**
	 * セレクションソート。一番小さい値を選択して入れ替える。
	 * 
	 * @param A配列
	 * @param N配列の数
	 * @return入れ替えた回数
	 */
	public static int selectionSort(int[] A, int N) {

		int count = 0;
		for (int i = 0; i < N; i++) {
			int mini = i;
			for (int j = i; j < N; j++) {
				if (A[j] < A[mini]) {
					mini = j;
				}
			}
			if (mini != i) {
				int tmp;
				tmp = A[i];
				A[i] = A[mini];
				A[mini] = tmp;
				count++;
			}

		}

		return count;
	}
}

