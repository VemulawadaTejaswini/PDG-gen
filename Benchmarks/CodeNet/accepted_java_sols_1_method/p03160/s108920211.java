import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] val = new int[n];
		int[] cost = new int[n];

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			val[i] = a;
			if (i == 0) {
				cost[0] = 0;
			} else if (i == 1) {
				cost[1] = Math.abs(val[1] - val[0]);
			} else {
				cost[i] = Math.min(cost[i - 1] + Math.abs(val[i] - val[i - 1]),
						cost[i - 2] + Math.abs(val[i] - val[i - 2]));
			}
		}

		System.out.println(cost[n - 1]);
	}

}
