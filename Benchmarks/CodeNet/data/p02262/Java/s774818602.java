import java.util.Scanner;
import java.util.ArrayList;

// ALDS1_2_D
public class Main {
	static int cnt;
	void insertionSort(int[] array, int n, int g) {
		int v, j;
		for (int i = g; i < n; i++) {
			v = array[i]; j = i - g;
			while (j >= 0 && array[j] > v) {
				array[j+g] = array[j];
				j = j -g;
				cnt++;
				array[j+g] = v;
			}
		}
	}

	void shellSort(int[] array, int n) {
		cnt = 0;
		int m = 0;
		ArrayList<Integer> G = new ArrayList<Integer>();

		for (int i = 1; i < n + 1; i = 3*i+1) {
			G.add(i);
			m++;
		}
		for (int i = m - 1; i >= 0; i--) {
			insertionSort(array, n, G.get(i));
		}

		System.out.println(m);
		for (int i = m - 1; i >= 0; i--) {
			System.out.print(G.get(i));
			if (i > 0) System.out.print(" ");
		}
		System.out.println();
		System.out.println(cnt);
		for (int v : array)
			System.out.println(v);
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		shellSort(array, n);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
