
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();

		boolean MAP[][] = new boolean[N+1][N+1];
		for(int i = 0; i < M;i++) {
			int A = scn.nextInt(), B = scn.nextInt();
			MAP[A][B] = true;
			MAP[B][A] = true;
		}

		ArrayDeque<Integer> PQ = new ArrayDeque<Integer>();
		PQ.add(1);

		int[] ans = new int[N+1];
		ArrayList<Integer> remain = new ArrayList<Integer>();
		ArrayList<Integer> remain_buf = new ArrayList<Integer>();
		for(int i = 2;i <= N;i++) {
			remain.add(i);
		}
		while(!PQ.isEmpty()) {
			int now = PQ.poll();
			for(int i:remain) {
				if(MAP[now][i]) {
					ans[i] = now;
					PQ.add(i);
				}else {
					remain_buf.add(i);
				}
			}
			remain = new ArrayList<Integer>();
			remain.addAll(remain_buf);
			remain_buf = new ArrayList<Integer>();
		}

		System.out.println("Yes");
		for(int i = 2;i < N+1;i++) {
			System.out.println(ans[i]);
		}
	}

}
