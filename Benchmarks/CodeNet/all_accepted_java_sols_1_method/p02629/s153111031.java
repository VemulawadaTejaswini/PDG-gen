import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		int k = 1;
		long z = 26L;
		long d = 0L;
		while ( z < n ) {
			d = z;
			k++;
			z += (long)Math.pow(26, k);
		}

		long y = n - d - 1L;
		String alp = "abcdefghijklmnopqrstuvwxyz";

		String[] s = new String[k];
		for ( int i=k-1; i>=0; i-- ) {
			int c = (int)(y%26L);
			s[i] = alp.substring(c, c+1);

			y = y/26L;
		}
		System.out.println(String.join("", s));

	}
}
