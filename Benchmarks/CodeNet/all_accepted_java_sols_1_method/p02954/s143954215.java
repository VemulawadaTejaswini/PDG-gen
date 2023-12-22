import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] S = scn.nextLine().toCharArray();
		int[] ans = new int[S.length];

		int r = 0;
		int l = 0;
		int R = -1;
		int L = -1;
		boolean isR = true;
		for (int i = 0; i < S.length; i++) {
			if (S[i] == 'R') {
				if (isR) {
					r++;
					if (r > 1) {
						ans[i - 1] = 0;
					}
				} else {
					ans[R] = (r + 1) / 2 + l / 2;
					ans[L] = r / 2 + (l + 1) / 2;
					r = 1;
					l = 0;
					isR = true;
				}
			} else {
				if (isR) {
					R = i - 1;
					L = i;
					isR = false;
					l = 1;
				} else {
					l++;
					ans[i] = 0;
				}
			}
		}
		ans[R] = (r + 1) / 2 + l / 2;
		ans[L] = r / 2 + (l + 1) / 2;
		for(int i = 0;i < S.length;i++) {
			System.out.print(((i==0)?"":" ") + ans[i]);
		}
	}

}
