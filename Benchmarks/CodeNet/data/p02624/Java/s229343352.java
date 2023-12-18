import java.math.BigInteger;
import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger total = BigInteger.valueOf(0);
		
		for(int i=1;i<=n;i++) {
			BigInteger sum = BigInteger.valueOf(0);
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					sum = sum.add(BigInteger.valueOf(1));
				}
			}
			total = total.add(sum.multiply(BigInteger.valueOf(i)));
		}
		System.out.println(total);
	}
}