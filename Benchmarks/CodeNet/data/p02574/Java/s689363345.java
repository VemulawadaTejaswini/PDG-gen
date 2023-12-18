import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int gcd = sc.nextInt();
    	HashSet<Integer> primes = new HashSet<>();
    	int x = gcd;
    	for (int i = 2; i <= Math.sqrt(x); i++) {
    	    while (x % i == 0) {
    	        primes.add(i);
    	        x /= i;
    	    }
    	    if (x > 1) {
    	        primes.add(x);
    	    }
    	}
    	boolean isPair = true;
    	for (int i = 1; i < n; i++) {
    	    int y = sc.nextInt();
    	    gcd = getGCD(gcd, y);
    	    for (int j = 2; j <= Math.sqrt(y) && isPair; j++) {
    	        if (y % j == 0) {
    	            if (primes.contains(j)) {
    	                isPair = false;
    	                break;
    	            }
    	            primes.add(y);
    	            y /= j;
    	            while (y % j == 0) {
    	                y /= j;
    	            }
    	        }
    	    }
    	    if (isPair && y > 1) {
    	        if (primes.contains(y)) {
    	            isPair = false;
    	        } else {
    	            primes.add(y);
    	        }
    	    }
    	}
    	if (isPair) {
    	    System.out.println("pairwise coprime");
    	} else if (gcd == 1) {
    	    System.out.println("setwise coprime");
    	} else {
    	    System.out.println("not coprime");
    	}
    }
    
    static int getGCD(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return getGCD(y, x % y);
        }
    }
}
