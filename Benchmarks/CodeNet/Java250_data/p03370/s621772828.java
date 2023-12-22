import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int min = 1000;
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (m < min) {
				min = m;
			}
			x -= m;
		}
		int div = x / min;
		System.out.println(n + div);
	}
}