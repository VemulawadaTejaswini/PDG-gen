import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int z[];
		int wait[];
		Queue<Integer> g = new LinkedList<Integer>();

		z = new int[17];
		Arrays.fill(z, -1);
		wait = new int[101];
		for (int i = 0; i < 530; i++) {
			for (int j = 0; j < 17; j++) {
				if (i - z[j] * 5 == 17 * (z[j] % 2) + 3 * (z[j] % 3) + 19) {
					z[j] = -1;
				}
			}
			if (i % 5 == 0) {
				g.add(i / 5);
			}
			boolean flag = true;
			while (g.peek() != null && flag) {
				flag = false;
				int m = g.peek() % 5 == 1 ? 5 : 2;
				int l = g.peek();
				int index = 0;
				boolean flag2 = false;
				for (int j = 0; j < 17; j++) {
					flag2 = true;
					for (int k = 0; k < m; k++) {
						if (17 <= j + k || 0 <= z[j + k]) {
							flag2 = false;
						}
					}
					if (flag2) {
						index = j;
						break;
					}
				}
				if (flag2) {
					for (int j = 0; j < m; j++) {
						z[index + j] = l;
					}
					g.poll();
					flag = true;
				}
			}
			for (int x: g) {
				wait[x]++;
			}
			//			System.out.printf("%2d: ", i);
			//			for (int j = 0; j < 17; j++) {
			//				System.out.printf("%2d", z[j]);
			//			}
			//			for (int x: g) {
			//				System.out.printf("%2d", x);
			//			}
			//			System.out.println();
		}
		while (sc.hasNext()) {
			n = sc.nextInt();
			System.out.println(wait[n]);
		}
	}
}