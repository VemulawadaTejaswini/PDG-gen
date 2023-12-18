import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}
			int n = 1;
			int sum = 0;
			while (x <= Math.pow(10, n)) {
				int d = x % (int) Math.pow(10, n);
				sum += d / (int) Math.pow(10, n - 1);
				x -= d;
				n++;
			}
			System.out.printf("%d", sum);
		}
	}
}