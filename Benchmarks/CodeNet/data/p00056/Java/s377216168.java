import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0056
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int n = sc.nextInt();
			HashSet<Integer> hi = new HashSet<Integer>();
			for (int i = 1; i < n; i++) 
				if (isPrime(i) && isPrime(n - i)) 
					hi.add(min(i, n - i));
			
			System.out.println(hi.size());
		}
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) 
			if (n % i == 0) return false;
		return n != 1;
	}	
}