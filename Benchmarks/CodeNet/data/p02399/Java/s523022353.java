import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] count = line.split(" ");
		int a = Integer.parseInt(count[0]);
		int b = Integer.parseInt(count[1]);

		double c = (double) a / (double) b;

		System.out.printf("%d, %d, %5f", a, b, c);
	}

}
