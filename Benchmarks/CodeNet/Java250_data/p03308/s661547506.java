import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] ary = new long[n];
		
		for ( int i = 0; i < n; i++ ) {
			ary[i] = in.nextInt();
		}
		
		Arrays.sort(ary);
		solve(ary[0], ary[n-1]);
	}
	
	public static void solve(long a, long b) {
		System.out.println(Math.abs(a-b));
	}
}