import java.util.Scanner;

public class Main {
	private static String text;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		String[] lines = line.split(" ");
		int A = Integer.parseInt(lines[0]);
		int B = Integer.parseInt(lines[1]);
		int plus = A + B;
		int minus = A - B;
		int multi = A * B;
		int display;

		if (plus > minus && plus > multi)
			display = plus;
		else if (minus > plus && minus > multi)
			display = minus;
		else if(plus == minus && plus > multi)
			display = plus;
		else
			display = multi;

		System.out.println(display);
	}
}
