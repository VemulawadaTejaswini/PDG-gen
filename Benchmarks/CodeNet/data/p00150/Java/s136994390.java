import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean[] isPrime = Sieve.isPrimeArray(10000);
		int[] max = new int[10001];
		int x = 0;
		for(int i=5;i<=10000;i++) {
			if (isPrime[i] && isPrime[i-2]) {
				x = i;
			}
			max[i] = x;
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println((max[n]-2) + " " + max[n]);
		}
	}

}
class Sieve {
	public static boolean[] isPrimeArray(int max) {
		boolean[] isPrime = new boolean[max+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2;i*i<=max;i++) {
			if (isPrime[i]) {
				int j = i * 2;
				while(j<=max) {
					isPrime[j] = false;
					j += i;
				}
			}
		}
		return isPrime;
	}
}