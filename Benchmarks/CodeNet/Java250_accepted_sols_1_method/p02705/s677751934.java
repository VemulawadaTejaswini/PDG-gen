import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final double π = 3.14159265359;

		Scanner scan = new Scanner(System.in);
		int r = Integer.parseInt(scan.next());
		double pre = 2 * π;
		double res = pre * r;

		System.out.println(res);
	}
}
