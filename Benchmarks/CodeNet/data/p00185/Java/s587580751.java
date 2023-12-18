import static java.lang.Math.sqrt;

import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int n;
	static ArrayList<Integer> sieve = new ArrayList<Integer>();
	
	static boolean read() {
		n = sc.nextInt();
		System.out.println(n);
		return (n == 0) ? false : true;
	}
	
	static long solve() {
		long ans = 0;
		int lst = 1000000;
		for(int i = 0; i < n; i++) {
			if(sieve.get(i) >= n) {
				lst = i + 1;
				break;
			}
		}
		
		for(int i = 0; i < lst; i++) {
			for(int j = i; j < lst; j++) {
				if(sieve.get(i) + sieve.get(j) == n) ans++;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		sieve = sieve(1000000); 
		while(read()) {
			System.out.println(solve());
		}
	}
	
	static ArrayList<Integer> sieve(int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		boolean is_prime;
		for(int i = 3; i <= k; i+=2) {
			is_prime = true;
			for(int j = 3; j <= sqrt(i); j+=2) {
				if(i%j == 0) {
					is_prime = false;
					break;
				}
			}
			if(is_prime) list.add(i);
		}
		return list;
	}


}