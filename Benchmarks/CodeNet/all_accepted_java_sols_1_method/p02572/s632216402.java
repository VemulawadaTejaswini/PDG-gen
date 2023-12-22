import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long MOD = 1000000007;
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();

		long ans = 0;
		
		for(int i=0; i<N; i++) {
			ans += A[i];
		}
		ans %= MOD;
		ans = (ans * ans)%MOD;
		for(int i=0; i<N; i++) {
			ans = (ans - (((long)A[i]*A[i])%MOD)+MOD)%MOD;
		}
		
		System.out.println(ans%2==0 ? ans/2 : (ans+MOD)/2);

		sc.close();
	}
}
