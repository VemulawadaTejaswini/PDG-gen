import java.util.*;
import java.lang.*;
import java.io.*;

class Program {
	public static int modpow(int a, int b, int m) {
		int ret = 1;
		while(b > 0) {
			if((b & 1) == 1) ret = (int)((long)ret * a % m);
			a = (int)((long)a * a % m);
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