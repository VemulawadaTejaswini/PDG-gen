import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 判定用大きい数 */
	private static final int INF = Integer.MAX_VALUE >> 1;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			Room[] rooms = new Room[n + 1];
			IntStream.range(0, n + 1).forEach(i -> rooms[i] = new Room());
			IntStream.range(0, m).forEach(i -> {
				int a = scanner.nextInt(), b = scanner.nextInt();
				rooms[a].children.add(b);
				rooms[b].children.add(a);
			});
			rooms[1].depth = 0;
			solve(rooms, 1, 1);
			for (int i = 1; i < n + 1; i++) {
				if (rooms[i].depth >= INF) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
			IntStream.range(2, n + 1).map(i -> rooms[i].parent).forEach(System.out::println);
		}
	}

	/**
	 * 幅優先検索を実施
	 * 
	 * @param rooms  部屋の一覧
	 * @param parent 親の部屋番号
	 * @param child  子供の部屋番号
	 */
	private static void solve(Room[] rooms, final int parent, final int child) {
		if (parent == child) {
			for (Integer descendant : rooms[child].children) {
				solve(rooms, child, descendant);
			}
		} else if (rooms[child].depth > rooms[parent].depth + 1) {
			rooms[child].depth = rooms[parent].depth + 1;
			rooms[child].parent = parent;
			for (Integer descendant : rooms[child].children) {
				solve(rooms, child, descendant);
			}
		}
	}

	/**
	 * 各部屋を表すクラス
	 */
	private static class Room {
		/** 深さ */
		int depth = INF;
		/** 親 */
		int parent = 0;
		/** 子供のリスト */
		List<Integer> children = new ArrayList<>();
	}
}
