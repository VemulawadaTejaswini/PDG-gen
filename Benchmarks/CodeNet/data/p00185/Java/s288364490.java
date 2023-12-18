import static java.lang.Math.sqrt;

import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int n;
	static ArrayList<Integer> sieve = new ArrayList<Integer>();
	
	static boolean read() {
		n = sc.nextInt();
		return (n == 0) ? false : true;
	}
	
	static int solve() {
		int ans, lb, ub;
		
		ub = n;
		ans = 0;
		for(lb = 3; lb < ub; lb += 2) {
			ub = n - lb;
			if(isPrime(lb) && isPrime(ub)) ans++;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
	
	
	static boolean isPrime(int k) {
		if(k == 2) return true;
		boolean is_prime = true;;
		for(int i = 3; i <= sqrt(k); i += 2) {
			if(k % i == 0) {
				is_prime = false;
				break;
			}
		}
		return is_prime;
	}
}