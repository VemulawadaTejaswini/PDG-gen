import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		DecimalFormat format = new DecimalFormat("0.#");
		System.out.println(format.format(Math.floor(a * b)));
	}
}