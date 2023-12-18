import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int a;
		int b;
		int sumA, sumB;
		
		while (num != 0) {
			sumA = 0;
			sumB = 0;
			for (int i = 0; i < num; i++) {
				a = scanner.nextInt();
				b = scanner.nextInt();
				if (a < b) {
					sumB += (a + b);
				} else if (a > b) {
					sumA += (a + b);
				} else {
					sumA += a;
					sumB += b;
				}
			}
			System.out.println(sumA + " " + sumB);
			num = scanner.nextInt();
		}

	}
}