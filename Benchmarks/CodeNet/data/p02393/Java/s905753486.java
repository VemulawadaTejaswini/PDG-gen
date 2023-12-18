import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.start();

	}

	private void start() {
		int arrayLength = 3;
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[arrayLength];
		for (int i = 0; i < arrayLength; ++i) {
			num[i] = scanner.nextInt();
		}
		Arrays.sort(num);
		for (int i = 0; i < arrayLength; ++i) {
			System.out.print(num[i]);
			if (i < arrayLength - 1){
				System.out.print(" ");
				}

		}
		System.out.println();
	}
}