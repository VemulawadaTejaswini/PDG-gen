import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0;i<N;++i){
			A[i] = sc.nextLong();
		}
		sc.close();
		long m = 0;
		long ans = 0;
		for(int i=N-1;i>=0;--i){
			m = max(A,i);
			if(m < A[i]) continue;
			ans += m - A[i];
		}
		System.out.println(ans);
	}
	private static long max(long[] A, int i){
		long m = 0;
		for(int j=0;j<i;++j){
			if(m<A[j]){
				m = A[j];
			}
		}
		return m;
	}
}

