import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long K = sc.nextLong();
		long[] aSum = new long[N+1];
		long[] bSum = new long[M+1];
		
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			aSum[i+1] = aSum[i] + A;
		}
		for(int i=0; i<M; i++) {
			int B = sc.nextInt();
			bSum[i+1] = bSum[i] + B;
		}
		
		int ans = 0;
		
		for(int i=0; i<=N; i++) {
			if(aSum[i]>K)
				continue;
			int index = Arrays.binarySearch(bSum, K-aSum[i]);
			if(index<0) {
				index = -index - 2;
			}
			ans = Math.max(ans, i+index);
		}
		
		System.out.println(ans);

		sc.close();
	}
}
