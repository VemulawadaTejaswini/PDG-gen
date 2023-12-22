import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextBigDecimal()) {

				double v = sc.nextDouble();
				double t = v / 9.8;
				double y = t * t * 4.9;
				double n = Math.ceil((y + 5) / 5);

				System.out.println((int) n);
			}
		}
	}
}