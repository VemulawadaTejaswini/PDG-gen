import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), x = sc.nextInt();
		long[] a = new long[N];
		long[] b = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[N - 1 - i] = a[i];
		}
		long ans = 0;
		for(int i = 0; i + 1 < N; i++) {
			if(a[i] + a[i + 1] > x) {
				long minus = a[i + 1] + a[i] - x;
				ans += Math.max(minus, 0);
				if(minus <= 0) continue;
				a[i + 1] = Math.max(a[i + 1] - minus, 0);
				minus -= a[i + 1];
				if(minus > 0) {
					a[i] -= minus;
				}
			}
		}

		long ansB = 0;
		for(int i = 0; i + 1 < N; i++) {
			if(b[i] + b[i + 1] > x) {
				long minus = b[i + 1] + b[i] - x;
				ansB += Math.max(minus, 0);
				if(minus <= 0) continue;
				b[i + 1] = Math.max(b[i + 1] - minus, 0);
				minus -= b[i + 1];
				if(minus > 0) {
					b[i] -= minus;
				}
			}
		}
		System.out.println(Math.min(ans, ansB));
	}
}