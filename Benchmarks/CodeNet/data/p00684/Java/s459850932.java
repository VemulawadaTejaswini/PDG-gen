
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			l = sc.next() + "="; p = 0; ov = false;
			P v = exp();
			if(ov) System.out.println("overflow");
			else {
				if( v.s == 0 ) System.out.println(v.f);
				else if(v.f == 0) System.out.println(v.s + "i");
				else System.out.println(v.f + (v.s<0? ""+v.s: "+"+v.s) + "i");
			}
		}

	}
	boolean ov;

	String l; int p;
	char next() {
		return l.charAt(p++);
	}

	P exp() {
		P v1 = term();
//		debug("", v1.f, v1.s);
		char c = next();
		if( c == '=' || c == ')' ) { p--; return v1;}

		do {
			P v2 = term();
			if (c == '+' ) v1 = v1.add(v2);
			else v1 = v1.sub(v2);
			c = next();
		}while( c != '=' && c != ')' );
		p--;
		return v1;
	}

	P term() {
		P v1 = facter();
//		debug("", v1.f, v1.s);
		char c = next();
		if( c == '=' || c == ')' || c == '+' || c == '-' ) { p--; return v1;}

		do {
			P v2 = facter();
			v1 = v1.mult(v2);
			c = next();
		}while( c != '=' && c != ')' && c != '+' && c != '-' );
		p--;
		return v1;
	}

	P facter() {
		char c = next();
//		debug(p, c);
		if(c == 'i') return new P(0, 1);
		if(c == '(' || c == '=') { P v = exp(); p++; return v; }
		String v = "";
		while(c != '=' && c != '-' && c != '+' && c != '*' && c != ')') {
			v += c;
			c = next();
		}
		p--;
		if(v.length() > 6) {
			ov = true;
			return new P(0, 0);
		}
		return new P(Long.parseLong(v), 0);
	}

	long MAX = 10000;
	class P {
		long f, s;
		P(long f, long s) {
			this.f = f;
			this.s = s;
			ov |= max( abs(f), abs(s)) > MAX;
		}

		P add(P p) {
			return new P(f+p.f, s+p.s);
		}

		P sub(P p) {
			return new P(f-p.f, s-p.s);
		}

		P mult(P p) {
			return new P(f*p.f - s*p.s, f*p.s + p.f*s);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}