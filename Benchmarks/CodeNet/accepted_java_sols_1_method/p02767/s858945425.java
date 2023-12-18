import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] x = new int[n];

		for(int i = 0 ; i < n ; i++) {
			x[i] = Integer.parseInt(sc.next());

		}


		int ans = (1 << 31) - 1;
		for(int i = 1 ;  i <= 100 ;  i++ ) {

			int sum = 0;
			for(int j = 0 ;  j < n ;  j++ ) {
				int tmp = Math.abs(x[j] - i);
				sum += tmp * tmp;
			}
			ans = Math.min(ans, sum);

		}
		System.out.println(ans);
	}



}