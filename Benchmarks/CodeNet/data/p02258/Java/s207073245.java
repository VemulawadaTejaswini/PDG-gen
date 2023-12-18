import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int number[] = new int[n];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			number[i] = x;
		}
		int max = number[1] - number[0];
		int min = number[0];
		for (int j = 1; j <= n - 1; j++) {
			for (int k = 0; k <= j - 1; k++) {
				if (min > number[k]) {
					min = number[k];
				}
				if (max < number[j] - min) {
					max = number[j] - min;
				}
				}
		}
		System.out.println(max);
	}
}
