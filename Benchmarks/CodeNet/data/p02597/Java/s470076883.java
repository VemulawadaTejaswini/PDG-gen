import java.util.Scanner;

public class Main {
	// Shojin
	static final long mod = 998244353;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String str = sc.next();
			int rCnt = 0;
			int[] wCnt = new int[n];
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == 'R') {
					rCnt++;
					if (i == 0) {
						wCnt[i] = 0;
					} else {
						wCnt[i] = wCnt[i - 1];
					}
				} else {
					if (i == 0) {
						wCnt[i] = 1;
					} else {
						wCnt[i] = wCnt[i - 1] + 1;
					}
				}
			}
			if (rCnt == 0 || rCnt == n) {
				System.out.println(0);
			} else {
				System.out.println(wCnt[rCnt - 1]);
			}

		}
	}
}