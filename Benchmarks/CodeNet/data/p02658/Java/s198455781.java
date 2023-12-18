import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		long[] a = new long[n];
		
		a[0] = stdIn.nextLong();
		
		
		long ans = a[0];
		
		BigInteger result = BigInteger.valueOf(a[0]);
		
		for(int i = 1; i < n; i++) {
			a[i] = stdIn.nextLong();
			if(a[0] == 0 || a[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		
		
		for(int i = 1; i < n; i++) {

			result = result.multiply(BigInteger.valueOf(a[i]));
			
			
			if(result.compareTo(BigInteger.valueOf((long)1e18)) ==1){
				System.out.println(-1);
				return;
			}
			
		}
		
		
		
		System.out.println(result);
		
		
		
	}

}
