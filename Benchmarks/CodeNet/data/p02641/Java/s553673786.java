import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int p[] = new int[n];

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 1; i <= 100; i++) {
			boolean con = false;
			for (int j = 0; j < n; j++) {
				if (i == p[j]) con = true;
			}
			if (con) continue;
			if (Math.abs(x - i) < min) {
				min = Math.abs(x - i);
				ans = i;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
