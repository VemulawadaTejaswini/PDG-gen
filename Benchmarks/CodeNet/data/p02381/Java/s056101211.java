import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if(n==0) {
				break;
			}
			int[] score = new int[n];
			double average = 0;
			double total = 0;
			double a;
			double a2;
			for (int i = 0; i < n; i++) {
				score[i] = scanner.nextInt();
				total = total + score[i];
			}
			average = total / n;
			double totala = 0;
			for (int i = 0; i < n; i++) {
				totala = totala + Math.pow(score[i] - average, 2);
			}
			a2 = totala / (double)n;
			a = Math.sqrt(a2);
			System.out.printf("%.10f\n", a);
		}
	}

}
