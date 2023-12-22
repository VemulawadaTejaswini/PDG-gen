import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int count = 0;

		for(int i = 0; i < n; i++) {

			array[i] = sc.nextInt();

		}

		for(int i = 1; i < n; i++) {

			for(int j = n - 1; j >= i; j--) {

				if(array[j - 1] > array[j]) {

					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					count++;
				}

			}

		}

		printArray(array);
		System.out.println(count);

	}

	static void printArray(int[] array) {

		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println(array[array.length - 1]);
	}

}
