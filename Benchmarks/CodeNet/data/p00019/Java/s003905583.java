
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextInt(); // intだとオーバーフローする
		System.out.println(fact(n));
	}


	static long fact(long n) {
		// n! = 1          if (n==0)
		//    = n * (n-1)! otherwise
		// 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1 * 0! = 3 * 2 * 1 * 1
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}


	static long factorial(long n) {
		long p = 1;
		for(int i=1; i<=n; i++)
			p *= i;
		return p;
	}
}