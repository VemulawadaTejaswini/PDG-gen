import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n        = Integer.parseInt(tmp[0]);
		int k        = Integer.parseInt(tmp[1]);
		String[] tm2 = scanner.nextLine().split(" ");
		long[] klist = new long[n - k + 1];
		long[] list  = new long[n];
		long ksum    = 1;
		long nsum    = 1;



		for(int i = 0; i < k; i++) {

			 list[i] = Long.parseLong(tm2[i]);
			 ksum   *= list[i];
	//		System.out.println(k + "-" +ksum);
		}



		for(int i = k; i < n; i++) {

			list[i]  = Long.parseLong(tm2[i]);
		}
/*		for(int i = 0; i < n; i++) {

			System.out.println(list[i]);
		}
*/

		int x = n  - k;
		for(int i = 0; i < x; i++) {

			long now = ksum/list[i] * list[i + k];

			if(now > ksum) {

				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

			ksum = now;
		}
	}
}