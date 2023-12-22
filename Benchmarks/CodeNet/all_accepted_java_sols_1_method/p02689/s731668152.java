import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] H = new int[N];
		for (int i=0;i<N;i++) {
			H[i] = sc.nextInt();
		}
		int[] A = new int[M];
		int[] B = new int[M];
		boolean[] is_good = new boolean[N];
		Arrays.fill(is_good, true);
		for (int i=0;i<M;i++) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
			if (H[A[i]] <= H[B[i]]) is_good[A[i]] = false;
			if (H[B[i]] <= H[A[i]]) is_good[B[i]] = false;
		}


		int ans = 0;
		for (int i=0;i<N;i++) {
			if (is_good[i]) ans++;
		}
		System.out.println(ans);

	}
}