import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int[] score = new int[n];
			int max = 0, min = 1000, sum = 0;
			for (int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
				sum += score[i];
				if (score[i] > max)
					max = score[i];
				if (score[i] < min)
					min = score[i];
			}

			System.out.println((sum - min - max) / (n - 2));
		}

	}
}