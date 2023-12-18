import java.math.BigInteger;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			long[] a = new long[n];
			BigInteger ret = BigInteger.ONE;
			String x1 = "1000000000000000000";
			BigInteger x = new BigInteger(x1) ;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
				if(a[i]==0) {
					System.out.println(0);
					return;
				}
			}
			
			for(int i=0;i<n;i++) {
				ret = ret.multiply(BigInteger.valueOf(a[i]));
				if(ret.compareTo(x)==1) {
					System.out.println(-1);
					return;
				}
			}
			
			
			System.out.println(ret);
		}
		
	}
