import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			double f = sc.nextDouble();
			double t = f / 9.8;
			double d = 4.9 * t * t / 5 + 1;
			System.out.println(d == (int)d ? (int)d : (int)d + 1);
		}

	}

}