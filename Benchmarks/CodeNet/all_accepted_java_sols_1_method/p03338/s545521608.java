

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String aaaa = sc.next();
		String X = "";
		String Y = "";
		HashSet<String> Xlist = new HashSet<>();
		HashSet<String> Ylist = new HashSet<>();
		;
		String[] Xarray;
		String[] Yarray;

		int ans = 0;
		int maxAns = 0;
		// aabbca →　aab  bca
		for (int i = 1; i < aaaa.length(); i++) {
			X = aaaa.substring(0, i);
			Y = aaaa.substring(i, aaaa.length());
			Xarray = X.split("");
			Yarray = Y.split("");

			for (String s : Xarray) {

				Xlist.add(s);
			}

			for (String s : Yarray) {

				Ylist.add(s);
			}

			for (String x : Xlist) {
				if (Ylist.contains(x)) {
					ans++;
				}
			}
			maxAns = Math.max(maxAns, ans);
			ans = 0;
			Xlist.clear();
			Ylist.clear();
		}

		System.out.println(maxAns);

	}

}
