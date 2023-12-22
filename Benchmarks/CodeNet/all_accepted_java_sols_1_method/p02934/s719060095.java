import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		double[] nums = new double[n];
		double d = 0;

		for (int i = 0; i < n; i++) {
			nums[i] = Double.parseDouble(sc.next());
		}

		for (int i = 0; i < n; i++) {
			d += 1.0 / nums[i];
		}

		System.out.println(1.0 / d);

	}
}
