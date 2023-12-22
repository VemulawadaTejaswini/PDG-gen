import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int start = 0;	// Rの開始
		int end = 0;	// Lの次のRの位置

		int[] itg = new int[S.length()];

		while (start < S.length()) {
			int rl = start;		//	Rの次のLの位置
			for (; rl < S.length(); rl++) {
				if (S.charAt(rl) == 'L') {
					break;
				}
			}
			for (end = rl; end < S.length(); end++) {
				if (S.charAt(end) == 'R') {
					break;
				}
            }
			itg[rl] = (end - rl - 1) / 2 + (rl - start) / 2 + 1;	// end～rlの次の偶数離れ + rl～startの偶数離れ + 自分
			itg[rl - 1] = end - start - itg[rl];

			start = end;
		}

		for (int i : itg) {
			System.out.print(String.valueOf(i) + " ");
		}
		System.out.println();
	}
}