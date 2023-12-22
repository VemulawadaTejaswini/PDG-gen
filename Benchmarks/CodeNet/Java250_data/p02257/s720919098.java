import java.io.InputStream;
import java.util.Scanner;

public class Main {
	private static boolean isPrime(int x) {

		// Eratosthenes sieve

		if (x == 1) { return  false;}
		if (x == 2) { return true;}
		if (x % 2==0) { return false;}

		for (int i = 3; i < Math.sqrt(x)+1; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrimes(InputStream ins) {
		Scanner sc = new Scanner(ins);
		int numOfList = sc.nextInt();

		int primes = 0;
		for (int i = 0; i < numOfList; i++) {
			int num = sc.nextInt();
			if (isPrime(num)) {
				primes++;
			}
		}
		return primes;
	}

	public static  void main (String[] args) throws Exception {
		int primes = countPrimes(System.in);
		System.out.println(primes);
	}
}