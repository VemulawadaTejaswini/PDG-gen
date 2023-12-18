import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int max = 0;
			int min = 1000;
			int sum = 0;
			int n = s.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				int k = s.nextInt();
				if (k > max) {
					max = k;
				}
				if (k < min) {
					min = k;
				}
				sum = sum + k;
			}
			int score = sum - max - min;
			System.out.println(score / (n - 2));
		}
	}
}