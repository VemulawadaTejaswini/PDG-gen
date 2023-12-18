/**
 * 
 * AOJ No. 0014 Integral
 * 
 * @author 	yuichirw <y.iky917@gmail.com+>
 * @see		http://rose.u-aizu.ac.jp/onlinejudge/ProblemSet/description.jsp?id=0014&lang=jp
 */

import java.util.*;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int d;
	
	static boolean read() {
		if(!sc.hasNextInt()) return false;
		d = sc.nextInt();
		return true;
	}
	
	static int solve() {
		int ans,n;
		ans = 0; n = 600 / d;
		
		if(d == 600) return 216000000;
		for(int x = d; x < 600; x += d) {
			ans += d * ((x * x));
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}