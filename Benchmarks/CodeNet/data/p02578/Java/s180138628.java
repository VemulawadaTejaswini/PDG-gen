import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int max = sc.nextInt();
		int ans = 0;
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			if (a < max) ans += max - a;
			max = Math.max(max, a);
		}

		System.out.println(ans);

		sc.close();

	}

}