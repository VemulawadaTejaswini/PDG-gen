import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number;
		double height, weight;

		while (sc.hasNext()) {
			String str[] = sc.next().split(",");
			number = Integer.valueOf(str[0]);
			weight = Double.valueOf(str[1]);
			height = Double.valueOf(str[2]);
			double bmi = weight / height / height;
			if (25.0 <= bmi) {
				System.out.println(number);
			}
		}
	}
}