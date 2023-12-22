import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new File("test_1.txt"));
		// Scanner sc = new Scanner(new File("test_2.txt"));
		// Scanner sc = new Scanner(new File("in4.txt"));
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			list.add(n);			
			if (n > max)
				max = n;
		}

		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i * i <= max; i++) {
			boolean is_prime = true;
			for (int p : primes)
				if (i % p == 0) {
					is_prime = false;
					break;
				}
			if (is_prime)
				primes.add(i);
		}
		
		int ans = 0;
		for (int n : list) {
			boolean is_prime = true;
//			for (int i = 2; i * i < n; i++)
			for (int i : primes)
				if (n != i && n % i == 0)
					is_prime = false;
			if (is_prime) {
				ans++;
			}
		}
		System.out.println(ans);		
		
	}
}