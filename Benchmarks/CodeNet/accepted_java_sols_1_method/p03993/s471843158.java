import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		List<Integer> aiList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int ai = scan.nextInt();
			aiList.add(ai - 1);
		}

		int ans = 0;
		boolean[] used = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (used[i]) continue;
			int ai = aiList.get(i);
			if (aiList.get(ai) == i) {
				ans++;
				used[ai] = true;
			}
		}

		System.out.println(ans);

		scan.close();

	}

}