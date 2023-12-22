import java.util.Scanner;

class Main {
	static int R,G,B,N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		G = sc.nextInt();
		B = sc.nextInt();
		N = sc.nextInt();

		int count = 0;

		for (int i = 0; i <= N; ) {
			for (int j = 0; j <= N; ) {
				int t = i + j;
				if ( t > N) {
					break;
				}
				int tmp = N - (i + j);
				if (tmp >= 0 && tmp % B == 0) {
					count++;
				}
				j += G;
			}
			i += R;
		}
		System.out.println(count);
	}
}
