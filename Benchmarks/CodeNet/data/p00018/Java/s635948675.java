import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		for (int i=0; i < 5; i++) {
			data[i] = sc.nextInt();
		}

		mergeSort(data, 0, 5);

		System.out.print(data[0]);
		for (int i=1; i < 5; i++) {
			System.out.print(" " + data[i]);
		}
		System.out.println();
	}

	public static void mergeSort(int[] array, int l, int r) {
		if (l+1 == r) return;

		int m = (l+r) / 2;
		mergeSort(array, l, m);
		mergeSort(array, m, r);
		merge(array, l, m, r);
	}

	private static void merge(int[] array, int l, int m, int r) {
		int[] sorted = new int[r-l];
		int i = l;
		int j = m;
		int k = 0;
		while ( k < r-l) {
			if (i == m) {
				sorted[k] = array[j];
				j++;
			} else if (j == r) {
				sorted[k] = array[i];
				i++;
			} else if (array[i] < array[j]) {
				sorted[k] = array[j];
				j++;
			} else {
				sorted[k] = array[i];
				i++;
			}
			k++;
		}

		for (int index=0; index < r-l; index++) {
			array[l+index] = sorted[index];
		}
	}
}