import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int m = sc.nextInt();

		HashMap<Integer, ArrayList<Integer>> list = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 1; i <= n; i++) {
			int totalItem = sc.nextInt();
			ArrayList<Integer> itemList = new ArrayList<Integer>();
			for (int j = 0; j < totalItem; j++) {
				itemList.add(sc.nextInt());
			}
			list.put(i, itemList);
		}

		int count = 0;
		int total = 0;
		for (int k = 0; k <= m; k++) {
			for (final int key : list.keySet()) {
				final ArrayList<Integer> likeItem = list.get(key);
				if (likeItem.contains(k)) {
					count++;
				}
			}
			if (count == n) {
				total++;
			}
			count = 0;
		}

		java.lang.System.out.println(total);

	}

}
