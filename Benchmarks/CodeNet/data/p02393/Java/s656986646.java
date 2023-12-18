import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int array[] = { a, b, c };
		for (int k = 0; k < array.length - 1; k++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int x = array[i];
					array[i] = array[i + 1];
					array[i + 1] = x;
				}
			}
		}
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
		}

	}

}
