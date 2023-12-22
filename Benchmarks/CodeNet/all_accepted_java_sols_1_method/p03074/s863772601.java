import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		scn.nextLine();
		ArrayList<Integer> Inv = new ArrayList<Integer>();
		boolean is1 = true;
		int seq = 0;
		char[] str = scn.nextLine().toCharArray();
		for (int i = 0; i < N; i++) {
			char ch = str[i];
			if (is1) {
				if (ch == '0') {
					Inv.add(seq);
					seq = 1;
					is1 = false;
				} else {
					seq++;
				}
			} else {
				if (ch == '1') {
					Inv.add(seq);
					seq = 1;
					is1 = true;
				} else {
					seq++;
				}
			}
		}
		if (is1) {
			Inv.add(seq);
		} else {
			Inv.add(seq);
			Inv.add(0);
		}

		int L = Inv.size();
		int[] Lsum = new int[L + 1];
		for (int i = 0; i < L; i++) {
			Lsum[i + 1] = Lsum[i] + Inv.get(i);
		}
		int ans = 0;
		if (2 * K + 1 >= L) {
			ans = Lsum[L];
		} else {
			for (int i = 0; i < L; i += 2) {
				int r = Math.min(L-1, i + 2*K);
				ans = Math.max(ans, Lsum[r+1] - Lsum[i]);
			}
		}
		System.out.println(ans);
	}

}
