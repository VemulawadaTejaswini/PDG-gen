import java.util.Scanner;

/**
 * Created by LCW on 2016-9-19.
 */

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int res = 0;
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt()-1;
		}
		for (int i = 0; i < n; i++) {
			if (x[x[i]] == i) {
				res++;
			}
		}
		System.out.println(res / 2);
	}

}
