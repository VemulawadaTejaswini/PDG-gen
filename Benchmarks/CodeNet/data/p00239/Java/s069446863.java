import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		String[] name = new String[10000];
		int[] p = new int[10000];
		int[] q = new int[10000];
		int[] r = new int[10000];
		while ((n = in.nextInt()) != 0) {
			for (int i = 0; i < n; i++) {
				name[i] = in.next();
				p[i] = in.nextInt();
				q[i] = in.nextInt();
				r[i] = in.nextInt();
			}
			int P = in.nextInt();
			int Q = in.nextInt();
			int R = in.nextInt();
			int C = in.nextInt();
			boolean isNA = true;
			for (int i = 0; i < n; i++) {
				if (p[i] <= P && q[i] <= Q && r[i] <= R
						&& (p[i] + r[i]) * 4 + q[i] * 9 <= C) {
					System.out.println(name[i]);
					isNA = isNA && false;
				}
			}
			if (isNA) {
				System.out.println("NA");
			}
		}
	}
}