import java.util.*;
import java.lang.*;
import java.io.*;

class Program {
	public static long modpow(long a, long b, long m) {
		long ret = 1;
		while(b > 0) {
			if((b & 1) == 1) ret = ret * a % m;
			a = a * a % m;
			b >>= 1;
		}
		return ret;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(modpow(a, b, 1000000007));
	}
}