import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0044
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextInt()) {
			int n = sc.nextInt(), a, b;
			for (a = n - 1; !isPrime(a); a--) {}
			for (b = n + 1; !isPrime(b); b++) {}
			
			System.out.println(a + " " + b);
		}
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) 
			if (n % i == 0) return false;
		return n != 1;
	}	
}