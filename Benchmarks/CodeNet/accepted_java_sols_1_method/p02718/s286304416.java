import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		List<Double> list = new ArrayList<>();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			double in = sc.nextDouble();
			list.add(in);
			sum += in;
		}
		sc.close();

		double m1 = sum / (4 * m);
		double count = 0;
		for (double i : list) {
			if (i >= m1) {
				count += 1;
			}
		}
		if (count >= m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
