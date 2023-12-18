import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ans = 0;
		
		if(K==0) System.out.println(N*N);
		else{
			for(long i=K+1;i<=N;++i){
				long max = N/i;
				ans += (i-K)*max;
				if(N-max*i>=K) ans += N-max*i-K+1;
			}
			System.out.println(ans);
		}
		return;
	}
}