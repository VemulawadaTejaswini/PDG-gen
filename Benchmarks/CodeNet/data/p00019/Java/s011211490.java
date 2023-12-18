import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(fact(scanner.nextBigInteger()));
	}
	static BigInteger fact(BigInteger a){
		if(a.intValue() == 1){
			return BigInteger.ONE;
		}else{
			return (a.multiply( fact(a.add(BigInteger.ONE.negate()))));
		}
	}
}