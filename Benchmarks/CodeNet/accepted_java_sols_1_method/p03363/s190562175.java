import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] nums = new long[N];
		for(int i=0;i<N;++i){
			nums[i] = sc.nextLong();
		}
		long[] sum = new long[N+1];
		sum[0] = 0;
		for(int i=1;i<=N;++i){
			sum[i] += sum[i-1] + nums[i-1];
		}
		Arrays.sort(sum);
		
		long ans = 0;
		int p = 0;
		while(p<N){
			if(sum[p]==sum[p+1]){
				int delta = 1;
				ans += delta;
				while(p+1+delta<=N&&sum[p]==sum[p+1+delta]){
					delta++;
					ans += delta;
				}
				p += delta;
			}
			p++;
		}
		System.out.println(ans);
	}
}