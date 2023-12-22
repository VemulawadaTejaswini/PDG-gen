import java.util.*;

class Main {
	Scanner sc;
	int N, K, Q;
	int[] p;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		N = sc.nextInt();
		K = sc.nextInt();
		Q = sc.nextInt();
		p = new int[N+1];
		for (int i = 0; i < Q; i++) {
			int a = sc.nextInt();
			p[a]++;
		}
		for (int i = 1; i <= N; i++) {
			if (K-Q+p[i] > 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}