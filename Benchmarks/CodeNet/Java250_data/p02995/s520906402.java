import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		System.out.println(solve(b,c,d)-solve(a-1,c,d));

	}
	static long gcd(long a,long b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	static long solve(long b,long c,long d) {
		long ret = b;
		long other = c*d/gcd(c,d);
		ret-= b/c;
		ret -= b/d;
		ret += b/other;
		return ret;
	}

}
