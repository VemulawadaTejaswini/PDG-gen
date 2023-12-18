import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = sc.nextInt();
		sc.close();

		long count = 0;
		for (long i = k; i <= n + 1; i++) {
			long min = 0;
			long max = 0;
			min = (i - 1) * i / 2 ;
			max = (n * i - min);
			count += (max - min + 1);
			if (count > 1_000_000_007) {
				count = count % 1_000_000_007;
			}
		}
		System.out.println(count);
	}

}
