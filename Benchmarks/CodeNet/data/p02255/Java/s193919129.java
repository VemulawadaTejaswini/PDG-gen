import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int row = stdIn.nextInt();
		int[] numbers = new int[row];

		for (int i = 0; i < row; i++) {
			numbers[i] = stdIn.nextInt();
		}

		insertionSort(numbers, row);

	}

	static void insertionSort(int[] numbers, int row) {
		int j;
		int tmp;

		for (int i = 1; i < row; i++) {
			for (int k = 0; k < row - 1; k++) {
				System.out.print(numbers[k] + " ");
			}
			System.out.println(numbers[row - 1]);
			tmp = numbers[i];
			j = i - 1;
			while (j >= 0 && numbers[j] > tmp) {
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = tmp;
		}
		for (int k = 0; k < row - 1; k++) {
			System.out.print(numbers[k] + " ");
		}
		System.out.println(numbers[row - 1]);
	}
}