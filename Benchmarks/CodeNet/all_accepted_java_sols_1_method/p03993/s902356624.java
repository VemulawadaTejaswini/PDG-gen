import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		boolean[] used = new boolean[n];

		List<Integer> aiList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int ai = scan.nextInt();
			aiList.add(ai - 1);
		}

		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				int ai = aiList.get(i);
				if (i == aiList.get(ai)) {
					ans++;
					used[ai] = true;
				}
			}
		}

		System.out.println(ans);

		scan.close();

	}

}
