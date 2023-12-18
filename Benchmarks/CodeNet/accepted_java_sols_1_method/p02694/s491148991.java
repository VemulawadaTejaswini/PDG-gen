import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		BigInteger x = sc.nextBigInteger();
		BigInteger a = new BigInteger("100");
		
		BigInteger val = new BigInteger("101");
		BigInteger div = new BigInteger("100");
		int c=0;
		while( x.compareTo(a) > 0) {
			c++;
			a = a.multiply(val).divide(div);
		}
		
		System.out.println(c);

	}

}

