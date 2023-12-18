
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		selectionSort(array, n);
	}

	public static void selectionSort(int array[], int n) {
		int count = 0;
		int min;
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i; j < n; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(array, i, min);
				count++;
			}
		}
		printArray(array, n);
		System.out.println(count);
	}

	public static void printArray(int array[], int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(array[n - 1]);
	}

	public static void swap(int array[], int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}

