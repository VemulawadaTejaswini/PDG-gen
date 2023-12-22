import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n        = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		int t        = Integer.parseInt(tmp[0]);
		int a        = Integer.parseInt(tmp[1]);
		String[] atm = scanner.nextLine().split(" ");
		int[] list   = new int[n];
		double ans   = Integer.MAX_VALUE;
		int count    = 0;
		for(int i = 0; i < n; i++) {

			list[i]     = Integer.parseInt(atm[i]);
			double temp = t - 0.006 * list[i];


			if(ans > Math.abs(a - temp)) {

				count = i + 1;
				ans = Math.abs(a - temp);
			}

		}

		System.out.println(count);

	}
}