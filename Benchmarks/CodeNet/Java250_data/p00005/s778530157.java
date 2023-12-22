import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long n, m, k;

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			n = in.nextInt();
			m = in.nextInt();

			k=Math.max(n, m);
			m=Math.min(n, m);
			n=k;
				
			System.out.println(gcd(n, m) + " "
					+ (n * m) / gcd(n, m));
		}
	}

	private static long gcd(long n,long m){

		if(m==0) return n;
		else return gcd(m, n%m);
		
	}

}