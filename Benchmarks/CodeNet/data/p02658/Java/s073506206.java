
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
			if(A[i]==0) {
				System.out.println(0);
				return;
			}
		}

		BigDecimal sum = new BigDecimal(1); 

		for(int i=0; i < N; i++) {
			BigDecimal a = new BigDecimal(A[i]); 
			sum = sum.multiply(a);
		}


		BigDecimal max = new BigDecimal(1000000000000000000l);
		if(sum.compareTo(max) <= 0) {
			System.out.println(sum);
		}else {
			System.out.println(-1);
		}

	}
}

