import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();

		for  (int i = n; i >= 0; i--) {
			for (int j = n - i; j >= 0; j--) {
				int k = n - i - j;
				int yen = 10000 * i + 5000 * j + 1000 * k;
				if (yen == y) {
					System.out.println(i + " "
							+ j + " "
							+ k);
					sc.close();
					return;
				}
			}
		}

		System.out.println("-1 -1 -1");

		sc.close();
	}
}
