import java.util.*;

public class Main {
	static int M2;
	public static void nextPrime(int M) {
	    while(!isPrime(M++));
	    M2 = M-1;
	}
	public static boolean isPrime(int n) {
	    for(int i = 2; i < n/2; i++) {
	        if(n % i == 0) return false;
	    }
	    return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		nextPrime(scn.nextInt());
		System.out.println(M2);
		scn.close();
	}
}