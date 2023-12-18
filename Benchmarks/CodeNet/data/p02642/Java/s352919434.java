import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		List<Boolean> ok = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
			ok.add(true);
		}

		Collections.sort(list);

		int ans = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list.get(j) % list.get(i) == 0) {
					if (list.get(j) == list.get(i)) {
						ok.set(i, false);
					}
					ok.set(j, false);
				}
			}
		}

		for (boolean flg : ok) {
			if (flg)
				ans++;
		}

		System.out.println(ans);
	}

}
