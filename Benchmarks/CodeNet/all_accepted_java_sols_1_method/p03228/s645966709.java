import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		int turn = 0;
		for (int i = 0; i < k; i++) {
			if (turn == 0) {
				a /= 2;
				b += a;
			} else {
				b /= 2;
				a += b;
			}

			turn ^= 1;
		}

		System.out.println(a + " " + b);

		sc.close();
	}

}
