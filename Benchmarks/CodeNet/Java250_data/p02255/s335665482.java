import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		String[] inputValueAry = br.readLine().split(" ");
		int[] array = new int[inputValueAry.length];
		for (int i = 0; i < inputValueAry.length; i ++) {
			array[i] = Integer.parseInt(inputValueAry[i]);
		}
		insertionSort(array, number);
	}

	public static void insertionSort(int[] array, int number) {

		printArray(array);
		for (int i = 1; i < number; i ++) {
			int v = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > v) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = v;
			printArray(array);
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i ++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println("");
	}
}

