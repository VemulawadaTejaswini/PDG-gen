import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long mod = 1000000007;
		long[] A = new long[N];
		long sum = 0;
		for(int i = 0; i < N; i++){
			A[i] = sc.nextLong();
			sum += A[i];
			sum %= mod;
		}
		
		long ans = 0;
		
		//i について全探索する
		for(int i = 0; i < N; i++){
			//A[i+1] ... A[N] の値を更新する
			sum -= A[i];
			if(sum < 0) sum += mod;
			
			ans += A[i]*sum;
			ans %= mod;
		}
		
		System.out.println(ans);
	}
}