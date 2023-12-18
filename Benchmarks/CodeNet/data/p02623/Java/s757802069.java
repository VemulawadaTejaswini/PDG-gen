import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int acnt = scn.nextInt();
			int bcnt = scn.nextInt();
			int min = scn.nextInt();
			List<Integer> alist = new ArrayList<>();
			List<Integer> blist = new ArrayList<>();
			for(int i=0; i<acnt; i++) {
				alist.add(scn.nextInt());
			}
			for(int i=0; i<bcnt; i++) {
				blist.add(scn.nextInt());
			}
			check(min, alist, blist);
		}
	}

	public static void check(int min, List<Integer> alist, List<Integer> blist) {
		int cnt = 0;
		Integer amin = alist.remove(0);
		Integer bmin = blist.remove(0);
		boolean isA = false;

		while(true) {
			// A,Bの小さい方
			if(amin == null && bmin == null) {
				//もう無い
				break;
			}
			if(amin != null) {
				isA = bmin == null || amin <= bmin;
			} else {
				isA = false;
			}

			int subMin = isA ? amin : bmin;
			if(min < subMin) {
				// 引けない
				break;
			}
			min -= subMin;
			cnt++;
			if(isA) {
				amin = !alist.isEmpty() ? alist.remove(0) : null;
			} else {
				bmin = !blist.isEmpty() ? blist.remove(0) : null;
			}
		}

		System.out.println(cnt);
	}
}
