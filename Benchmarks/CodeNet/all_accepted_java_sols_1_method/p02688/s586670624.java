
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		String array[][] = new String[n][k];

		for (int i = 0; i < k; i++) {
			int d = scan.nextInt();
			for (int h = 0; h < d; h++) {
				int j = scan.nextInt();
				array[j - 1][i] = "aaa";
			}
		}


		String[] list = {null};
		int ans =0;
		for (int b = 0; b < n; b++) {
			String[] a = array[b];

			List asList = Arrays.asList(list);
			List asList1 = Arrays.asList(a);
			Set<String> mySet = new HashSet<String>(asList);
			for (String s : mySet) {
//				System.out.println(s + " " + Collections.frequency(asList1, s));
				if(k== Collections.frequency(asList1, s)) {
					ans += 1;

				}
			}
		}


		System.out.println(ans);
	}
}