import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);

			if (n == 0 && m == 0)
				break;

			ArrayList<Integer> tarou = new ArrayList<>();
			ArrayList<Integer> hanako = new ArrayList<>();

			int tarouSum = 0;
			int hanakoSum = 0;

			for (int i = 0; i < n; i++) {
				int num = Integer.parseInt(br.readLine());
				tarou.add(num);
				tarouSum += num;
			}

			for (int i = 0; i < m; i++) {
				int num = Integer.parseInt(br.readLine());
				hanako.add(num);
				hanakoSum += num;
			}

			// int diff = Math.max(tarouSum, hanakoSum) == tarouSum ? tarouSum - hanakoSum :
			// hanakoSum - tarouSum;

			ArrayList<Cards> ans = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int tSum = tarouSum - tarou.get(i);
					int hSum = hanakoSum + tarou.get(i);
					hSum -= hanako.get(j);
					tSum += hanako.get(j);
					if (hSum == tSum) {
						ans.add(new Cards(tarou.get(i), hanako.get(j)));

					}
				}
			}
			Collections.sort(ans);
			if (ans.size() != 0) {
				System.out.println(ans.get(0).t + " " + ans.get(0).h);
			} else {
				System.out.println(-1);
			}
		}
	}
}

class Cards implements Comparable<Cards> {

	int t;
	int h;

	public Cards(int t, int h) {
		this.t = t;
		this.h = h;
	}

	@Override
	public int compareTo(Cards o) {
		return (this.t + this.h) - (o.t + o.h);
	}
}
