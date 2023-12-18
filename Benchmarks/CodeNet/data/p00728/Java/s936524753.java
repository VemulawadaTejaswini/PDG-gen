import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 1;
		while (true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n == 0 || count > 20) {
				break;
			}

			// int[] score = new int[n];
			int max = 0, min = 1000, sum = 0;
			for (int i = 0; i < n; i++) {
				int score = sc.nextInt();
				sum += score;
				if (score > max)
					max = score;
				if (score < min)
					min = score;
			}

			System.out.println((sum - min - max) / (n - 2));
			count++;
		}

	}
}