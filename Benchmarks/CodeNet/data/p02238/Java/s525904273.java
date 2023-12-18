import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static int n;
	private static HashMap<Integer, List<Integer>> graph;
	private static Stack<Integer> stack;
	private static int time;
	private static int[][] timeRecorder;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		graph = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> vs = new ArrayList<>();
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				if (v != 0) {
					vs.add(v);
				}
			}
			graph.put(u, vs);
		}
		sc.close();

		stack = new Stack<>();
		time = 0;

		timeRecorder = new int[n][2];

		while (getStart() != null) {
			int start = getStart();
			stack.push(start);
			time++;
			timeRecorder[start - 1][0] = time;
			for (int key : graph.keySet()) {
				graph.get(key).removeIf(item -> item == start);
			}
			dfs(start);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(i + 1);
			System.out.print(" ");
			System.out.print(timeRecorder[i][0]);
			System.out.print(" ");
			System.out.print(timeRecorder[i][1]);
			System.out.print("\n");
		}
	}

	private static Integer getStart() {
		for (int i = 1; i <= n; i++) {
			if (graph.get(i).size() != 0) {
				return i;
			}
		}
		return null;
	}

	private static Integer getNext(int now) {
		int checkLength = graph.get(now).size();
		if (checkLength != 0) {
			return graph.get(now).get(0);
		} else {
			return null;
		}
	}

	private static void dfs(int now) {
		while(!stack.isEmpty()) {
			Integer next = getNext(now);
			if (next == null) {
				int finished = stack.pop();
				time++;
				timeRecorder[finished - 1][1] = time;
				return;
			} else {
				stack.push(next);
				time++;
				timeRecorder[next - 1][0] = time;
				for (int key : graph.keySet()) {
					graph.get(key).removeIf(item -> item == next);
				}
				dfs(next);
			}
		}
	}
}

class Stack<T> {
	private LinkedList<T> stack;
	public Stack() {
		stack = new LinkedList<>();
	}
	public void push(T item) {
		stack.addLast(item);
	}
	public T pop() {
		T ret = stack.getLast();
		stack.removeLast();
		return ret;
	}
	public T top() {
		return stack.getLast();
	}
	public boolean isEmpty() {
		return stack.size() == 0;
	}
}