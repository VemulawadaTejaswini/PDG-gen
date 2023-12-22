import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			double ave = 0;
			int[] score = new int[n];
			for (int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
				ave += score[i];
			}
			ave /= n;
			double ans = 0;
			for (int i = 0; i < n; i++)
				ans += Math.pow(score[i] - ave, 2);
			ans /= n;
			System.out.println(Math.sqrt(ans));
		}

	}

}