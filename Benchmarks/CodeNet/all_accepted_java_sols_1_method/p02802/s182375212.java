import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int ac = 0;
		int wa = 0;

		int[] isAC = new int[n + 1];
		int[] cntWA = new int[n + 1];

		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if ("WA".equals(s)) {
				if (isAC[p] == 0) {
					cntWA[p]++;
				}
			} else {
				isAC[p] = 1;
			}
		}

		for (int i = 1; i <= n; i++) {
			ac += isAC[i];
			if (isAC[i] == 1) {
				wa += cntWA[i];
			}
		}

		System.out.println(ac + " " + wa);

		sc.close();
	}

}

