import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> pf = new ArrayList<Integer>();
	public static void main(String[] args) {
		primeFactorize( sc.nextInt() );
	}

	private static void primeFactorize(int nextInt) {
		int n = nextInt;
		int p = 2;

		while(n > 1 ) {

			for( p = 2; p <= Math.sqrt(n); p++) {
					if ( n % p == 0 ) {
						n /= p;
						pf.add(p);
						break;
					}
			}

			if (p * p > n) {
				pf.add(n);
				break;
			}
		}

		System.out.printf("%d:", nextInt);

			for (int i : pf) {
				System.out.printf(" %d", i);
			}
			System.out.println();
	}

}
