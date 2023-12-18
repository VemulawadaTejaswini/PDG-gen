import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble(); int t = 0;
		for (double i=1; i<N; i++) {
	 		int C = (int) Math.floor((N-1)/i);
			if (C>0) t+=C;
		}
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}