
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long ans = 0;
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) ans = i;
		}
		
		System.out.println(ans + n / ans - 2);
	}
}