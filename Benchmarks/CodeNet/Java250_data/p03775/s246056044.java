import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    long N = Long.parseLong(scanner.next());
	    long max = (long)N;
	    int c = Integer.MAX_VALUE;
	    for (long i = 1; i <= max; i++) {
	        if ((N % i) == 0) {
	            long a = i;
	            long b = (long)N / i;
	            if (a > b) break;
	            int ad = getDigit(a);
	            int bd = getDigit(b);
	            int md = Math.max(ad, bd);
	            max = Math.max(a, b);
	            if (md < c) {
	                c = md;
	            }
	        } else {
	            max = N / i + 1;
	        }
	    }

        System.out.print(c);
	}

	public static int getDigit(long n) {
	    int c = 0;
		while (n >= 1)
	    {
			c++;
	        n = n/10;
	    }
		return c;
	}
}