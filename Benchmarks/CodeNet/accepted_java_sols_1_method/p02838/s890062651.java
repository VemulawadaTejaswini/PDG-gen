import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < A.length ; ++i){
			A[i] = sc.nextLong();
		}
		int bs[] = new int[61];
		for(int i = 0 ; i < A.length ; ++i){
			long a = A[i];
			for(int b = 0 ; b < bs.length ; ++b){
				if((a & (1L << b)) != 0){
					bs[b]++;
				}
			}			
		}
//		System.out.println(Arrays.toString(bs));
		long S = 0;
		long MOD = 1000000007L;
		for(int b = 0 ; b < bs.length ; ++b){
			long B1 = bs[b];
			long B0 = N - bs[b];
			long BN = (B0 * B1) % MOD; 
			BN = (BN * ((1L << b) % MOD) ) % MOD;
			S = (S + BN) % MOD;
//			System.out.println(BN);
		}
		System.out.println(S);
		/*
		for(int i = 0 ; i < A.length ; ++i){
			for(int j = 0 ; j < A.length ; ++j){
				System.out.println(Long.toBinaryString(A[i] ^ A[j]));
			}
			System.out.println();
		}
		*/
	}
}
