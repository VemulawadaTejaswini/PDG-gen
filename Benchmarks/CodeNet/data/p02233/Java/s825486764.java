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
		f[0] = 1;
		f[1] = 1;
		if(f[n] != 0){
			f[n] = f[n-2] + f[n-1];
		}
		return f[n];
	}
}