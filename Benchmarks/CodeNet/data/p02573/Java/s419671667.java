import java.util.Scanner;

public class Main {

	static int MOD = 1000000007;

	public static void main(String[] args) {
		exec_1_1();

	}

	public static void exec_1_1() {

		try(var sc = new Scanner(System.in)) {

			int N = sc.nextInt();

			int M = sc.nextInt();

			int[] f = new int[N];


			for(int i=0; i<N; i++) f[i]=-1;

			for(int i=0; i<M; i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;

				if(f[a]>-1&&f[b]<0) {
					int swap = a;
					b = a;
					a = swap;
				}

				int rIdx = rootIdx(f, a);
				if(rIdx==rootIdx(f, b)) continue ;

				f[rIdx] += rootVal(f, b);
				f[b] = rIdx;
			}

			int min = 0;

			for(int i=0; i<N; i++) min = Math.min(min, f[i]);

			System.out.println(min*-1);
		}
	}


	public static int rootVal(int[] f, int x) {

		if(f[x]<0)return f[x];

		return rootVal(f, f[x]);

	}

	public static int rootIdx(int[] f, int x) {

		if(f[x]<0)return x;

		return rootIdx(f, f[x]);

	}
}