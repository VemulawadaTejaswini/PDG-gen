import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner cin=new Scanner(System.in);
			long a=cin.nextLong();
			BigInteger sum,k;
			sum=BigInteger.ONE;
			for(int i=1;i<=a;++i) {
				k=cin.nextBigInteger();
				sum=sum.multiply(k);
			}
			BigInteger B=new BigInteger("1000000000000000000");
			if(sum.compareTo(B)==1) {
				System.out.println("-1");
			}
			else {
				System.out.println(sum);
			}
	}

}
