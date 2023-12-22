import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp   = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);
		String[] temp2  = scanner.nextLine().split(" ");
		Long[] mlist     = new Long[n];

		for(int i = 0; i < n; i++) {

			mlist[i] = Long.parseLong(temp2[i]);

		}

		Arrays.sort(mlist,Collections.reverseOrder());
		long sum = 0;

		for(int i = 0; i < n; i++) {

			if(i >= k) {

				sum += mlist[i];

			}


		}

		System.out.println(sum);

	}

}