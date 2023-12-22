
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int[][] list = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				list[i][j] = scanner.nextInt();
			}
		}
		int[] list2 = new int[b];
		for (int i = 0; i < b; i++) {
			list2[i] = scanner.nextInt();
		}
		int sum;
		for (int i = 0; i < a; i++) {
			sum = 0;
			for (int j = 0; j < b; j++) {
				sum += list[i][j] * list2[j];
			}
			System.out.println(sum);
		}

	}
}