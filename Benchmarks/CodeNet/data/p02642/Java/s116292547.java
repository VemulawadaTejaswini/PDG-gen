import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			boolean flg = true;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (list.get(i) % list.get(j) == 0) {
						flg = false;
					}
				}
			}

			if (flg) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}