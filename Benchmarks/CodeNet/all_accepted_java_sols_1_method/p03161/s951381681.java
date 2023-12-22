public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; H[i++] = sc.nextInt())
			;
		int[] C = new int[N];
		for (int i = 0; i < N; C[i++] = Integer.MAX_VALUE)
			;
		C[0] = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= K; j++) {
				if (i + j < N) {
					C[i + j] = Math.min(C[i + j], C[i] + Math.abs(H[i] - H[i + j]));
				}
			}
		}
		System.out.println(C[N - 1]);

	}
}
