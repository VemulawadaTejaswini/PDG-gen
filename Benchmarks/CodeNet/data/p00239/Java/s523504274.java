import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		String[] name = new String[1000];
		int[][] pqr = new int[1000][3];
		while ((n = in.nextInt()) != 0) {
			for (int i = 0; i < n; i++) {
				name[i] = in.next();
				pqr[i][0] = in.nextInt();
				pqr[i][1] = in.nextInt();
				pqr[i][2] = in.nextInt();
			}
			int P = in.nextInt();
			int Q = in.nextInt();
			int R = in.nextInt();
			int C = in.nextInt();
			boolean isNA = true;
			for (int i = 0; i < n; i++) {
				if (pqr[i][0] <= P && pqr[i][1] <= Q && pqr[i][2] <= R
						&& (pqr[i][0] + pqr[i][2]) * 4 + pqr[i][1] * 9 <= C) {
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