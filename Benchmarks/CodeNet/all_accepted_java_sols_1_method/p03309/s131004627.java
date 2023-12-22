import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		long sum1 = 0;
		long[] b = new long[n];

		for ( int i = 0 ; i < n ; i++ ) {
			b[i] = sc1.nextLong() - ( i + 1 );
		}

		Arrays.sort(b);

		long b1 = b[n/2];

		for ( int i = 0 ; i < n ; i++ ) {
			sum1 += Math.abs(b[i] - b1);
		}

		System.out.println(sum1);

		sc1.close();

	}

}