import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int sum = 0;
		int n = sc.nextInt();
		for (int cnt = 1; cnt <= n; cnt++) {
			// while (cnt == n) {
			int a = sc.nextInt();
			if (cnt == 1) {
				min = a;
				max = a;
				sum = a;
			} else if (a <= min) {
				min = a;
				sum = sum + a;
			} else if (a >= max) {
				max = a;
				sum = sum + a;
			} else {
				sum = sum + a;
			}
		}
		System.out.print(min + " " + max + " " + sum);
	}
}
