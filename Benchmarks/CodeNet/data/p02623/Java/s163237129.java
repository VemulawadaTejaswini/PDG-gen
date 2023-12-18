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
		long cur = 0;
		int ai = 0;
		int bi = 0;
		while(ai < N || bi < M){
			if(ai < N && bi < M){
				if(A[ai] < B[bi]){
					if(cur + A[ai] <= K){
						cur += A[ai];
						++ai;
					}else{
						break;
					}
				}else{
					if(cur + B[bi] <= K){
						cur += B[bi];
						++bi;
					}else{
						break;
					}
				}
			}else if(ai < N){
				if(cur + A[ai] <= K){
					cur += A[ai];
					++ai;
				}else{
					break;
				}
			}else{ // bi < M
				if(cur + B[bi] <= K){
					cur += B[bi];
					++bi;
				}else{
					break;
				}				
			}
		}
//		System.out.println(ai+" "+bi+" "+cur);
		System.out.println(ai+bi);
	}
}
