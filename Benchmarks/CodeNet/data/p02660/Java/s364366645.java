import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();

			List<Integer> factorPrimes = findPrimes((int)Math.sqrt(n)+1);
			//root nまでの素数を列挙
			for(int p : factorPrimes) {
//				System.out.println(p);
			}
			int count = 0;
			while( factorPrimes.size() > 0 ) {
				//find smallest prime number
				long p = factorPrimes.remove(0);
				
				if ( n % p == 0 ) {
					//bingo
					count++;
					n = n / p;
					int e = 2;
					while ( true ) {
						long z = (long)Math.pow(p, e);
						if ( n % z == 0) {
							count++;
							e++;
							n = n / z;
						}
						else {
							break;
						}
					}
				}
			}
			
			if ( n > 1 ) {
				//it is prime number;
				count++;
			}
			System.out.println(count);
		}
	}

	public static List<Integer> findPrimes(int n) {

		long[] primeCandidate = new long[n+1];

		List<Integer> primes = new ArrayList<>();

		for(int i = 2 ; i < n+1 ; i++ ) {
			if ( primeCandidate[i] == 0 ) {
				primes.add(i);
				int po = i*2;
				while (po <= n ) {
					primeCandidate[po] = 1;
					po += i;
				}
			}
		}
		
		return primes;

	}
}