import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int time = sc.nextInt();
		int[] c = new int[n];
		int[] t = new int[n];
		int mincost = 1001;

		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (t[i] <= time) {
				if (c[i] <= mincost) {
					mincost = c[i];
				}
			}
		}

		if (mincost == 1001) {
			System.out.println("TLE");
		} else {
			System.out.println(mincost);
		}
	}
}