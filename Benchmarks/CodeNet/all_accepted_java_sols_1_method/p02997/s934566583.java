import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int max = (n - 1) * (n - 2) / 2;
		if (k > max) {
			System.out.println(-1);
			return;
		}

		int m = n - 1 + max - k;
		System.out.println(m);
		for (int i = 2; i <= n; i++) {
			System.out.println("1 " + i);
		}

		int rem = max - k;
		for (int i = 2; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (rem > 0) {
					System.out.println(i + " " + j);
				}
				rem--;
			}
		}
	}
}
