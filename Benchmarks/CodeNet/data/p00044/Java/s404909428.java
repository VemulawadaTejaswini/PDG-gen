/**
 * 
 * @author 	yuichirw<y.iky917@gmail.com>
 * @see		http://rose.u-aizu.ac.jp/onlinejudge/ProblemSet/description.jsp?id=0044&lang=jp
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static int n;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		if(!sc.hasNextInt()) return false;
		n = sc.nextInt();
		return true;
	}
	
	static String solve() {
		ArrayList<Integer> primes = sieve(50000);
		int index = primes.indexOf(n);
		return "" + primes.get(index-1) + " " + primes.get(index+1);
		
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
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}