import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void pr(Object o) {
		System.out.println(o);
	}

	int[][] t;

	int n;

	Stack<Integer> q;


	//HashMap<Integer,Integer> hash;//16進数でハッシュ。

	int getValue() {
		Queue<Integer> buki = new LinkedList<Integer>();
		buki.add(0);
		int sum = 0;

		//int hashkey=0;
		while(!q.isEmpty()){
			int a = q.pop();

			int min = Integer.MAX_VALUE;

			for (int b : buki) {
				min=Math.min(min,t[a][b]);
			}
			sum += min;
			buki.add(a);
		}
		q.addAll(buki);
		q.remove(0);
		return sum;
	}

	int min;

	public void search() {
		if (q.size() == n) {
			min = Math.min(min, getValue());
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!q.contains(i)) {
				q.push(i);
				search();
				q.pop();
			}
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			min=Integer.MAX_VALUE;
			if (n == 0) {
				break;
			}
			t = new int[n + 1][n + 1];
			for (int i = 1; i <= n; i++)
				for (int j = 0; j <= n; j++) {
					t[i][j] = sc.nextInt();
				}
			q = new Stack<Integer>();
			search();
			pr(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}