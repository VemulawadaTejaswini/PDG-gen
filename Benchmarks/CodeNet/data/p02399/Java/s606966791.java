import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] count = line.split(" ");
		int a = Integer.parseInt(count[0]);
		int b = Integer.parseInt(count[1]);

		System.out.print(a / b + " ");
		System.out.print(a % b + " ");
		double f = Integer.parseInt(count[0]);
		double g = Integer.parseInt(count[1]);

		double c = f / g;

		int d = (int)(c * 100000);
		double e = ((double) d) / 100000;
		System.out.print(e);
	}

}
