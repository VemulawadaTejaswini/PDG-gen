import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main{
	static List<Integer> primes = findPrimes(25000);

	private static List<Integer> findPrimes(int n){
		boolean[] isPrime = new boolean[n];
		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		for(int i = 0; i < isPrime.length; i++){
			if(isPrime[i]){
				for(int j = 2; (i + 1) * j < isPrime.length; j++){
					isPrime[(i + 1) * j - 1] = false;
				}
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 1 - 1; i < isPrime.length; i++)
			if(isPrime[i]){
				result.add(i + 1);
			}
		return result;
	}

	private static int goldbach(int n) {
		int result = 0;
		for(int i = 0; primes.get(i) <= n / 2; i++) {
			if(primes.contains(n-primes.get(i))) {
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int in = sc.nextInt(); if(in == 0) break;
			System.out.println(goldbach(in));
		}
		sc.close();
	}
	
}