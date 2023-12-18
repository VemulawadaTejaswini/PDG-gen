import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[] ans = new int[n + 1];
		int n2 = (int) Math.sqrt(n);
		for (int x = 1; x <= n2; x++) {
			for (int y = x; y <= n2; y++) {
				for (int z = y; z <= n2; z++) {
					int v = x*x + y*y + z*z + x*y + y*z + z*x;
					if (v > n) {
						break;
					}
					int cnt = 0;
					if (x == y) {
						cnt++;
					}
					if (y == z) {
						cnt++;
					}
					if (cnt == 0) {
						ans[v] += 6;
					} else if (cnt == 1) {
						ans[v] += 3;
					} else {
						ans[v]++;
					}
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 1; i <= n; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}
}
