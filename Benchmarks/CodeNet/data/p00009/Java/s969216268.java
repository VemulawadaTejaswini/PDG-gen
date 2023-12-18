import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SeiveOfEratosthenes.init(1000000L*1000000L);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(SeiveOfEratosthenes.countPrime(2, n));
		}
	}

}
class SeiveOfEratosthenes {
	private static long max_number;
	private static int max_number_sieve;
	private static boolean[] is_not_prime;
	private static ArrayList<Integer> prime = new ArrayList<Integer>();
	public static void init(long maxnum) {
		max_number = maxnum;
		max_number_sieve = (int) Math.sqrt(max_number);
		is_not_prime = new boolean[max_number_sieve+1];
		is_not_prime[0] = is_not_prime[1] = true;
		for(int i=2;i*i<=max_number_sieve;i++) {
			if (!is_not_prime[i]) {
				int j = 2;
				while(i*j<=max_number_sieve) {
					is_not_prime[i*j] = true;
					j++;
				}
			}
		}
		for(int i=2;i<=max_number_sieve;i++) {
			if(!is_not_prime[i]) {
				prime.add(i);
			}
		}
	}
	public static boolean isPrime(long n) {
		if (n>max_number) {
			return false;
		}
		if (n<=max_number_sieve) {
			return !is_not_prime[(int) n];
		}else{
			for(int p:prime) {
				if (n%p==0 && n!=p) {
					return false;
				}
			}
			return true;
		}
	}
	public static int countPrime(long first,long last) {
		if (first>last) {
			return 0;
		}
		if (last>max_number) {
			return -1;
		}
		int num = 0;
		for(int i=(int) first;i<=last;i++) {
			if (isPrime(i)) {
				num++;
			}
		}
		return num;
	}
}