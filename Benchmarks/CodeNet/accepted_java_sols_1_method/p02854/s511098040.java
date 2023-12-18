import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] sum = new long[N];	
		sum[0] = sc.nextLong();
		for(int i = 1; i < N; i++) {
			sum[i] = sum[i-1];
			sum[i] += sc.nextLong();
		}
		int cut = N-1;
		for(int i = 0; i < N; i++) {
			if(sum[i] >= sum[N-1]/2) {
				cut = i;
				break;
			}
		}
		long ans = 0;
		if(cut == 0)
			ans = sum[0]*2 - sum[N-1];
		else
			ans = Math.min(sum[cut]*2-sum[N-1], sum[N-1]-sum[cut-1]*2);
		System.out.println(ans);

	}

}