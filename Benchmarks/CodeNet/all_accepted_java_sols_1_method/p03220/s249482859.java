import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), ans = 0;
		double T = sc.nextDouble(), A = sc.nextDouble(), H[] = new double[N], min = Double.MAX_VALUE;
		for (int i = 0; i < N; ++i) {
			H[i] = sc.nextDouble();
			H[i] = T - H[i] * .006;
			if (Math.abs(A - H[i]) < min) {
				min = Math.abs(A - H[i]);
				ans = i + 1;
			}
		}
		sc.close();
		System.out.print(ans);
	}
}