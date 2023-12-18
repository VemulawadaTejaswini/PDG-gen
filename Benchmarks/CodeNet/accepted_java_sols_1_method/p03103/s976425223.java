import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long A[][] = new long[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextLong();
			A[i][1] = sc.nextLong();
		}
		
		Arrays.sort(A, Comparator.comparingLong(o -> o[0]));
		int cnt = 0;
		long ans = 0;
		int c = 0;
		while(cnt < M) {
			if(cnt + A[c][1] < M) {
				cnt += A[c][1];
				ans += A[c][0] * A[c][1];
				c++;
			} else {
				ans += A[c][0] * (M - cnt);
				break;
			}
			//System.out.println(ans);
		}
		System.out.println(ans);
	}
}
