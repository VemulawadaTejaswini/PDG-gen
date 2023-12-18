import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			double ave = 0.0;
			double a = 0.0;
			double b;
			if (n == 0)
				break;
			int[] score = new int[n];
			for (int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
				ave = ave + score[i];
			}
			ave = ave / n;
			for (int j = 0; j < n; j++) {
				a = a + (score[j] - ave) * (score[j] - ave);
			}
			a = a / n;
			b = Math.sqrt(a);
			System.out.println(b);
		}
	}

}
