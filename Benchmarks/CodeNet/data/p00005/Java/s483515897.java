import java.util.Scanner;

class Main {

    public static long euclid (long a, long b) {
	if (b == 0) {
	    return a;
	}
	else {
	    return euclid (b, a%b);
	}
    }
    
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	long a, b, G, L;

	while (scan.hasNext()) {
	    a = scan.nextLong();
	    b = scan.nextLong();

	    if (a < b) {
		long tmp = a;
		a = b;
		b = tmp;
	    }

	    G = euclid (a, b);
	    L = a*b/G;

	    System.out.println(G+" "+L);
	}
    }
}