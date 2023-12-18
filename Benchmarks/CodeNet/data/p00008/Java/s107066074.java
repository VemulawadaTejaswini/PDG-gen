import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						int sum = i + j + k + l;
						if (sum == n) {
							ans++;
						}
					}
				}
			}
		}

		System.out.println(ans);

	}

}