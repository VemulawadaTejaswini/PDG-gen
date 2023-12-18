import java.util.*;
public class Main {

	public static long mod = 1000000007L ;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long g = 0L;	// goal
		long r = 0L;	// ruikei
		for ( int i=0; i<n; i++ ) {
			long a = sc.nextLong();

			long add1 = (a*r)%mod ;
			g = (g+add1)%mod ;
			r = (r+a)%mod ;
		}

		System.out.println(g);
	}
}