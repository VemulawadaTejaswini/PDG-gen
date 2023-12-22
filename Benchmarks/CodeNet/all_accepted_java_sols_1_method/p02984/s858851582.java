import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		long b = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			b += 2 * x[i] * Math.pow(-1, i);
		}


		b = b / 2;
		for (int i = 0; i < n; i++) {
			System.out.print(b);

			b = 2 * (x[i] - b / 2);
			
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
	}
}
