import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0, temp, sorted, minimum, sum = 0, ans = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			sum = 0;
			ans = 0;
			int n = sc.nextInt();
			int[] score = new int[100];
			if (n == 0)
				break;
			for (i = 0; i < n; i++)
				score[i] = sc.nextInt();

			for (sorted = 0; sorted < n; sorted++) {
				minimum = sorted;
				for (i = sorted + 1; i < n; i++) {
					if (score[i] < score[minimum]) {
						minimum = i;
					}
				}
				temp = score[minimum];
				score[minimum] = score[sorted];
				score[sorted] = temp;
			}
			score[0] = 0;
			score[n - 1] = 0;
			for (i = 0; i < n; i++)
				sum += score[i];
			ans = sum / (n - 2);
			System.out.println(ans);
		}

	}
}