import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double max;
		double min;
		double height;

		max = Double.NEGATIVE_INFINITY;
		min = Double.POSITIVE_INFINITY;
		while (sc.hasNext()) {
			height = sc.nextDouble();
			if (max < height) {
				max = height;
			}
			if (height < min) {
				min = height;
			}
		}
		System.out.printf("%.1f", max - min);
	}
}