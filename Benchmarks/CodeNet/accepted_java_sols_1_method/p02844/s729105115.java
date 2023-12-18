import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N, ans = 0;
		String[] S;

		Scanner in = new Scanner(System.in);
		List<String> ph1 = new ArrayList<String>();
		List<String> ph2 = new ArrayList<String>();
		List<String> ph3 = new ArrayList<String>();
		N = Integer.parseInt(in.next());
		S = in.next().split("");

		for (int i = 0; i < N - 2; i++) {
			if (ph1.contains(S[i])) {
				continue;
			}
			ph1.add(S[i]);
			for (int j = i + 1; j < N - 1; j++) {
				if (ph2.contains(S[j])) {
					continue;
				}
				ph2.add(S[j]);
				for (int k = j + 1; k < N; k++) {
					if (ph3.contains(S[k])) {
						continue;
					}
					ph3.add(S[k]);
					ans++;
				}
				ph3.clear();
			}
			ph2.clear();
		}

		System.out.println(ans);
	}
}
