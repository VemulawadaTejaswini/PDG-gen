import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] b = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			b[i] = scanner.nextInt();
		}
		int sum = b[0] + b[n - 2];
		for (int i = 1; i < n - 1; i++) {
			sum += Math.min(b[i - 1], b[i]);
		}
		System.out.println(sum);
	}

}
