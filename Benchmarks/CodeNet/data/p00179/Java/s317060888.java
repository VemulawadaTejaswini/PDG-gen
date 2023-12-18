import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Queue<Q> queue = new LinkedList<Q>();
	static LinkedList<String> list = new LinkedList<String>();
	static int min;

	static class Q {
		StringBuffer bug;
		int n;

		Q(StringBuffer bug, int n) {
			this.bug = new StringBuffer(bug);
			this.n = n;
		}
	}

	public static void f() {
		while (!queue.isEmpty() && min == -1) {
			Q q = queue.poll();
			g(q.bug, q.n);
		}
	}

	public static void g(StringBuffer bug, int n) {
		if (list.contains(bug.toString())) {
			return ;
		}
		if (check(bug)) {
			min = n;
			return ;
		}
		list.add(bug.toString());
		for (int i = 0; i < bug.length() - 1; i++) {
			StringBuffer bug2 = new StringBuffer(bug);
			if (bug2.charAt(i) != bug2.charAt(i + 1)) {
				int a = 6 - Integer.valueOf(bug2.charAt(i)) - Integer.valueOf(bug2.charAt(i + 1)) + 2 * '0';
				bug2.replace(i, i + 1, Integer.toString(a));
				bug2.replace(i + 1, i + 2, Integer.toString(a));
				queue.add(new Q(bug2, n + 1));
			}
		}
	}

	public static boolean check(StringBuffer bug) {
		for (int i = 0; i < bug.length() - 1; i++) {
			if (bug.charAt(i) != bug.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static String remakeString(StringBuffer bug) {
		String bug2 = "";

		for (int i = 0; i < bug.length(); i++) {
			int a = bug.charAt(i);
			if (a == 'r') {
				bug2 += "1";
			} else if (a == 'g') {
				bug2 += "2";
			} else if (a == 'b') {
				bug2 += "3";
			}
		}

		return bug2;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuffer bug;

		while (true) {
			bug = new StringBuffer(sc.next());
			if (bug.toString().equals("0")) {
				break;
			}
			queue.clear();
			list.clear();
			min = -1;
			bug = new StringBuffer(remakeString(bug));
			queue.add(new Q(bug, 0));
			f();

			if (min != -1) {
				System.out.println(min);
			} else {
				System.out.println("NA");
			}
		}
	}
}