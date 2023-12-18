import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static boolean isPrime(int x) {
		if (x == 1) { return  false;}
		if (x == 2) { return true;}
		if (x % 2==0) { return false;}
		for (int i = 3; i < x; i = i+2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static  void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int numOfList = sc.nextInt();

		int primes = 0;
		for (int i = 0; i < numOfList; i++) {
			int num = sc.nextInt();
			if (isPrime(num)) {
				primes++;
			}
		}
		System.out.println(primes);
	}
}