import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger dogs = new BigInteger(String.valueOf(sc.next()));
		BigInteger[] results;
		StringBuilder result = new StringBuilder("");

		results = dogs.divideAndRemainder(new BigInteger("1"));
		while(results[0].compareTo(new BigInteger("0")) != 0) {
			dogs = dogs.subtract(new BigInteger("1"));
			results = dogs.divideAndRemainder(new BigInteger("26"));
			dogs = results[0];
			result.insert(0,(char)('a' + (char)results[1].intValue()));
		}

		System.out.println(result.toString());

	}

}