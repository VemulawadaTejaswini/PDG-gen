import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double max = 0;
		double min = Double.MAX_VALUE;
		while (in.hasNext()) {
			double val = in.nextDouble();
			max = Math.max(max, val);
			min = Math.min(min, val);
		}
		System.out.println(max - min);
	}
}