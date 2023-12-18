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
		long ans = 0;
		for(int i=1;i<N;++i){
			if(A[i]<A[i-1]){
				ans += A[i-1] - A[i];
				A[i] += A[i-1] - A[i];
				//System.out.println(A[i]);
			}
		}
		System.out.println(ans);
	}
}

