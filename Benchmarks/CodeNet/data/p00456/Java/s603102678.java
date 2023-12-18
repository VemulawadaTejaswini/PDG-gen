import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int w[] = new int[10];
		int k[] = new int[10];
		int first, second, third;
		int sumW, sumK;

		for (int i = 0; i < 10; i++) {
			w[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			k[i] = scanner.nextInt();
		}
		
		first  = -1;
		second = -1;
		third  = -1;
		for (int i = 0; i < 10; i++) {
			if (first < 0 || w[first] < w[i]) {
				first = i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (i != first && (second < 0 || (0 <= second && w[second] < w[i]))) {
				second = i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (i != first && i != second && (third < 0 || (0 <= third && w[third] < w[i]))) {
				third = i;
			}
		}
		sumW = w[first] + w[second] + w[third];
		first  = -1;
		second = -1;
		third  = -1;
		for (int i = 0; i < 10; i++) {
			if (first < 0 || k[first] < k[i]) {
				first = i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (i != first && (second < 0 || (0 <= second && k[second] < k[i]))) {
				second = i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (i != first && i != second && (third < 0 || (0 <= third && k[third] < k[i]))) {
				third = i;
			}
		}
		sumK = k[first] + k[second] + k[third];
		System.out.println(sumW);
		System.out.println(sumK);
	}
}