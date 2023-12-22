import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] X;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		X = new int[N];
		for (int i = 0; i < N; i++) X[i] = sc.nextInt();
		
		int m = Integer.MAX_VALUE;
		for (int p = 1; p < 101; p++) {
			int s = 0;
			for (int i = 0; i < N; i++)
				s += (X[i]-p)*(X[i]-p);
			m = Math.min(m, s);
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
