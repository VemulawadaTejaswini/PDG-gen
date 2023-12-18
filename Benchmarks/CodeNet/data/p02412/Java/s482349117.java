import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<int[]> nxs = new ArrayList<>();

		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			if(n == 0) break;
			int[] nx = new int[] {n, x};
			nxs.add(nx);
		}
		sc.close();

		for (int[] nx : nxs) {
			int count = check(nx[0], nx[1]);
			System.out.println(count);
		}

	}

	private static int check(int n, int x) {

		if(n > x-3) n = x-3;

		int ans = 0;
		for (int i = 1; i <= n-2; i++) {
			for (int j = i+1; j <= n-1; j++) {
				for (int k = j+1; k <= n; k++) {
					if(i + j + k == x) ans++;
				}
			}
		}
		return ans;
	}
}