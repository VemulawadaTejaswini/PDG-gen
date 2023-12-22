import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int t = sc.nextInt();

		int max = 1;

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			if (a > max) {
				max = a;
			}
		}

		int minPair = Math.max(max - 1 - (k - max), 0);
		System.out.println(minPair);

		sc.close();
	}

}
