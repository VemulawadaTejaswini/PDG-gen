import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] lr = new int[n][2];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int l = sc.nextInt();
			lr[i][0] = x - l;
			lr[i][1] = x + l;
		}

		Arrays.sort(lr, (a, b) -> Integer.compare(a[1], b[1]));
		int a = 1;
		int current = lr[0][1];
		for (int i = 1; i < n; i++) {
			if (lr[i][0] >= current) {
				a++;
				current = lr[i][1];
			}
		}

		System.out.println(a);
	}
}
