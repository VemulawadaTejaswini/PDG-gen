import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[3];
		for (int i = 0; i < 3; i++)
			array[i] = sc.nextInt();
		bubbleSort(array);
		System.out.print(array[0] + " " + array[1] + " " + array[2]);

	}

	static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j - 1] > array[j])
					swap(array, j - 1, j);
			}
		}
	}

}