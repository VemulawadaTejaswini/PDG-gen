
import java.util.Scanner;
import java.math.BigInteger;


class Main{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);

		int a,b,c,d;
		a = b = c = d = 0;

		if(input.hasNextInt())a = input.nextInt();
		if(input.hasNextInt())b = input.nextInt();	
		if(input.hasNextInt())c = input.nextInt();
		if(input.hasNextInt())d = input.nextInt();


		BigInteger A = BigInteger.valueOf(a);
		BigInteger B = BigInteger.valueOf(b);
		BigInteger max1 = A.multiply(BigInteger.valueOf(c));
		BigInteger max2 = A.multiply(BigInteger.valueOf(d));
		BigInteger max3 = B.multiply(BigInteger.valueOf(c));
		BigInteger max4 = B.multiply(BigInteger.valueOf(d));

		int ca = max1.compareTo(max2);
		int cb = max3.compareTo(max4);

		BigInteger f1,f2;
		if(ca>0)f1 = max1;
		else f1 = max2;
		if(cb>0)f2 = max3;
		else f2 = max4;

		int cf = f1.compareTo(f2);
		if(cf>0)System.out.println(f1);
		else System.out.println(f2);


		
	}
}