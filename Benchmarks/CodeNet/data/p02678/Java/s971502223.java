import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();

		boolean MAP[][] = new boolean[N][N];
		for(int i = 0; i < M;i++) {
			int A = scn.nextInt()-1, B = scn.nextInt()-1;
			MAP[A][B] = true;
			MAP[B][A] = true;
		}

		ArrayDeque<Integer> PQ = new ArrayDeque<Integer>();
		PQ.add(0);

		int[] ans = new int[N];
		ArrayList<Integer> remain = new ArrayList<Integer>();
		ArrayList<Integer> remain_buf = new ArrayList<Integer>();
		for(int i = 1;i < N;i++) {
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
			if(remain_buf.isEmpty())break;
			remain = new ArrayList<Integer>();
			remain.addAll(remain_buf);
			remain_buf = new ArrayList<Integer>();
		}

		System.out.println("Yes");
		for(int i = 1;i < N;i++) {
			System.out.println(ans[i]+1);
		}
	}

}
