import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int a, b, p, x;

		HashMap<Integer, ArrayList> map = new HashMap<>();
		for (int i = 0; i < N - 1; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			if (!map.containsKey(a)) {
				ArrayList<Integer> list = new ArrayList<>();
				map.put(a, list);
			}
			map.get(a).add(b);

			if (!map.containsKey(b)) {
				ArrayList<Integer> list = new ArrayList<>();
				map.put(b, list);
			}
			map.get(b).add(a);
		}

		int[] score = new int[N];
		for (int i = 0; i < Q; i++) {
			p = scan.nextInt();
			x = scan.nextInt();
			score[p - 1] += x;
		}

		ArrayDeque<Integer> que = new ArrayDeque();
		que.offer(1);
		boolean[] visited = new boolean[N];

		while (!que.isEmpty()) {
			int tgt = que.poll();
			ArrayList<Integer> list = map.get(tgt);
			visited[tgt - 1] = true;
			for (int i = 0; i < list.size(); i++) {
				int next = list.get(i);
				if (!visited[next - 1]) {
					score[next - 1] += score[tgt - 1];
					que.offer(next);
				}
			}
		}

		// 結果の出力
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(score[i]).append(" ");
		}
		System.out.println(sb);
	}
}