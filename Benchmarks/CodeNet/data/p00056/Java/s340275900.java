import java.util.Arrays;
import java.util.Scanner;


public class Main{
	static boolean[] isPrime = calcPrimes(50100);

	private static boolean[] calcPrimes(int n) {
		boolean[] result = new boolean[n];
		Arrays.fill(result, true);
		
		result[0] = false;
		for(int i = 0; i < result.length; i++) {
			if(result[i]) {
				for(int j = 2; (i + 1) * j < result.length; j++) {
					result[(i + 1) * j - 1] = false;
				}
			}
		}
		return result;
	}

	private static int goldbach(int n) {
		int result = 0;
		for(int i = 1; i <= n / 2; i++) if(isPrime[i-1] && isPrime[n-i-1]) result++;
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