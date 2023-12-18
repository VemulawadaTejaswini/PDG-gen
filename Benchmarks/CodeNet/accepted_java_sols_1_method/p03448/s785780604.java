import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				for (int k = 0; k <= C; k++) {
					int sum = i * 500 + j * 100 + k * 50;
					if (sum == X) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
