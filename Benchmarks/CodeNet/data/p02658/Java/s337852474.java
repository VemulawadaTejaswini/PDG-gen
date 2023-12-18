import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String aa;
		BigInteger A[] = new BigInteger[N];
        BigInteger sum = BigInteger.valueOf(1);
        BigInteger sum1 = BigInteger.valueOf(1000000000000000000L);
        
        
		for(int i = 0; i<N; i++) {
			aa = sc.next();
			A[i] = new BigInteger(aa);
			sum = sum.multiply(A[i]);
			
		}
		
		if(sum.compareTo(sum1) == 1) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
		}
	}	
}