import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[][] AB = new long[N][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				AB[i][j] = in.nextInt();
			}
		}
		Arrays.sort(AB, (x, y) -> Long.compare(x[1], y[1]));
		int sum = 0;
		String ans = "Yes";
		for (int i = 0; i < AB.length; i++) {
			sum += AB[i][0];
			if (sum > AB[i][1]) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
		in.close();
	}
}