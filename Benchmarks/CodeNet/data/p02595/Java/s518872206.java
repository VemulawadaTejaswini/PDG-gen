import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();

		int count = 0;
		for (int n = 0; n < N; n++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			double d = Math.sqrt(x * x + y *y);
			if (d <= D) {
				count++;
			}
		}
		System.out.println(count);
	}
}
