import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int N = scan.nextInt();
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = scan.nextInt();
		}
		Queue<Integer> q = new ArrayDeque<>();
		int ans = 0;
		int f = 0;

		q.add(X);

		for (int i = 1; 0 <= X-i && X+i <= 100; i++) {
			q.add(X-i);
			q.add(X+i);
		}

		while (f == 0) {
			ans = q.poll();
			f = judge(N, ans, p);
		}

		System.out.println(ans);
	}

	public static int judge(int N,int ans, int[] p) {
		int f = 1;

		for (int i = 0; i < N; i++) {
			if (ans == p[i]) {
				f--;
				break;
			}
		}

		return f;

	}

}