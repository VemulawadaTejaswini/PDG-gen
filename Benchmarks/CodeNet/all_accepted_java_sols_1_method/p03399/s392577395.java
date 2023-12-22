import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int bus = 0;
		int train = 0;

		if (a < b) {
			train = a;
		} else {
			train = b;
		}

		if (c < d) {
			bus = c;
		} else {
			bus = d;
		}

		System.out.println(bus + train);

	}

}
