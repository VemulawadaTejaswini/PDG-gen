import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int ans = N;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int p = x[i] - x[j];
				int q = y[i] - y[j];
				int cnt = 0;
				for(int k = 0; k < N; k++) {
					for(int l = 0; l < N; l++) {
						if(k == l)
							continue;
						if(x[k]-x[l] == p && y[k]-y[l] == q)
							cnt++;
					}
				}
				ans = Math.min(ans, N-cnt);
			}
		}
		System.out.println(ans);
	}

}
