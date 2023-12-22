import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<List<Integer>> edge = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edge.get(a).add(b);
			edge.get(b).add(a);
		}
		sc.close();
		int[] ans = new int[n];
		Queue<Integer> s = new ArrayDeque<Integer>();
		s.offer(0);
		ans[0] = 0;
		while (s.size() > 0) {
			int x = s.poll();
			for (int i : edge.get(x)) {
				if (ans[i] == 0) {
					ans[i] = x + 1;
					s.add(i);
				}
			}
		}
		System.out.println("Yes");
		for (int i = 1; i < n; i++) {
			System.out.println(ans[i]);
		}
	}
}
