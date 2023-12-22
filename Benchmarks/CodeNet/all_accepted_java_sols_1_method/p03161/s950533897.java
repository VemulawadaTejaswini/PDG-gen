
import java.util.Scanner;

public class Main {

	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] h = new int[N + 1];
		int[] d = new int[N + 1];
		for (int i=1; i <= N; i++) {
			h[i] = in.nextInt();
			d[i] = INF;
		}
		d[1] = 0;
		d[2] = Math.abs(h[2] - h[1]);
		for(int i=3; i<=N; i++) {
			for(int j=1; j<=K && i-j >= 1; j++) {
				d[i] = Math.min(d[i], d[i-j] + Math.abs(h[i-j]-h[i]));
			}
		}
		System.out.println(d[N]);
	}
}