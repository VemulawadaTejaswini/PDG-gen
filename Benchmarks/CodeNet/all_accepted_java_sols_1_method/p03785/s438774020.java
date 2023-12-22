import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int T[] = new int[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
		}
		
		Arrays.sort(T);
		
		int ans = 0;
		int cnt = 0;
		int time = 0;
		for(int i = 0; i < N; i++) {
			if(cnt == 0) {
				time = T[i];
			}
			cnt++;
			if(cnt >= C || (i < N - 1 && T[i + 1] - time > K)) {
				cnt = 0;
				time = 0;
				ans++;
			}
		}
		if(cnt > 0) {
			ans++;
		}
		System.out.println(ans);
	}
}
