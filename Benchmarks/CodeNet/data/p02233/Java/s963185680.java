import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] f = new long[n+1];

		System.out.println(Fib(n, f));

		scan.close();
		System.exit(0);
	}

	private static long Fib(int n, long[] f){
		if(n <= 1)
			return 1;
		if(f[n] != 0)
			return f[n];
		f[n] = Fib(n-2, f) + Fib(n-1, f);
		return f[n];
	}
}