import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Main main = new Main();
		int ans = main.bubbleSort(a, n);

		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.println(a[i]);
			}

		}
		System.out.println(ans);

	}

	private int bubbleSort(int[] a, int n) {
		boolean hasSwapped = true; // 要素の入れ替えを行った
		int cnt = 0;
		// 未ソート部分の先頭を表す i を持つ外側のループ
		for (int i = 0; hasSwapped; i++) {
			hasSwapped = false;
			// 末尾の要素からi+1まで入れ替え処理を行う
			for (int j = n - 1; j >= i + 1; j--) {
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
					cnt++;
					hasSwapped = true;
				}
			}

		}
		return cnt;
	}

}

