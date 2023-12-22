import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] p = new int[N];
		int idx;
		int wrongCnt = 0;
		int wrongIdx1 = 0;
		int wrongIdx2 = 0;
		for (idx = 0; idx < N; idx++) {
			p[idx] = Integer.parseInt(sc.next());
			if (p[idx] != (idx + 1)) {
				++wrongCnt;
				if (wrongCnt == 1) {
					wrongIdx1 = idx;
				} else if (wrongCnt == 2) {
					wrongIdx2 = idx;
				} else {
					break;
				}
			}
		}

		boolean flag = false;
		if (wrongCnt == 0) {
			flag = true;
		} else if (wrongCnt == 2) {
			if ((wrongIdx1 + 1) == p[wrongIdx2] && (wrongIdx2 + 1) == p[wrongIdx1]) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
