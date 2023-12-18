import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C = sc.nextLong();
		long[] x = new long[N];
		long[] v = new long[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			v[i] = sc.nextInt();
		}
		long[][] a = new long[N+1][2];
		long[] amax = new long[N+1];
		long[][] b = new long[N+1][2];
		long[] bmax = new long[N+1];
		long ans = 0;
		for(int i = 0; i < N; i++) {
			a[i+1][1] = x[i];
			b[i+1][1] = C - x[N-1-i];
			a[i+1][0] = a[i][0] + v[i] - a[i+1][1] + a[i][1];
			b[i+1][0] = b[i][0] + v[N-1-i] - b[i+1][1] + b[i][1];
			amax[i+1] = Math.max(a[i+1][0], amax[i]);
			bmax[i+1] = Math.max(b[i+1][0], bmax[i]);
			ans = Math.max(ans, Math.max(a[i+1][0], b[i+1][0]));
		}
		for(int i = 0; i <= N; i++){
			ans = Math.max(ans, b[i][0] - b[i][1] + amax[N-i]);
			ans = Math.max(ans, a[i][0] - a[i][1] + bmax[N-i]);
		}
		System.out.println(ans);
	}

}
