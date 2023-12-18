import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int t = scan.nextInt();
			int p = scan.nextInt();

			if (n == 0 && m == 0) {
				break;
			}

			ArrayList<ArrayList<Integer>> paper = new ArrayList<ArrayList<Integer>>();
			int hole = 0;

			for (int i = 0; i < m; i++) {
				ArrayList<Integer> array = new ArrayList<Integer>();
				for (int j = 0; j < n; j++) {
					array.add(1);
				}
				paper.add(array);
			}

			/*
			 * for (int pap = paper.size() - 1; pap >= 0; pap--) {
			 * System.out.println(paper.get(pap)); } System.out.println("");
			 */

			for (int i = 0; i < t; i++) {
				int d = scan.nextInt();
				int c = scan.nextInt();
				switch (d) {
				case 1:
					for (int j = 0; j < paper.size(); j++) {
						for (int k = 0; k < c; k++) {
							if (c >= paper.get(j).size()) {
								paper.get(j).add(paper.get(j).get(c - k - 1));
							} else {
								paper.get(j).set(c, paper.get(j).get(c) + paper.get(j).get(c - k - 1));
							}
							paper.get(j).remove(c - k - 1);
						}
					}
					break;
				case 2:
					for (int j = 0; j < c; j++) {
						if (c + j >= paper.size()) {
							paper.add(paper.get(c - j - 1));
						} else {
							for (int k = 0; k < paper.get(j).size(); k++) {
								paper.get(c).set(k, paper.get(c).get(k) + paper.get(c - j - 1).get(k));
							}
						}
						paper.remove(c - j - 1);
					}
					break;
				}
				/*
				 * for (int pap = paper.size() - 1; pap >= 0; pap--) {
				 * System.out.println(paper.get(pap)); } System.out.println("");
				 */
			}

			for (int i = 0; i < p; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				hole = paper.get(y).get(x);
				System.out.println(hole);
			}
			// System.out.println("next");
		}
		scan.close();
	}
}

