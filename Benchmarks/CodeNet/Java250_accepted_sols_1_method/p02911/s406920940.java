import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();

		int[] point = new int[n + 1]; // i番目の選手のポイント
		boolean[] result = new boolean[n + 1];
		Arrays.fill(point, -q+k);

		for ( int i = 1; i <= q; i++ ) {
			int num = in.nextInt();
			point[num]++;
			if ( point[num] > 0 ) result[num] = true;
		}

		for ( int i = 1; i <= n; i++ ) {
			if ( point[i] > 0 ) System.out.println("Yes");
			else System.out.println("No");

		}
		
//		for ( int i = 1; i <= n; i++ ) {
//			System.out.println(point[i]);
//		}

		in.close();
	}
}