import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[][] c = new int[11][500];

	static boolean[] u = new boolean[10];

	static void perm(int n, int sum) {
		c[n][sum]++;
		if (n > 9)
			return;
		for (int i = 0; i < 10; i++) {
			if (u[i])
				continue;
			u[i] = true;
			perm(n + 1, sum + (n + 1) * i);
			u[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
		Arrays.fill(u, false);
		for (int i = 0; i < 11; i++)
			Arrays.fill(c[i], 0);
		perm(0, 0);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			System.out.println(c[n][s]);
		}
	}
}