import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
      	int factorAmount = scanner.nextInt();
      	long[] factors = new long[factorAmount];
      	for(int i = 0; i < factorAmount; i++) {
      		factors[i] = scanner.nextLong(); 
      	}
      	
      		System.out.print(Calculate(factors));
	}
	
	private static BigInteger Calculate(long[] numbers) {
		for(int i = 0; i < numbers.length; i++) 
      		if(numbers[i] == 0l)
      			return  BigInteger.ZERO;
      	
      	BigInteger result = BigInteger.ONE;
      	BigInteger limit = BigInteger.valueOf((long)Math.pow(10, 18));
      	for(int i = 0; i < numbers.length; i++) {
      		result = result.multiply(BigInteger.valueOf(numbers[i]));
     		if (result.min(limit) == limit && !result.equals(limit))
      		    return BigInteger.valueOf(-1); 
     		
      	}
      	
		return result;
	}
}
