package aoj1;

import java.util.*;
public class Main {
	public static void main(String[] args) {
new Main().run();
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(; T-->0; ) {
			Parser parser = new Parser( sc.next() );
			System.out.println(parser.expr());
		}
	}
	
	class Parser {
		char s[];
		int p;
		Parser(String s) {
			this.s = s.toCharArray();
			this.p = 0;
		}
		
		int expr(){
			int r = term();
			for(;;) {
				if( s[p] == '+') {
					p++;
					int t = term();
					r += t;
				}
				else if( s[p] == '-') {
					p++;
					int t = term();
					r -= t;
				}
				else break;
			}
			return r;
		}
		int term() {
			int r = num();
			for(;;) {
				if( s[p] == '*') {
					p++;
					int t = num();
					r *= t;
				}
				else if( s[p] == '/') {
					p++;
					int t = num();
					r /= t;
				}
				else break;
			}
			return r;
		}
		int num() {
			if( s[p] == '(') {
				p++;
				int r = expr();
				p++;
				return r;
			}
			else {
				int r = 0;
				while( Character.isDigit(s[p]) ) {
					r = r * 10 + s[p] - '0';
					p++;
				}
				return r;
			}
		}
	}
}