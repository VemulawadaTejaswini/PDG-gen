import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int S = sc.nextInt();
			if ((n | S) == 0)
				break;
			int[] c = new int[101];
			for (int i = 0; i < n; i++) {
				c[sc.nextInt()]++;
			}
			int ans = 0;
			for (int i = 1; i < 101; i++) {
				for (int j = i; j < 101; j++) {
					if (i + j > S)
						if (i == j)
							ans += c[i] * (c[i] - 1) / 2;
						else
							ans += c[i] * c[j];
				}
			}
			System.out.println(ans);
		}
	}
}