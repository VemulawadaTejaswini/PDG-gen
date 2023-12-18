import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int add = scanner.nextInt();
		String temp = scanner.next();
		int length = temp.length();
		long mod = (long) (Math.pow(10, 9) + 7l);
		int amount = length + add;
		long[] powers = new long[amount + 1];
		powers[0] = 1l;
		for (int i = 0; i < powers.length - 1; i++) 
		    powers[i + 1] = powers[i] * 25 % mod;
		
		long[] factorial = new long[amount + 1];
		factorial[0] = 1l;
		for(int i = 0; i < factorial.length - 1; i++) 
			factorial[i + 1] = factorial[i] * (i + 1) % mod;
		
		long result = 1l;
		for(int i = 0; i < amount; i++) 
			result = result * 26 % mod;
		
		for(int i = 0; i < length; i++) {
			long temporal = powers[amount - i] * (factorial[amount] / factorial[amount - i] / factorial[i]) % mod;
			result -= temporal;
			while(result < 0)
				result += mod;
			result %= mod;
		}
		System.out.print(result);
	}
}
