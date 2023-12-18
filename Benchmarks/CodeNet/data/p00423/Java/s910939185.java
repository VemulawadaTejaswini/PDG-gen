package tekitou;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;//??????
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
			}
			int scoreA = 0, scoreB = 0;
			for (int i = 0; i < a.length; i++) {
				int score = a[i] + b[i];
				if (a[i] == b[i]) {
					scoreA += score / 2;//?????????????????????1??????????????????
					scoreB += score / 2;
				} else {
					if (a[i] > b[i]) {
						scoreA += score;//A????????????
					} else {
						scoreB += score;//B????????????
					}
				}
			}
			System.out.println(scoreA + " " + scoreB);//??????
		}
		in.close();
	}
}