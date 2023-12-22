import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp = m / n;
		if (n == 1) {
			System.out.println(m);
			return;
		}
		for (int i = temp; i >= 1; i--) {
			if (m % i == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
