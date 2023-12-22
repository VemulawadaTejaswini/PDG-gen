import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double f = sc.nextDouble();
			for (int n = 2; ; n++) {
				if ((7 * Math.sqrt(50 * (n - 1))) / 5 >= f) {
					System.out.println(n);
					break;
				}
			}
		}

	}

}