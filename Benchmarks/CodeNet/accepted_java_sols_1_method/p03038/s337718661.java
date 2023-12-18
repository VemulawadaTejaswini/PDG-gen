import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] A = new long[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		
		long[][] x = new long[M][2];
		
		for(int i = 0; i < M; i++) {
			x[i][0] = sc.nextLong();
			x[i][1] = sc.nextLong();
		}
		
		Arrays.sort(x, (a1, a2) -> Long.compare(a1[1], a2[1]));
		Arrays.sort(A);
		
		long[] ans = new long[N];
		int num = 0;
		
		for(int i = M - 1; i >= 0; i--) {
			while(x[i][0] >= 1 && num <= N - 1) {
				ans[num] = x[i][1];
				x[i][0]--;
				num++;
			}
			if(num > N - 1) {
				break;
			}
		}
		
		for(int i = N - 1; i >= 0; i--) {
			if(A[i] > ans[i]) {
				ans[i] = A[i];
			} else {
				break;
			}
		}
		
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += ans[i];
		}
		
		System.out.println(sum);
	}
}
