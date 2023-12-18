import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] x = new int[3];
		int t=scan.nextInt();
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < x.length; j++) {
				x[j] = scan.nextInt();
			}
			Arrays.sort(x);
			if (x[2] * x[2] == x[1] * x[1] + x[0] * x[0]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}