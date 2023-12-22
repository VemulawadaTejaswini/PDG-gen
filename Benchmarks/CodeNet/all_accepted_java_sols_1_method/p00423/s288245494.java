import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int sumA = 0;
			int sumB = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (a > b)
					sumA += a + b;
				else if (a < b)
					sumB += a + b;
				else {
					sumA += a;
					sumB += b;
				}
			}
			System.out.println(sumA + " " + sumB);
		}

		sc.close();
	}
}