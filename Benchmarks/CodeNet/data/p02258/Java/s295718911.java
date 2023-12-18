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
		int min = number[0];
		int max = number[1] - number[0];
		for (int i = 1; i < n; i++) {
			if (max < number[i] - min) {
				max = number[i] - min;
			}
			if (min > number[i]) {
				min = number[i];
			}
		}
		System.out.println(max);
	}
}
