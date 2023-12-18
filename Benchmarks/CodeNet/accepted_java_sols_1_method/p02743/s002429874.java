import java.math.BigInteger;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			BigInteger a = BigInteger.valueOf(A);
			BigInteger b = BigInteger.valueOf(B);
			BigInteger c = BigInteger.valueOf(C);
			
			BigInteger left = a.multiply(b).multiply(BigInteger.valueOf(4)); 
			BigInteger right = c.subtract(a).subtract(b);
			
			if(right.compareTo(BigInteger.ZERO)==-1) {
				System.out.println("No");
				return;
			}
			
			right = right.multiply(right);
			
			
			
			if(left.compareTo(right)==-1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	    }
				
	}
	
