import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		final int MAX_SIZE = 100000;
		boolean[] sieve = new boolean[MAX_SIZE];
		sieve[0] = sieve[1] = true;
		int[] divisors = new int[n + 2];
		for(int i = 0; i < n + 2; ++i){ divisors[i] = 1; }
		int fixed = 0;
		for(int i = 2; i < MAX_SIZE; ++i){
			if(sieve[i]){ continue; }
			primes.add(i);
			for(int j = i; j < MAX_SIZE; j += i){
				if(j < n + 2 && divisors[j] == 1){
					++fixed;
					divisors[j] = i;
				}
				sieve[j] = true;
			}
			if(fixed >= n){ break; }
		}
		BigInteger base = BigInteger.valueOf(1);
		for(int i = 0; i < primes.size(); ++i){
			int p = primes.get(i).intValue();
			base = base.multiply(BigInteger.valueOf(p));
		}
		base = base.add(BigInteger.valueOf(2));
		System.out.println(base.toString(10));
		for(int i = 2; i < divisors.length; ++i){
			System.out.println(divisors[i]);
		}
	}
}