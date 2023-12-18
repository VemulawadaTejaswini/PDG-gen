import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int maxA = 0;
		int minB = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > maxA) {
				maxA = a;
				minB = b;
			}
		}

		System.out.println(maxA + minB);
		sc.close();
	}

}
