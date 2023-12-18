import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private long cnt = 0;
	private int[] g;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Main main = new Main();
		main.shellSort(a, n);
		System.out.println(main.g.length);
		// 整数Gの表示
		for (int i = main.g.length - 1; i >= 0; i--) {
			if (i > 0) {
				System.out.print(main.g[i] + " ");
			} else { //最後の1回
				System.out.println(main.g[i]);
			}
		}
		System.out.println(main.cnt);
		// 整列したaの表示
		for (int i : a) {
			System.out.println(i);
		}

	}

	private void insertionSort(int[] a, int n, int g) {
		for (int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;

			while (j >= 0 && a[j] > v) {
				a[j + g] = a[j];
				j -= g;
				cnt++;
			}
			a[j + g] = v;

		}

	}

	private void shellSort(int[] a, int n) {
		// 数列 g = {1 , 4 , 13 , 40 , … }; を生成
		List<Integer> list = new ArrayList<>();
		for (int h = 1;;) {
			if (h > n) {
				break;
			}
			list.add(h);
			h = 3 * h + 1;
		}

		g = new int[list.size()];
		for (int i = 0; i < g.length; i++) {
			g[i] = list.get(i);
		}

		// 配列の要素を逆順に取り出して引数gを指定
		for (int i = g.length - 1; i >= 0; i--) {
			insertionSort(a, n, g[i]);
		}

	}

}
