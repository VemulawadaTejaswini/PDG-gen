public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] X = new int[N][D];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}
		}

		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int k = i+1; k < N; k++) {
				int tmp = 0;
				for (int j = 0; j < D; j++) {
					tmp+= Math.pow(Math.abs(X[i][j] - X[k][j]),2);
				}
				if (Math.round(Math.sqrt(tmp)) == Math.sqrt(tmp)) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}