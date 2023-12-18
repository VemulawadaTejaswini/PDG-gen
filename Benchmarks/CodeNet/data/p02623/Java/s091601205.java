import java.math.BigInteger;
import java.util.Scanner;

/**
 * 172 Beginner
 * C:Tsundoku
 */
public class Main {
	public static void main(String[] args){
		// input
		Scanner inData = new Scanner(System.in);

		// line1
		int N = inData.nextInt();
		int M = inData.nextInt();
		BigInteger K = inData.nextBigInteger();

		BigInteger[] A = new BigInteger[N];
		for(int i=0; i<N; i++) 	A[i] = inData.nextBigInteger();

		BigInteger[] B = new BigInteger[M];
		for(int i=0; i<M; i++) B[i] = inData.nextBigInteger();

		int max = N <= M ? M : N;

		BigInteger sum = new BigInteger("0");
		int cnt = 0;

		for (int i = 0; i < max; i++) {
			if (i < N && i < M) {
				if (A[i].compareTo(B[i]) <= 0) {
					sum = sum.add(A[i]);
					cnt++;
				} else {
					sum = sum.add(B[i]);
					cnt++;
				}
				if (sum.compareTo(K) > 0) {cnt--; break;}
				if (A[i].compareTo(B[i]) <= 0) {
					sum = sum.add(A[i]);
					cnt++;
				} else {
					sum = sum.add(B[i]);
					cnt++;
				}
				if (sum.compareTo(K) > 0) {cnt--; break;}
			} else {
				if (N < M) {
					sum = sum.add(B[i]);
					cnt++;
				} else {
					sum = sum.add(A[i]);
					cnt++;
				}
				if (sum.compareTo(K) > 0) {cnt--; break;}
			}
		}
		System.out.println(cnt);
		inData.close();
	}

}
