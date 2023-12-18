/**
 * 
 * AOJ No.0040 Affine Cipher
 * 
 * @author 	yuichirw <y.iky917@gmail.com>
 * @see		http://rose.u-aizu.ac.jp/onlinejudge/ProblemSet/description.jsp?id=0040&lang=jp
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static int n;
	static String line;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		if(!sc.hasNextLine()) return false; 
		line = sc.nextLine();
		return true;
	}
	
	static String solve() {
		int a = 1;
		while(true) {
			for(int b = 0; b <= 25; b++) {				
				if(a <= 26) {
					if(gcd(26, a) != 1) break;
				} else {
					if(gcd(a, 26) != 1) break;
				}
				
				char[] str = line.toCharArray();
				int r, f;
				for(int i = 0; i < str.length; i++) {
					if(str[i] == ' ') continue;
					r = str[i] - 'a';
					f = (a * r + b) % 26;
					str[i] = (char)(f + 'a');
				}
				
				String _str = new String(str);
				String[] parsed = _str.split(" ");
				for(int i = 0; i < parsed.length; i++) {
					if(parsed[i].equals("that") || parsed[i].equals("this")) {
						return _str;
					}
				}
			}
			a++;
		}
	}
	
	static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		n = sc.nextInt(); sc.nextLine();
		while(n-- > 0 && read()) {
			System.out.println(solve());
		}
	}
}