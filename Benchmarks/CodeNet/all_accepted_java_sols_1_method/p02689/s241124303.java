import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] array = new int[N];
		int[] arrayH = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			array[i] = 1;
		}

		for (int j = 0; j < N; j++) {
			arrayH[j] = sc.nextInt();
		}

		for (int k = 0; k < M; k++) {
			int X = sc.nextInt() - 1;
			int Y = sc.nextInt() - 1;
			if (arrayH[X] < arrayH[Y]) {
				array[X] = 0;
			} else if (arrayH[X] > arrayH[Y]) {
				array[Y] = 0;
			} else if (arrayH[X] == arrayH[Y]) {
				array[X] = 0;
				array[Y] = 0;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				count++;
			}
		}

		System.out.println(count);
	}

}