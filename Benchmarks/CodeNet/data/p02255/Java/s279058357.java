import java.util.Scanner;

public class Main {
	public static void insertionSort(int[] array, int n) {
		int v, j;
		for (int i = 0; i < n; i++) {
			v = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > v) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = v;
			for (int k = 0; k < n; k++) {
				System.out.print(array[k]);
				if (k < n - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		insertionSort(array, n);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
