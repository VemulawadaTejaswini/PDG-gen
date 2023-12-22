import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] value = scan.nextLine().split(" ");
		int n   = Integer.parseInt(value[0]);
		int k 	 = Integer.parseInt(value[1]);
		long count = 0;
		double temp  = 0;
		double ans = 0;
		double x = 0;

		for(int i = 1; i <= n; i++) {

			temp = i;
			count = n;

			while(temp < k) {
				temp  *= 2;
				count *= 2;
			}

			ans += 1 / (double)count;

		}

		System.out.println(ans);

	}

}
