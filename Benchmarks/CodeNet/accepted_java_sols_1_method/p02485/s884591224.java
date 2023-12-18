import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		String str, sum;
		
		while (true){
			str = scr.next();
			if (str.equals("0")) break;
			sum = "0";
			BigInteger bint = new BigInteger(str);
			BigInteger bsum = new BigInteger(sum);
			
			while (bint.compareTo(BigInteger.valueOf(0)) > 0){
				bsum = bsum.add(bint.remainder(BigInteger.valueOf(10)));
				bint = bint.divide(BigInteger.valueOf(10));
			}
			System.out.println(bsum);
		}
		scr.close();
	}
	
}