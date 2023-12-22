import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int c= 0;
	    for(int i = 0; i < N; i++) {
	        long a = Long.parseLong(scanner.next());
	        int ad = getDigit(a);
	        c += ad;
	    }

        System.out.print(c);
	}

	public static int getDigit(long n) {
	    int c = 0;
		while (n % 2 == 0) {
	    	c++;
	    	n = n/2;
	    }
		return c;
	}
}
