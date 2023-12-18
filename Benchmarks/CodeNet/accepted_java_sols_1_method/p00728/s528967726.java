import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		while (true) {
			int n = sn.nextInt();
			if (n == 0) {
				break;
			}
			int[] point = new int[n];
			for (int i = 0; i < n; i++) {
				point[i] = sn.nextInt();
			}

			Arrays.sort(point);

			int sum = 0;
			for (int i = 1; i < point.length - 1; i++) {
				sum += point[i];
			}
			System.out.println(sum / (n - 2));
		}
	}
}