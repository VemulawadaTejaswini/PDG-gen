
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[][] list = new int[a + 1][b + 1];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				list[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {
			int sum = 0;
			for (int j = 0; j < b; j++) {
				sum += list[i][j];
			}
			list[i][b] = sum;
		}
		for (int i = 0; i < b + 1; i++) {
			int sum = 0;
			for (int j = 0; j < a; j++) {
				sum += list[j][i];
			}
			list[a][i] = sum;

		}

		Arrays.stream(list).forEach(
				s -> System.out.print(Arrays.toString(s) + " " + "\n"));
	}
}