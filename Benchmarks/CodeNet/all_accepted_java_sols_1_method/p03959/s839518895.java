import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		int[] A = new int[N];
		
		for(int i=0; i<N; i++)
			T[i] = sc.nextInt();
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		long ans = 1;
		int idx = 0;
		for(; idx<N; idx++) {
			if(idx>0 && T[idx-1]==T[idx])
				ans = (ans * T[idx])%MOD;
			if(T[idx]==T[N-1])
				break;
		}
		
		if(T[idx]!=A[idx] || A[idx]!=A[0]) {
			System.out.println(0);
			sc.close();
			return;
		}
		idx++;
		
		for(; idx<N; idx++) {
			if(idx<N-1 && A[idx]==A[idx+1])
				ans = (ans * A[idx])%MOD;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
