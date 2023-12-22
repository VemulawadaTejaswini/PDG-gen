import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];

		long x = 0L;

		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextLong();
			x = x^a[i];
		}

		String[] s = new String[n];
		for ( int i=0; i<n; i++ ) {
			s[i] = String.valueOf(x^a[i]);
		}

		System.out.println(String.join(" ", s));
	}
}
