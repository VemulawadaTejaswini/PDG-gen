import java.util.Scanner;

public class Main {

	private static int N, K;
	private static int a[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int l = 0, h = 1000000000;
		while (l + 1 < h) {
			int m = (l + h) / 2;
			if (check(m))
				h = m;
			else
				l = m;
		}
		System.out.println(++l);
	}

	public static boolean check(int P) {
		int i=0,truck =0;
		while (i < N && truck < K) {
			for (int sum = 0; i < N && sum + a[i] <= P; i++) {
				sum += a[i];
			}
			truck++;
		}
		return i==N;
	}
}
