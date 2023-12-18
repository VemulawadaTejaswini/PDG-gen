
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int max = -1;
			// まずは小さい順にソート
			Arrays.sort(a);
			for (int i = 0; i < n; i++) {
				// 同じアイテムを2つ取ることは禁止されているので、
				// [i+1, n)の範囲で二分探索を行う
				int j = Arrays.binarySearch(a, i + 1, n, m - a[i]);
				if (j < 0) {
					j = -j - 2;
				}
				if (j > i) {
					max = Math.max(max, a[i] + a[j]);
				}
			}
			if (max == -1) {
				System.out.println("NONE");
			} else {
				System.out.println(max);
			}
		}
	}
}

