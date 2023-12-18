
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();

		int[] hcnt = new int[h];
		int[] wcnt = new int[w];

		int[] wmat = new int[m];
		int[] hmat = new int[m];
		for (int i = 0; i < m; i++) {
			int hi = sc.nextInt() - 1;
			int wi = sc.nextInt() - 1;

			hcnt[hi]++;
			wcnt[wi]++;

			hmat[i] = hi;
			wmat[i] = wi;
		}

		int hmax = 0;
		List<Integer> hlist = new ArrayList<>();
		for (int i = 0; i < h; i++) {
			if (hmax <= hcnt[i]) {
				hmax = hcnt[i];
			}
		}
		for (int i = 0; i < h; i++) {
			if (hmax <= hcnt[i]) {
				hlist.add(i);
			}
		}

		int wmax = 0;
		List<Integer> wlist = new ArrayList<>();
		for (int i = 0; i < w; i++) {
			if (wmax <= wcnt[i]) {
				wmax = wcnt[i];
			}
		}
		for (int i = 0; i < w; i++) {
			if (wmax <= wcnt[i]) {
				wlist.add(i);
			}
		}

		boolean isExistBomb = true;
		roll: for (int i = 0; i < m; i++) {
			boolean isMatch = false;
			for (int hi : hlist) {
				for (int wi : wlist) {
					if (hmat[i] == hi && wmat[i] == wi) {
						isMatch = true;
						break;
					}
				}

			}
			if (!isMatch) {
				isExistBomb = false;
				break roll;
			}
		}
		System.out.println(hmax + wmax - (isExistBomb ? 1 : 0));
	}

}
