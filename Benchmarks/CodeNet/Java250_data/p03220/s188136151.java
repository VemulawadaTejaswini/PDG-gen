
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int goal = scan.nextInt();
		
		int[] height = new int[n];
		double ans = Integer.MAX_VALUE;
		int x = 0;
		for (int i = 0; i < height.length; i++) {
			double ave = t - scan.nextInt() * 0.006;
			if (ans > Math.abs(goal - ave)) {
				ans = Math.abs(goal - ave);
				x = i + 1;
			}
		}
		System.out.println(x);
	}
}