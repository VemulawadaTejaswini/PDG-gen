import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		List<List<Integer>> g = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			g.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; i++) {
			int v1 = in.nextInt();
			int v2 = in.nextInt();

			g.get(v1).add(v2);
			g.get(v2).add(v1);
		}

		for (int i = 0; i < g.size(); i++) {
			System.out.println(i + " " + g.get(i));
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			if (bfs(g, from, to)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	public static boolean bfs(List<List<Integer>> list, int from, int target) {
		boolean isFound = false;
		int[] d = new int[list.size()];
		Arrays.fill(d, -1);

		Deque<Integer> q = new ArrayDeque<Integer>();
		q.push(from);

		while (!q.isEmpty()) {
			int index = q.pop();
			d[index] = 1;
			for (int num : list.get(index)) {
				if (num == target) {
					isFound = true;
					return isFound;
				}
				if (d[num] == -1) {
					q.push(num);
				}
			}
		}
		return isFound;
	}
