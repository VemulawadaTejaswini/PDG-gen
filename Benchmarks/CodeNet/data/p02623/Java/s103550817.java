import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		long A[] = new long[N];
		long B[] = new long[M];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		for(int i = 0 ; i < M ; ++i){
			B[i] = sc.nextLong();
		}
		long ASum[] = new long[N + 1];
		long BSum[] = new long[M + 1];
		for(int i = 0 ; i < N ; ++i){
			ASum[i + 1] = ASum[i] + A[i];
		}
		for(int i = 0 ; i < M ; ++i){
			BSum[i + 1] = BSum[i] + B[i];
		}
//		System.out.println(Arrays.toString(ASum));
//		System.out.println(Arrays.toString(BSum));
		long ret = 0;
		for(int i = 0 ; i <= N ; ++i){
			if(ASum[i] > K){
				break;
			}
			long left = K - ASum[i];
			int ind = Arrays.binarySearch(BSum, left);
			if(ind >= 0){
				ret = Math.max(ret, i + ind);
			}else{
				ind = - ind - 1;
				ret = Math.max(ret, i + ind - 1);				
			}
		}
		System.out.println(ret);
	}
}
