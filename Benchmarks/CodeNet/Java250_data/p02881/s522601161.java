import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();

		long minCount = Long.MAX_VALUE;
		for(long i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				long j = n / i;
				long k = (i + j-2);
				minCount = minCount > k ? k : minCount;
			}
		}
		System.out.println(minCount);
	}

}