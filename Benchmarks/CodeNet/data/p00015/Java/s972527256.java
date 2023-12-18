import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		for(int i = 0;i<n;i++){
			String inputBigInt1 = stdIn.next();
			String inputBigInt2 = stdIn.next();
			if(inputBigInt1.length() >= 80 | inputBigInt2.length() >= 80){
				System.out.println("overflow");
				break;
			}
			BigInteger bigInt1 = new BigInteger(inputBigInt1);
			BigInteger bigInt2 = new BigInteger(inputBigInt2);
			BigInteger sumBigInt = bigInt1.add(bigInt2);
			if(sumBigInt.toString().length() >= 80){
				System.out.println("overflow");
				break;
			}
			System.out.println(sumBigInt);
		}
	}
}